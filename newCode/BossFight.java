import java.util.Scanner;

public class BossFight{

    Scanner input = new Scanner(System.in);


    //quizzen starter
    public void BossFight() {
        boolean running = true;
        int[] bossFightNumber = {1, 2, 3, 4, 5};
        Player player = new Player("testPlayer");

        while (running) {
            if (bossFightNumber.equals(1)) {

                System.out.println("Dine mange anstrengelser, tårer, blod og sved har gjort, at du er klar til SP1-opgaven!" +
                        "\nFor at bestå prøven, skal du have mindst 7 korrekte svar." +
                        //hent spørgsmål til quizzen fra databasen i stedet ...
                        "\nSpørgsmål numero uno:" +
                        "\nHvad er to plus to?" +
                        "\n(1) 8" +
                        "\n(2) 27" +
                        "\n(3) 4" +
                        "\n(4) 9");

                String userInput = input.nextLine();
                if (input.equals("3")) {
                    System.out.println("KORREKT!");
                    player.setCorrectAnswers( player.getCorrectAnswers()+1 );

                } else {
                    System.out.println("FORKERT!");
                    player.setWrongAnswers(player.getWrongAnswers()+1);
                    if (player.getWrongAnswers() > 4) {
                        System.out.println("Du svarede desværre forkert på for mange spørgsmål i SP-quizzen og må tage semestret om.");
                        break;
                    }
                }
                System.out.println("Spørgsmål numero zwei" +
                        "\nHvad er otte minus 9?" +
                        "\n(A) 1" +
                        "\n(B) 2" +
                        "\n(C) 777" +
                        "\n(D) -1");

                if (input.equals("D")) {
                    System.out.println("KORREKT!");
                    player.setCorrectAnswers( player.getCorrectAnswers()+1 );
                } else {
                    System.out.println("FORKERT!");
                    player.setWrongAnswers(player.getWrongAnswers()+1);
                    if (player.getWrongAnswers() > 4) {
                        System.out.println("Du svarede desværre forkert på for mange spørgsmål i SP-quizzen og må tage semestret om.");
                        break;
                    }
                }
            }else if (bossFightNumber.equals(2)) {

                System.out.println("William er blevet lagt ned, og du har samlet dig nok erfaring til at klare dig igennem SP2-opgaven med Tess." +
                        "\n for at bestå skal du igen have mindst 7 korrekte spørgsmål." +
                        "");
            } else if (bossFightNumber.equals(3)) {
                System.out.println("Boss fight nummer 3");


            } else if (bossFightNumber.equals(4)) {
                System.out.println("Bossfight nummer 4");

            } else if (bossFightNumber.equals(5)) {
                System.out.println("eksamen...");

            }

        }
    }

}