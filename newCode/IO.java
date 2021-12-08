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
        } else if (userInput ==5) {
            return 5;
        }else {

            }
        return -1;
    }

    public static void clearAll() {
        for (int i = 0 ; i<50; i++) {
            System.out.printf("   ");
        }
    }

    public static void startScreen() {
        System.out.println("----------------------------------------------------------------------------------------------------------" +

                "\n####               #    ###########   #         ##         ##         #    ########### ######  ##    ##   ########  #####               " +
                "\n##  ###          ## ##      ##      ## ##      ## ##     ## ##      ## ##      ##        ##    ##   ##    ##        ##  ###             " +
                "\n##     ##       ##   ##     ##     ##   ##     ##  ##   ##  ##     ##   ##     ##        ##    ##  ##     ##        ##    ##            " +
                "\n##       ##    ##     ##    ##    ##     ##    ##   ## ##   ##    ##     ##    ##        ##    ## ##      ##        ##   ##             " +
                "\n##        ##  ##       ##   ##   ##       ##   ##    ###    ##   ##       ##   ##        ##    ###        #####     #####     -SPILLET! " +
                "\n##       ##  #############  ##  #############  ##           ##  #############  ##        ##    ## ##      ##        ##  ##              " +
                "\n##     ##    ##         ##  ##  ##         ##  ##           ##  ##         ##  ##        ##    ##  ##     ##        ##   ##             " +
                "\n##  ###      ##         ##  ##  ##         ##  ##           ##  ##         ##  ##        ##    ##   ##    ##        ##    ##            " +
                "\n####         ##         ##  ##  ##         ##  ##           ##  ##         ##  ##      ######  ##    ##   ########  ##     ##          " +
                "\n" +
                "\nVelkommen til DATAMATIKER-SPILLET! Et rollespil hvor du selv er helten! " +
                "\nGennem spændende undervisning i faget skal du forberede dig til eksamen... men pas på! " +
                "\nFor fristelserne er mange, og de faglige områder svære," +
                "\nså det gælder om at følge godt med i undervisningen, og ikke bruge for meget tid på at kigge efter piger!" +
                "\n");

        boolean running = true;
        IO.pressEnterToContinue();
        IO.clearAll();
        Storyline.intro();
        IO.getUserInput();

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
