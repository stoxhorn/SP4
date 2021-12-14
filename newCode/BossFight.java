import java.util.ArrayList;
import java.util.Scanner;

public class BossFight{

    Scanner input = new Scanner(System.in);


    //quizzen starter
    public void BossFight() {

         IO.clearAll();
         System.out.println("Dine mange anstrengelser, tårer, blod og sved har gjort, at du er klar til SP1-opgaven!" +
         "\nFor at bestå prøven, skal du have mindst 7 korrekte svar.");




                ArrayList<Question> qs = Main.io.readQuestionsFromFile();
                for(Question newQ : qs){
                    //Hent næste spørgsmål.
                        System.out.println(newQ);
                        int pointer;
                        pointer = IO.getUserInput();

                        if (pointer == newQ.getAnswer()) {
                            Storyline.player.setCorrectAnswers(Storyline.player.getCorrectAnswers() + 1);
                            System.out.println("Det er korrekt! Du har nu " + Storyline.player.getCorrectAnswers() + " rigtige svar og " + Storyline.player.getWrongAnswers() + " forkerte svar!");

                        } else {
                            Storyline.player.setWrongAnswers(Storyline.player.getWrongAnswers() + 1);
                            System.out.println("Det er desværre forkert, du har nu svaret forkert på, " + Storyline.player.getWrongAnswers() + " spørgsmål og korrekt på " +Storyline.player.getCorrectAnswers() + " spørgsmål ...");
                            checkWrongAnswer();

                        }

                }

    }

    public void checkWrongAnswer() {
        if (Storyline.player.getWrongAnswers()>4) {
            System.out.println("Du har desværre svaret forkert på for mange spørgsmål og må tage semestret om... øv bøv!");//TODO SKriv en lidt længere gameoverSCreen
            gameOverScreen();
        } else  {
            return;
        }
    }
    public void gameOverScreen() {
        System.out.println("Du har tabt spillet!");
        System.exit(0);
    }
}