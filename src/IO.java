import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IO {

    public static void pressEnterToContinue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tryk på ENTER for at fortsætte!");
        input.nextLine();
    }

    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput == 1) {
            return 1;
        } else if (userInput == 2) {
            return 2;
        } else if (userInput == 3) {
            return 3;
        } else if (userInput == 4) {
            return 4;
        } else if (userInput == 5) {
            return 5;
        } else if (userInput == 6) {
            return 6;
        } else {
            return -1;
        }
    }
    public static void clearAll() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }


    /**
     * Read questions from a file.
     * it's assumed a line starting with ? is the question
     * each line afterwards is a "valgmulighed"
     * the last line is marked -
     * if there is only one line between lines starting with "?" and "-" it's
     * assumed
     * there is no "valgmulihgeder"
     * and as such it is an "open" question, with many possible answers
     */
    public ArrayList<Question> readQuestionsFromFile() {

        ArrayList<Question> tmp = new ArrayList<>();

        try {
            // get path of file
            // NB: kan være Fil Stringen skal tilpasses
            Path filePath = Path.of("src/Questions.txt");

            // læser hele filen som en stor String, ikke noget med getNext eller w/e
            String content = Files.readString(filePath);

            // splitter stringen i en liste, hvert felt er opdelt ud fra "__"
            String[] questionStr = content.split("__", 0);
            // for loop of listen der er lavet af split()
            for (String str : questionStr) {

                // When calling split(), sometimes there's an empty String i need to ignore
                if (str.length() > 2) {
                    Question qTmp = createQuestion(str);
                    tmp.add(qTmp);
                }
                else{
                    // do nothing
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return tmp;
    }

        public ArrayList<StoryPointer> readStoryFromFile() {
        ArrayList<StoryPointer> temp = new ArrayList<>();
        try {
            Path filepath = Path.of("src/story.txt");

            String content = Files.readString(filepath);

            String [] storyStrings = content.split ("0x", 0);
            for (String str : storyStrings) {
                if (str.length() > 2) {
                    StoryPointer storyTemp = createStory(str);
                    temp.add(storyTemp);
                } else {
                    //
                }
            }


        } catch (Exception e) {
            System.out.println(e + " asd");
        } return temp;
    }

    /*
    * ----------------
    * "0x"startscreen\n         - ID/pointer
    * asdasdasdasdasdasdasd\n
    * asdasdasdasdasdasdasd\n
    * asdasdasdasdasdasdasdx0 - storyString
    * ----------------
    * anything within "" is not included in storyString argument/parameter, but is what was removed before passing to this function
    * */
    private StoryPointer createStory (String storyString) {

        // First line in each string is the ID/Pointer as seen in example above
        // All of the remaining part, is the story string

        // her splitter vi storyString op i, forhåbventlig, 3 dele. første del er ID, næste del er storyString, tredje del er irrelevant og skal ikke bruges
        //"0xstartScreenx0\n" +
        //"DATAMATIKERSPILLET\n" +
        //"NU STARTER HISTORIEN!x0StringSlut\n"
        String[] storyInput = storyString.split("x0", 0);
        //storyInput = {"startScreen", "DATAMATIKERSPILLET\nNU STARTER HISTORIEN!", "StringSlut"};


        if (storyInput.length<2) {
            return null;
        }
        int x = storyInput.length;

        StoryPointer returnedStory = new StoryPointer(storyInput[0], storyInput[1]);

        return returnedStory;
    }


    // helper function for readQuestionsFromFile
    private Question createQuestion(String questionStr) {

        // NB: Sometimes Windows adds a different kind of newline referenced as "\r\n",
        // instead of simply ""\n"
        String[] questionInput = questionStr.split("\r\n", 0);

        if (questionInput.length < 2) {
            return null;
        }

        int x = questionInput.length;

        // initialisere int x som -1, det vil sige den ikke har taget imod input
        int answer = -1;

        ArrayList<String> choices = new ArrayList<>();

        // iterate through every index, that is not the first and last one.
        for (int i = 1; i < x; i++) {
            if (questionInput[i].charAt(0) == '-') {
                // The line containing the answer
                answer = Integer.parseInt(questionInput[x - 1].substring(1));
            } else {
                choices.add(questionInput[i]);
            }
        }
        Question ret = new Question(questionInput[0], choices, answer);
        return ret;
    }
}
