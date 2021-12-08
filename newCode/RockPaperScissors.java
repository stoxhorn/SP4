import java.util.Scanner;

public class RockPaperScissors {
    //Denne klasse er lidt fedtmule. Hvis man har tid og lyst er man velkommen til forbedre det :)

    public static void main(String[] args) {

        int playerScore = 0;
        int ComputersScore = 0;
        String usersChoice;
        String Winner;
        String Loser;
        Scanner input = new Scanner(System.in);

        System.out.println("Sten, saks, papir! " +
                "\n Skriv hvilken du vælger!");

        while (true) {
            int computersChoice = (int) ((Math.random() * (3 - 1 + 1)) + 1);
            //int computersChoice = 1; //Bruges kun til at teste


            if (playerScore == 3) {
                Winner = Storyline.player.getName();
                Loser = "Kasper";
                System.out.println("Vinderen er " + Winner + " og taberen er " + Loser + ".");
                break;
            }

            if (ComputersScore == 3) {
                Winner = "Kasper";
                Loser = Storyline.player.getName();
                System.out.println("Vinderen er " + Winner + " og taberen er " + Loser + ".");
                break;
            }

            usersChoice = input.nextLine();

            if ((computersChoice == 1) && (usersChoice.equalsIgnoreCase("Sten"))) {
                System.out.println(" vs Sten");
                System.out.println("Uafgjort");
                System.out.println("Din score - " + playerScore + " vs " + ComputersScore + " - Kasper's score");
            } else if ((computersChoice == 1) && (usersChoice.equalsIgnoreCase("papir"))) {
                System.out.println(" vs Sten");
                System.out.println("Du vandt!");
                playerScore++;
                System.out.println("Din score - " + playerScore + " vs " + ComputersScore + " - Kasper's score");
            } else if ((computersChoice == 1) && (usersChoice.equalsIgnoreCase("Saks"))) {
                System.out.println(" vs Sten");
                System.out.println("Du tabte");
                ComputersScore++;
                System.out.println("Din score - " + playerScore + " vs " + ComputersScore + " - Kasper's score");
            } else if ((computersChoice == 2) && (usersChoice.equalsIgnoreCase("Sten"))) {
                System.out.println(" vs papir");
                System.out.println("Du tabte");
                ComputersScore++;
                System.out.println("Din score - " + playerScore + " vs " + ComputersScore + " - Kasper's score");
            } else if ((computersChoice == 2) && (usersChoice.equalsIgnoreCase("papir"))) {
                System.out.println(" vs papir");
                System.out.println("Uafgjort");
            } else if ((computersChoice == 2) && (usersChoice.equalsIgnoreCase("Saks"))) {
                System.out.println(" vs papir");
                System.out.println("Du vandt");
                playerScore++;
                System.out.println("Din score - " + playerScore + " vs " + ComputersScore + " - Kasper's score");
            } else if ((computersChoice == 3) && (usersChoice.equalsIgnoreCase("Sten"))) {
                System.out.println(" vs Saks");
                System.out.println("Du vandt!");
                playerScore++;
                System.out.println("Din score - " + playerScore + " vs " + ComputersScore + " - Kasper's score");
            } else if ((computersChoice == 3) && (usersChoice.equalsIgnoreCase("papir"))) {
                System.out.println(" vs Saks");
                System.out.println("Du tabte");
                ComputersScore++;
                System.out.println("Din score - " + playerScore + " vs " + ComputersScore + " - Kasper's score");
            } else if ((computersChoice == 3) && (usersChoice.equalsIgnoreCase("Saks"))) {
                System.out.println(" vs Saks");
                System.out.println("Uafgjort");
            }
        }
    }
}
