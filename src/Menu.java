import java.util.Scanner;

public class Menu {
    public static int mainMenu() {
        boolean running = true;
        while (running) {
            System.out.println("Hvad kunne du tænke dig at gøre?" +
                    "\n\t(1)Start nyt spil" +
                    "\n\t(2)Fortsæt eksisterende spil" +
                    "\n\t(3)Afslut spil");
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            if (userInput == 1) {
                //start new game
                return 1;
            } else if (userInput == 2) {
                return 2;
            } else if (userInput == 3) {
                return 3;
            } else {
                System.out.println("Det kan du vist ikke gøre! Prøv igen!");
            }

        } return -1;
    }

    public static int playingMenu() {
        boolean running = true;
        while (running) {
            System.out.println("Hvad kunne du tænke dig at gøre?" +
                    "\n\t(1) Fortsæt spil." +
                    "\n\t(2) Gem spil." +
                    "\n\t(3) Se hvad du har med i rygsækken i dag." +
                    "\n\t(4) Se information om din karakter" +
                    "\n\t(5) Afslut spil.");
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            if (userInput == 1) {
                return 1;
            } else if (userInput == 2) {
                return 2;
            } else if (userInput == 3) {
                Storyline.player.viewInventory();
                IO.pressEnterToContinue();
                return 3;
            } else if (userInput == 4) {
                 System.out.println("Her kan du se oplysninger om din karakter. \n" +
                         "Dit navn er "+ Storyline.player.getName() + " og du har følgende stats: \n" +
                         "Studypoints: " +Storyline.player.getStudyPoints() + "\n" +
                         "Energi niveau: " + Storyline.player.getEnergyLevel() + "\n" +
                         "Penge: " + Storyline.player.getMoney());

                 IO.pressEnterToContinue();
                return 4;
            } else if (userInput == 5) {
                return 5;
            }else {
                    System.out.println("Det kan du vist ikke gøre! Prøv igen!");
                }
            } return -1;
    }
}
