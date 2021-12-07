import java.util.ArrayList;

public class Question {

    String question;
    ArrayList<String> choices;
    int answer;

    public Question(String question, ArrayList<String> choices, int answer) {
        if (answer > choices.size()) {
            throw new IllegalArgumentException("Answer can not be a number larger than amount of choices");
        }
        if (answer < 1) {
            throw new IllegalArgumentException("Answer can not be smaller than 1");
        }
        if (choices.size() < 1) {
            throw new IllegalArgumentException("there has to be at least ONE choice");
        }

        this.question = question;
        this.choices = choices;
        this.answer = answer;

    }

    @Override
    public String toString() {
        String tmp = "";

        tmp += question + "\n";
        for (String s : choices) {
            tmp += s + "\n";
        }

        return tmp;
    }

}
