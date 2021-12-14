import org.w3c.dom.ls.LSOutput;

import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Storyline {

    static Storyline story = new Storyline();
    static Player player = new Player("");
    static Player2 player2 = new Player2("", 100, 50, 100);
    static Menu menu = new Menu();
    static IO io = new IO();
    static ArrayList<StoryPointer> storyPointers = io.readStoryFromFile();

    public static StoryPointer findPointerFromId(String ID) {
        for (StoryPointer sp : storyPointers) {
            if (sp.getID().equals(ID)) {

                return sp;
            }
        }
        return null;
    }

    public static void startScreen() {

        while (true) {
            System.out.println(findPointerFromId("startScreen"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("startScreen2"));
            io.pressEnterToContinue();
            Storyline.intro();
        }
    }

    public static void intro() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("introChapter"));
                int pointer;
                pointer = io.getUserInput();
                String playerName;
                Scanner input = new Scanner(System.in);

                if (pointer == 1) {
                    story.kapitel1A();
                } else if (pointer == 2) {
                    story.goToCafeteria1();
                } else if (pointer == 3) {
                    io.clearAll();
                    System.out.println(findPointerFromId("følgSkiltet"));

                    playerName = input.nextLine();
                    Storyline.player.setName(playerName);
                    System.out.print(findPointerFromId("navnValgtA"));
                    System.out.print(player.getName());
                    System.out.print(findPointerFromId("navnValgtB"));
                    kapitel1C();
                } else if (pointer == 4) {
                    player.setStudyPoints(player.getStudyPoints() - 5);
                    kapitel1D();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel1A() { //Træder hen til elavatoren
        boolean running = true;

        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel1AA"));
                io.pressEnterToContinue();
                System.out.println(findPointerFromId("kapitel1AB"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    story.kapitel1A1(); //Venter halv time, 2 valg igen
                } else if (pointer == 2) {
                    story.kapitel1A2(); //Man spørger og kommer til time en time efter
                } else if (pointer == 3) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel1A1() { //Man venter og venter i en halv time
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("kapitel1A1A"));
                io.pressEnterToContinue();
                System.out.println(findPointerFromId("kapitel1A1B"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    kapitel1A3();
                } else if (pointer == 2) {
                    kapitel1A4();
                } else if (pointer == 3) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel1A2() {
        boolean running = true;
        while (running) {
            System.out.println(findPointerFromId("kapitel1A1B"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("kapitel1A2"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("kapitel1A2A"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("kapitel1A2B"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("kapitel1A2C"));
            player.setEnergyLevel(player.getEnergyLevel() - 5);
            kapitel1C();
        }
    }


    public static void kapitel1A3() { //Venter endnu 30 min, ankommer til klassen
        while (true) {
            System.out.println(findPointerFromId("kapitel1A3"));
            player.setEnergyLevel(player.getEnergyLevel() - 10);
            kapitel1C();
        }
    }

    public static void kapitel1A4() {
        while (true) {

            System.out.println(findPointerFromId("kapitel1A4A"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("kapitel1A4B"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("kapitel1A4C"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("kapitel1A4D"));
            player.setEnergyLevel((player.getEnergyLevel() - 5));
            kapitel1C();
        }
    }


    public static void goToCafeteria1() {
        boolean running = true;

        while (running) {
            try {

                System.out.print(findPointerFromId("goToCafeteria1A"));
                int pointer;
                pointer = io.getUserInput();
                String playerName;
                Scanner input = new Scanner(System.in);

                if (pointer == 1) {
                    System.out.println(findPointerFromId("udsolgtÆbler"));
                    io.pressEnterToContinue();
                    goToCafeteria1();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    goToCafeteria1();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    goToCafeteria1();
                } else if (pointer == 4) {
                    io.clearAll();
                    System.out.println(findPointerFromId("følgSkiltet"));

                    playerName = input.nextLine();
                    Storyline.player.setName(playerName);
                    System.out.print(findPointerFromId("navnValgtA"));
                    System.out.println(player.getName());
                    System.out.print(findPointerFromId("navnValgtB"));
                    kapitel1C();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel1C() {

        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("kapitel1C"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    System.out.println(findPointerFromId("langtFremme"));
                    player.setStudyPoints(player.getStudyPoints() + 5);
                    kapitel1C5();
                } else if (pointer == 2) {
                    io.clearAll();
                    System.out.println(findPointerFromId("nedeBagved"));
                    kapitel1C5();
                } else if (pointer == 3) {
                    io.clearAll();
                    System.out.println(findPointerFromId("vedPigerne"));
                    player.setStudyPoints(player.getStudyPoints() - 5);
                    kapitel1C5();
                } else if (pointer == 4) {
                    io.clearAll();
                    System.out.println(findPointerFromId("iVindueskarmen"));
                    player.setStudyPoints(player.getStudyPoints() - 15);
                    kapitel1C5();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel1D() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel1D"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.setStudyPoints(player.getStudyPoints() - 5);
                    story.kapitel1A();
                } else if (pointer == 2) {
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    story.goToCafeteria1();
                } else if (pointer == 3) {
                    player.setStudyPoints(player.getStudyPoints() - 5);
                    io.clearAll();
                    System.out.println(findPointerFromId("følgSkiltet"));
                    story.kapitel1C();
                } else if (pointer == 4) {
                    player.setStudyPoints(player.getStudyPoints() - 15);
                    story.kapitel1D1();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public void kapitel1D1() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel1D1"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    story.kapitel1A();
                } else if (pointer == 2) {
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    story.goToCafeteria1();
                } else if (pointer == 3) {
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    io.clearAll();
                    System.out.println(findPointerFromId("følgSkiltet"));
                    story.kapitel1C();
                } else if (pointer == 4) {
                    player.setStudyPoints(player.getStudyPoints() - 25);
                    story.kapitel1D2();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public void kapitel1D2() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel1D2"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    story.kapitel1A();
                } else if (pointer == 2) {
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    story.goToCafeteria1();
                } else if (pointer == 3) {
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    io.clearAll();
                    System.out.println(findPointerFromId("følgSkiltet"));
                    story.kapitel1C();
                } else if (pointer == 4) {
                    player.setStudyPoints(player.getStudyPoints() - 25);
                    story.kapitel1D3();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public void kapitel1D3() {
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("kapitel1D3"));
                io.pressEnterToContinue();
                io.clearAll();
                System.out.println(findPointerFromId("kapitel1D3Fortsat"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel1D3Fortsat2"));
                    kapitel1C();
                } else if (pointer == 2) {
                    kapitel1D4();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public void kapitel1D4() {
        boolean running = true;


        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel1D4"));
                Scanner input = new Scanner(System.in);
                String userInput = input.nextLine();
                player2.setName(userInput);
                io.clearAll();
                System.out.print(findPointerFromId("kapitel1D4FortsatA"));
                System.out.print(Storyline.player2.getName());
                System.out.print(findPointerFromId("kapitel1D4FortsatB"));
                io.pressEnterToContinue();
                io.clearAll();
                System.out.println(findPointerFromId("kapitel1D4Fortsat2"));
                io.pressEnterToContinue();
                kapitel1D5();

            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public void kapitel1D5() {
        io.clearAll();
        System.out.println(findPointerFromId("kapitel1D5"));
        boolean running = true;
        int pointer;
        pointer = IO.getUserInput();
        while (running) {
            try {
                if (pointer == 1) {
                    io.clearAll();
                    player2.setAttackPower(player2.getAttackPower() + 10);
                    System.out.print(findPointerFromId("kapitel1D5SværdA"));
                    System.out.print(player2.getAttackPower());
                    System.out.print(findPointerFromId("kapitel1D5Slut"));
                    io.pressEnterToContinue();
                    kapitel1D6();
                } else if (pointer == 2) {
                    io.clearAll();
                    player2.setAttackPower(player2.getAttackPower() + 5);
                    System.out.print(findPointerFromId("kapitel1D5Bue"));
                    System.out.print(player2.getAttackPower());
                    System.out.print(findPointerFromId("kapitel1D5Slut"));
                    io.pressEnterToContinue();
                    kapitel1D6();
                } else if (pointer == 3) {
                    io.clearAll();
                    player2.setAttackPower(player2.getAttackPower() - 25);
                    System.out.print(findPointerFromId("kapitel1D5BareNæver"));
                    System.out.print(player2.getAttackPower());
                    System.out.print(findPointerFromId("kapitel1D5Slut"));
                    io.pressEnterToContinue();
                    kapitel1D6();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public void kapitel1D6() {
        Random randomizer = new Random();
        final String[] monstreOgWeirdos = {"Zombie", "Tidligere Underviser på CPH-Business", "Tiger", "Klovn", "Kæmpe edderkop", "Vampyr", "Ork", "Ninja", "Skelet", "Elverpige", "Dinosaur"};
        boolean running = true;
        String monsterName = monstreOgWeirdos[randomizer.nextInt(monstreOgWeirdos.length)];
        Monster monster = new Monster(monsterName, 50);

        while (running) {
            try {
                io.clearAll();
                System.out.println("\"Du er nu klar til at tage kampen op imod de mange monstre som findes her i DØDSSKOVEN\", siger manden." +
                        "\nInden du når at svare ham, forsvinder han for øjnene af dig i en tågedis, og ud af tågen springer en " + monsterName + "!" +
                        "\nForbered dig på kamp til døden!\n");
                io.pressEnterToContinue();
                while (monster.getHealth() > 1) {
                    System.out.println(findPointerFromId("kapitel1D6Valgmuligheder"));
                    int pointer;
                    pointer = io.getUserInput();
                    if (pointer == 1) {

                        int fightPower = randomizer.nextInt(player2.getAttackPower() / 5);
                        int monsterFightPower = randomizer.nextInt((player2.getDefensePower()) / 5);
                        player2.setHealth(player2.getHealth() - monsterFightPower);
                        monster.setHealth(monster.getHealth() - fightPower);
                        System.out.println(monsterName + " rammer dig for " + monsterFightPower + " skade, og du har nu " + player2.getHealth() + " liv tilbage!" +
                                "\nDu slår " + monsterName + " lige i fjæset! " + monsterName + " tager " + fightPower + " i skade, og har nu " + monster.getHealth() + " liv tilbage!");
                        if (player2.getHealth() < 1) {
                            System.out.println("GAME OVER!");
                        } else if (monster.getHealth() < 1) {
                            System.out.println("DØDT MONSTER!");
                            kapitel1DSlut();
                        }
                    } else if (pointer == 2) {
                        goToCafeteria1();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public void kapitel1DSlut() {
        System.out.println(findPointerFromId("kapitel1DSlut"));
        io.pressEnterToContinue();
        goToCafeteria1();
    }

    public static void kapitel1C5() {
        System.out.println(findPointerFromId("kapitel1C5"));
        player.lootBook2();
        io.pressEnterToContinue();
        kapitel2();
    }

    public static void kapitel2() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel2"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    kapitel2A();
                } else if (pointer == 2) {
                    kapitel2B();
                } else if (pointer == 3) {
                    goToCafeteria2();
                } else if (pointer == 4) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void goToCafeteria2() {
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("goToCafeteria2"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    // story.kapitel1B1();
                    System.out.println(findPointerFromId("udsolgtÆbler"));
                    io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 4) {
                    story.kapitel2();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel2A() {
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("kapitel2A"));
                player.setStudyPoints(player.getStudyPoints() + 15);
                player.setEnergyLevel(player.getEnergyLevel() - 30);
                checkEnergyLevel();
                io.pressEnterToContinue();
                io.clearAll();
                System.out.println(findPointerFromId("kapitel2AFortsat"));
                io.pressEnterToContinue();
                kapitel2C();
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }


    public static void kapitel2B() {
        boolean running = true;
        while (running) {
            io.clearAll();
            System.out.println(findPointerFromId("kapitel2B"));
            player.setEnergyLevel(player.getEnergyLevel() - 5);
            player.setStudyPoints(player.getStudyPoints() - 5);
            checkEnergyLevel();
            io.pressEnterToContinue();
            io.clearAll();
            System.out.println(findPointerFromId("kapitel2B1"));
            io.pressEnterToContinue();
            io.clearAll();
            player.setEnergyLevel(player.getEnergyLevel() - 10);
            checkEnergyLevel();
            player.setStudyPoints(player.getStudyPoints() - 10);
            System.out.println(findPointerFromId("kapitel2B2"));
            checkEnergyLevel();
            io.pressEnterToContinue();
            io.clearAll();
            kapitel2A();
        }
    }

    public static void kapitel2C() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel2C"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    kapitel2D();
                } else if (pointer == 2) {
                    kapitel2E();
                } else if (pointer == 3) {
                    kapitel2F();
                } else if (pointer == 4) {
                    kapitel2G();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel2D() {
        boolean running = true;
        while (running) {
            io.clearAll();
            player.setEnergyLevel(player.getEnergyLevel() - 25);
            System.out.println(findPointerFromId("kapitel2D"));
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitel3();
        }
    }

    public static void kapitel2E() {
        boolean running = true;
        while (running) {
            player.setEnergyLevel(player.getEnergyLevel() + 20);
            System.out.println(findPointerFromId("kapitel2E"));
            io.pressEnterToContinue();
            kapitel3();
        }
    }

    public static void kapitel2F() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel2F"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    kapitel2F1();
                } else if (pointer == 2) {
                    kapitel2F2();
                } else if (pointer == 3) {
                    kapitel2F3();
                } else if (pointer == 4) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel2F2() {

        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("kapitel2F2"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    System.out.println(findPointerFromId("udsolgtÆbler"));
                    io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 4) {
                    story.kapitel2();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }


    public static void kapitel2F1() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel2F1"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    kapitel2F12();
                } else if (pointer == 2) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel2F1Hjem"));
                    io.pressEnterToContinue();
                    kapitel3();
                } else if (pointer == 3) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }

    }


    public static void kapitel2F12() {
        boolean running = true;
        while (running) {
            io.clearAll();
            player.setStudyPoints(player.getStudyPoints() - 15);
            player.setEnergyLevel(player.getEnergyLevel() - 15);
            System.out.println(findPointerFromId("kapitel2F12"));
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitel3();
        }
    }

    public static void kapitel2F3() {
        boolean running = true;
        while (running) {
            player.setStudyPoints(player.getStudyPoints() - 5);
            player.setEnergyLevel(player.getEnergyLevel() - 10);
            io.clearAll();
            System.out.println(findPointerFromId("kapitel2F3"));
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitel3();
        }
    }

    public static void kapitel2G() {
        boolean running = true;
        while (running) {
            io.clearAll();
            player.setEnergyLevel(player.getEnergyLevel() - 20);
            player.setStudyPoints(player.getStudyPoints() + 10);
            System.out.println(findPointerFromId("kapitel2G"));
            io.pressEnterToContinue();
            checkEnergyLevel();
            kapitel3();
        }
    }


    public static void kapitel3() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel3"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel3Undervisning"));
                    io.pressEnterToContinue();
                    kapitel3A();
                } else if (pointer == 2) {
                    io.clearAll();
                    goToCafeteria3();
                } else if (pointer == 3) {
                    kapitel3B();
                } else if (pointer == 4) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel3B() {
        io.clearAll();
        player.setStudyPoints(player.getStudyPoints() - 5);
        player.setEnergyLevel(player.getEnergyLevel() - 5);
        System.out.println(findPointerFromId("kapitel3B"));
        checkEnergyLevel();
        io.pressEnterToContinue();
        kapitel3A();
    }

    public static void goToCafeteria3() {
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("goToCafeteria3"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.buyApple();
                    io.pressEnterToContinue();
                    goToCafeteria3();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    goToCafeteria3();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    goToCafeteria3();
                } else if (pointer == 4) {
                    kapitel3A();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel3A() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel3A"));
                io.pressEnterToContinue();
                io.clearAll();
                System.out.println(findPointerFromId("kapitel3Videre"));
                int pointer;
                pointer = IO.getUserInput();
                if (pointer == 1) {
                    player.setStudyPoints(player.getStudyPoints() + 5);
                    System.out.print(findPointerFromId("kapitel3AKorrekt"));
                    System.out.print(player.getStudyPoints());
                    System.out.print(findPointerFromId("kapitel3AKorrektB"));
                    io.pressEnterToContinue();
                    kapitel3A1();
                } else if (pointer == 2) {
                    player.setStudyPoints(player.getStudyPoints() - 5);
                    System.out.println(findPointerFromId("kapitel3AForkert1"));
                    io.pressEnterToContinue();
                    kapitel3A1();
                } else if (pointer == 3) {
                    player.setStudyPoints(player.getStudyPoints() - 5);
                    System.out.println(findPointerFromId("kapitel3AForkert2"));
                    io.pressEnterToContinue();
                    kapitel3A1();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel3A1() {
        boolean running = true;
        while (running) {
            try {
                IO.clearAll();
                System.out.println(findPointerFromId("kapitel3A1"));
                int pointer;
                pointer = IO.getUserInput();
                if (pointer == 1) {
                    kapitel3A2();
                } else if (pointer == 2) {
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    kapitel3A3();

                } else if (pointer == 3) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }


    public static void kapitel3A2() {
        boolean running = true;
        while (running) {
            io.clearAll();
            System.out.println(findPointerFromId("kapitel3A2"));
            io.pressEnterToContinue();
            player.setStudyPoints(player.getStudyPoints() + 25);
            player.setEnergyLevel(player.getEnergyLevel() - 25);
            System.out.print(findPointerFromId("kapitel3A2Fortsat"));
            System.out.print(player.getEnergyLevel());
            System.out.print(findPointerFromId("kapitel3A2FortsatB"));
            System.out.println(player.getStudyPoints());
            checkEnergyLevel();
            io.pressEnterToContinue();
            io.clearAll();
            System.out.println(findPointerFromId("kapitel3A2Hjem"));
            io.pressEnterToContinue();
            kapitel4();
        }
    }

    public static void kapitel3A3() {
        while (true) {
            player.setStudyPoints(player.getStudyPoints() - 5);
            System.out.println(findPointerFromId("kapitel3A3"));
            RockPaperScissors stenSaksPapir = new RockPaperScissors();
            stenSaksPapir.RockPaperScissors();
            System.out.println(findPointerFromId("kapitel3A3Slut"));
            io.pressEnterToContinue();
            kapitel4();
        }
    }

    public static void kapitel4() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel4"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel4Fortsat"));
                    io.pressEnterToContinue();
                    kapitel4A();
                } else if (pointer == 2) {
                    io.clearAll();
                    goToCafeteria4();
                } else if (pointer == 3) {
                    kapitel4B();
                } else if (pointer == 4) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel4A() {
        while (true) {
            try {
                System.out.println(findPointerFromId("kapitel4A"));
                io.pressEnterToContinue();
                System.out.println(findPointerFromId("kapitel4Afortsat"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    System.out.println(findPointerFromId("kapitel4AForkert"));
                    io.pressEnterToContinue();
                } else if (pointer == 2) {
                    System.out.println(findPointerFromId("kapitel4AForkert"));
                    io.pressEnterToContinue();
                } else if (pointer == 3) {
                    player.setStudyPoints(player.getStudyPoints() + 5);
                    System.out.println(findPointerFromId("kapitel4ARigtigt"));
                    io.pressEnterToContinue();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
                IO.clearAll();
                System.out.println(findPointerFromId("kapitel4ASlut"));
                io.pressEnterToContinue();
                kapitel5();
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel4B() {
        while (true) {
            try {
                player.setStudyPoints(player.getStudyPoints() - 5);
                System.out.println(findPointerFromId("kapitel4B"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel4BTilUndervisning"));
                    kapitel4A();
                } else if (pointer == 2) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel4BTilElevator"));
                    io.pressEnterToContinue();
                    kapitel4B1();
                } else if (pointer == 3) {
                    io.clearAll();
                    menu.playingMenu();
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel4B1() {
        System.out.println(findPointerFromId("kapitel4B1"));
        player.lootBook1();
        io.pressEnterToContinue();
        io.clearAll();
        System.out.println(findPointerFromId("kapitel4BTilUndervisning"));
        kapitel4A();
    }

    public static void goToCafeteria4() {
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("goToCafeteria4"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.buyApple();
                    io.pressEnterToContinue();
                    goToCafeteria4();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    goToCafeteria4();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    goToCafeteria4();
                } else if (pointer == 4) {
                    kapitel4A();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel5() {
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("kapitel5"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.setEnergyLevel(player.getEnergyLevel() + 15);
                    System.out.println(findPointerFromId("kapitel5Hjem"));
                    io.pressEnterToContinue();
                    kapitel6();
                } else if (pointer == 2) {
                    kapitel5B();
                } else if (pointer == 3) {
                    kapitel5C();
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel5B() {
        boolean running = true;
        while (running) {
            try {
                player.setEnergyLevel(player.getEnergyLevel() - 20);
                checkEnergyLevel();
                System.out.print(findPointerFromId("kapitel5B"));
                System.out.print(player.getEnergyLevel());
                System.out.println("");
                io.pressEnterToContinue();
                kapitel7();
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel5C() {
        boolean running = true;
        while (running) {
            try {
                io.clearAll();
                player.setEnergyLevel(player.getEnergyLevel() - 10);
                checkEnergyLevel();
                System.out.println(findPointerFromId("kapitel5C"));
                System.out.print(player.getName());
                System.out.print(findPointerFromId("kapitel5C2"));
                int pointer = IO.getUserInput();
                if (pointer == 1) {
                    player.setEnergyLevel(player.getEnergyLevel() + 5);
                    System.out.println(findPointerFromId("kapitel5CHjem"));
                    io.pressEnterToContinue();
                    kapitel6();
                } else if (pointer == 2) {
                    kapitel5C1();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel5C1() {
        io.clearAll();
        while (true) {
            try {
                player.setEnergyLevel(player.getEnergyLevel() - 25);
                checkEnergyLevel();
                System.out.println(findPointerFromId("kapitel5C1"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel5C1Hjem"));
                    io.pressEnterToContinue();
                    checkEnergyLevel();
                    kapitel7();
                } else if (pointer == 2) {
                    io.clearAll();
                    kapitel6();
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel6() {

        io.clearAll();
        while (true) {
            try {
                System.out.println(findPointerFromId("kapitel6"));
                io.pressEnterToContinue();
                io.clearAll();
                System.out.println(findPointerFromId("kapitel6Fortsat"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel6A"));
                    kappitel6A();
                } else if (pointer == 2) {
                    io.clearAll();
                    System.out.println(findPointerFromId("goToCafeteria5"));
                    goToCafeteria5();
                } else if (pointer == 3) {
                    io.clearAll();
                    System.out.println(findPointerFromId("kapitel6B"));
                    kapitel6B();
                } else if (pointer == 4) {
                    io.clearAll();
                    kapitel6C();
                } else if (pointer == 5) {
                    menu.playingMenu();
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kappitel6A() {
        io.clearAll();
        while (true) {
            System.out.println(findPointerFromId("kapitel6A"));
            player.setEnergyLevel(player.getEnergyLevel() - 5);
            player.setStudyPoints(player.getStudyPoints() - 25);
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitel7();
        }
    }

    public static void kapitel6B() {
        io.clearAll();
        while (true) {
            System.out.println(findPointerFromId("kapitel6B"));
            player.setEnergyLevel(player.getEnergyLevel() + 20);
            player.setStudyPoints(player.getStudyPoints() - 20);
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitel7();
        }
    }

    public static void kapitel6C() {
        io.clearAll();
        while (true) {
            try {
                System.out.println(findPointerFromId("kapitel6CA"));
                io.pressEnterToContinue();
                System.out.println(findPointerFromId("kapitel6CB"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    System.out.println(findPointerFromId("kapitel6BForkert"));
                    io.pressEnterToContinue();
                    kapitel6D();
                } else if (pointer == 2) {
                    System.out.println(findPointerFromId("kapitel6BKorrekt"));
                    player.setStudyPoints(player.getStudyPoints() + 10);
                    io.pressEnterToContinue();
                    kapitel6D();
                } else if (pointer == 3) {
                    System.out.println(findPointerFromId("kapitel6BForkert"));
                    io.pressEnterToContinue();
                    kapitel6D();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel6D() {
        io.clearAll();
        while (true) {
            System.out.println(findPointerFromId("kapitel6D"));
            io.pressEnterToContinue();
            System.out.println(findPointerFromId("kapitel6D1"));
            player.setEnergyLevel(+player.getEnergyLevel() - 15);
            player.setStudyPoints(player.getStudyPoints() + 25);
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitel7();
        }
    }

    public static void goToCafeteria5() {
        boolean running = true;
        while (running) {
            try {
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.buyApple();
                    io.pressEnterToContinue();
                    story.goToCafeteria5();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    story.goToCafeteria5();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    story.goToCafeteria5();
                } else if (pointer == 4) {
                    System.out.println(findPointerFromId("kapitel6B"));
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel7() {
        while (true) {
            io.clearAll();
            System.out.println(findPointerFromId("kapitel7"));
            player.setEnergyLevel(player.getEnergyLevel() + 15);
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitel8();
        }
    }

    public static void kapitel8() {
        io.clearAll();
        while (true) {
            try {
                System.out.println(findPointerFromId("kapitel8"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    kapitel8A();
                } else if (pointer == 2) {
                    goToCafeteria6();
                } else if (pointer == 3) {
                    player.setStudyPoints(player.getStudyPoints() - 15);
                    player.setEnergyLevel(player.getEnergyLevel() - 5);
                    checkEnergyLevel();
                    io.pressEnterToContinue();
                    kapitel8A();
                } else if (pointer == 4) {
                    System.out.println(findPointerFromId("kapitel8Pjæk"));
                    player.setStudyPoints(player.getStudyPoints() - 20);
                    kapitel9();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel8A() {
        while (true) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel8A"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    System.out.println(findPointerFromId("kapitel8AForkert"));
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    io.pressEnterToContinue();
                    kapitel8A1();
                } else if (pointer == 2) {
                    System.out.println(findPointerFromId("kapitel8AKorrekt"));
                    player.setStudyPoints(player.getStudyPoints() + 10);
                    io.pressEnterToContinue();
                    kapitel8A1();
                } else if (pointer == 3) {
                    System.out.println(findPointerFromId("kapitel8AForkert"));
                    player.setStudyPoints(player.getStudyPoints() - 10);
                    io.pressEnterToContinue();
                    kapitel8A1();
                } else {
                    System.out.println(findPointerFromId("DetKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel8A1() {
        io.clearAll();
        while (true) {
            System.out.println(findPointerFromId("kapitel8A1"));
            io.pressEnterToContinue();
            player.setStudyPoints(player.getStudyPoints() + 20);
            player.setEnergyLevel(player.getEnergyLevel() - 15);
            checkEnergyLevel();
            System.out.print(findPointerFromId("kapitel8A2"));
            System.out.print(player.getStudyPoints());
            System.out.print(findPointerFromId("kapitel8A3"));
            io.pressEnterToContinue();
            kapitel9();
        }
    }


    public static void goToCafeteria6() {
        boolean running = true;
        while (running) {
            try {
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.buyApple();
                    io.pressEnterToContinue();
                    goToCafeteria6();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    goToCafeteria6();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    goToCafeteria6();
                } else if (pointer == 4) {
                    System.out.println(findPointerFromId("kapitel8A"));
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel9() {
        while (true) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel9"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    kapitel9A1();
                } else if (pointer == 2) {
                    goToCafeteria7();
                } else if (pointer == 3) {
                menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }
    public static void goToCafeteria7() {
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("goToCafeteria7"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.buyApple();
                    io.pressEnterToContinue();
                    goToCafeteria7();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    goToCafeteria7();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    goToCafeteria7();
                } else if (pointer == 4) {
                    kapitel9A1();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitel9A1() {
        io.clearAll();
        System.out.println(findPointerFromId("kapitel9Undervisning"));
        io.pressEnterToContinue();
        System.out.println(findPointerFromId("kapitel9A1Del1"));
        io.pressEnterToContinue();
        System.out.println(findPointerFromId("kapitel9A1Del2"));
        io.pressEnterToContinue();
        System.out.print(findPointerFromId("kapitel9A2"));
        player.setEnergyLevel(player.getEnergyLevel()-15);
        System.out.print(player.getEnergyLevel());
        player.setStudyPoints(player.getStudyPoints()+10);
        System.out.print(findPointerFromId("kapitel9A3"));
        System.out.print(player.getStudyPoints());
        io.pressEnterToContinue();
        System.out.println(findPointerFromId("kapitel9påVejHjem"));
        io.pressEnterToContinue();
        kapitel10();
    }


    public static void kapitelJul() {
        while (true) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitelJul"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    kapitelJulA();
                } else if (pointer == 2) {
                    goToCafeteriaJUL();
                } else if (pointer == 3) {
                    kapitelJulC();
                } else if (pointer == 4) {
                    kapitelJulD();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void goToCafeteriaJUL() {
        boolean running = true;
        while (running) {
            try {
                System.out.println(findPointerFromId("goToCafeteriaJUL"));
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.buyApple();
                    io.pressEnterToContinue();
                    goToCafeteriaJUL();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    goToCafeteriaJUL();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    goToCafeteriaJUL();
                } else if (pointer == 4) {
                    kapitelJulC();
                } else if (pointer == 5) {
                   kapitelJulD();
                } else if (pointer == 6) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitelJulA() {
        while (true) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitelJulA"));
                io.pressEnterToContinue();
                System.out.println(findPointerFromId("kapitelJulAFortsat"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    System.out.println(findPointerFromId("kapitelJulAHanky"));
                    System.out.println(findPointerFromId("kapitelJulAHankyTekst"));
                    player.setEnergyLevel(player.getEnergyLevel()-15);
                    player.setStudyPoints(player.getStudyPoints()-5);
                    checkEnergyLevel();
                    io.pressEnterToContinue();
                    kapitel100();
                } else if (pointer == 2) {
                    System.out.println(findPointerFromId("kapitelJulAPANIK"));
                    player.setEnergyLevel(player.getEnergyLevel()-10);
                    checkEnergyLevel();
                    io.pressEnterToContinue();
                    kapitelJulC();
                } else if (pointer == 3) {
                    System.out.println(findPointerFromId("kapitelJulAPANIK"));
                    player.setEnergyLevel(player.getEnergyLevel()-10);
                    io.pressEnterToContinue();
                    kapitelJulD();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitelJulC() {
        while (true) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitelJulC"));

                int pointer = io.getUserInput();
                if (pointer == 1) {
                    System.out.println(findPointerFromId("kapitelJulC1"));
                    io.pressEnterToContinue();
                    kapitel100();
                } else if (pointer == 2) {
                    System.out.println(findPointerFromId("kapitelJulC2"));
                    player.setEnergyLevel(player.getEnergyLevel()+10);
                    io.pressEnterToContinue();
                    System.out.println(findPointerFromId("kapitelJulC2Fortsat"));
                    io.pressEnterToContinue();
                    kapitel100();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }

            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }

    public static void kapitelJulD() {
        while (true) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitelJulD"));

                int pointer = io.getUserInput();
                if (pointer == 1) {
                    System.out.println(findPointerFromId("kapitelJulC2Fortsat"));
                    io.pressEnterToContinue();
                    kapitel100();
                } else if (pointer == 2) {
                    System.out.println(findPointerFromId("kapitelJulD2"));
                    io.pressEnterToContinue();
                    player.lootBook3();
                    player.readBook(3);
                    io.pressEnterToContinue();
                    System.out.println(findPointerFromId("kapitelJulC2Fortsat"));
                    io.pressEnterToContinue();
                    kapitel100();

                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }

            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }


    public static void kapitel10() {
        while (true) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel11"));
                int pointer = io.getUserInput();
                if (pointer == 1) {
                    io.clearAll();
                    goToCafeteria8();
                } else if (pointer == 2) {
                    kapitel10A();
                } else if (pointer == 3) {
                    kapitel10B();
                } else if (pointer == 4) {
                    kapitel10C();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("DetErIkkeEtTal"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("DetKanDuIkkeGøreNu"));
            }
        }
    }

    public static void kapitel10A() {
        while (true) {
            try {
                io.clearAll();
                System.out.println(findPointerFromId("kapitel10A"));
                io.pressEnterToContinue();
                System.out.println(findPointerFromId("kapitel10A2"));
                int pointer = io.getUserInput();
                if (pointer==1) {
                    System.out.println(findPointerFromId("kapitel10A2Forkert"));
                    player.setStudyPoints(player.getStudyPoints()-5);
                    io.pressEnterToContinue();
                    System.out.println(findPointerFromId("kapitel10A3"));
                    player.setEnergyLevel(player.getEnergyLevel()-10);
                    checkEnergyLevel();
                    kapitelJul();
                } else if (pointer ==2) {
                    System.out.println(findPointerFromId("kapitel10A2Korrekt"));
                    player.setStudyPoints(player.getStudyPoints()+10);
                    io.pressEnterToContinue();
                    System.out.println(findPointerFromId("kapitel10A3"));
                    player.setEnergyLevel(player.getEnergyLevel()-10);
                    checkEnergyLevel();
                    kapitelJul();
                } else if (pointer ==3) {
                    System.out.println(findPointerFromId("kapitel10A2Forkert"));
                    player.setStudyPoints(player.getStudyPoints()-5);
                    io.pressEnterToContinue();
                    System.out.println(findPointerFromId("kapitel10A3"));
                    player.setEnergyLevel(player.getEnergyLevel()-10);
                    checkEnergyLevel();
                    kapitelJul();
                }else {
                        System.out.println(findPointerFromId("DetKanDuIkkeGøreNu"));
                    }
                } catch(InputMismatchException e) {
                System.out.println(findPointerFromId("DetErIkkeEtTal"));
            }
        }
    }

    public static void kapitel10B() {
        while(true) {
            io.clearAll();
            System.out.println(findPointerFromId("kapitel10B"));
            player.setEnergyLevel(player.getEnergyLevel()-15);
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitelJul();
        }
    }

    public static void kapitel10C() {
        while (true) {
            io.clearAll();
            System.out.println(findPointerFromId("kapitel10C"));
            player.setEnergyLevel(player.getEnergyLevel()-10);
            checkEnergyLevel();
            io.pressEnterToContinue();
            kapitel10A();
        }
    }

    public static void goToCafeteria8() {

        boolean running = true;
        while (running) {
            System.out.println(findPointerFromId("goToCafeteria7"));
            try {
                int pointer;
                pointer = io.getUserInput();
                if (pointer == 1) {
                    player.buyApple();
                    io.pressEnterToContinue();
                    goToCafeteria8();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    io.pressEnterToContinue();
                    goToCafeteria8();
                } else if (pointer == 3) {
                    player.buySandwich();
                    io.pressEnterToContinue();
                    goToCafeteria8();
                } else if (pointer == 4) {
                    kapitel10A();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println(findPointerFromId("detKanDuIkkeGøreNu"));
                }
            } catch (InputMismatchException e) {
                System.out.println(findPointerFromId("detErIkkeEtTal"));
            }
        }
    }


    public static void kapitel100() {
        System.out.println(findPointerFromId("kapitelslut"));
        io.pressEnterToContinue();
        if (player.getStudyPoints() >= 20) {
            System.out.print(findPointerFromId("kapitelslut2"));
            System.out.print(player.getStudyPoints());
            System.out.println(findPointerFromId("kapitelslut3"));
            io.pressEnterToContinue();
            bossFightStart();
        } else if (player.getStudyPoints() < 100) {
            System.out.print(findPointerFromId("kapitelslut2"));
            System.out.print(player.getStudyPoints());
            System.out.print(findPointerFromId("kapitelslut4"));
            io.pressEnterToContinue();
            BossFight bossFight = new BossFight();
            bossFight.gameOverScreen();
        }
    }

    public static void checkEnergyLevel() {
        if (player.getEnergyLevel() < 0) {
            System.out.println("Du har ikke mere energi! Øv! Du glemte vist at gå i kantinen og spise mad?");
            io.pressEnterToContinue();
            BossFight boosfight = new BossFight();
            boosfight.gameOverScreen();
        }
    }

    public static void bossFightStart() {
        BossFight bossfight = new BossFight();
        bossfight.BossFight();
    }
}


