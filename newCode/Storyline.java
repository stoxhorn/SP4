import java.util.ArrayList;

public class Storyline {
    public static ArrayList<String> playerPos = new ArrayList<>();
    /*private static int pointer() {
        int pointer;
        pointer = IO.getUserInput();
        if (pointer == 1) {
            Storyline.kapitel1A();
        } else if (pointer ==2){
            Storyline.kapitel1B();
        } else if (pointer == 3) {
            Storyline.kapitel1C();
        } else if (pointer ==4) {
            Storyline.kapitel1D();
        } else {
            System.out.println("Det kan du ikke nu, prøv igen!");
        }
        return pointer;
    }*/

    //ArrayList<> af historien måske? Måske lave historierne om til objekter i steder for funktioner?!

    static Storyline story = new Storyline();

    public static void runStoryEvent(int i) {
        int switchInt = i;
        switch (i) {
            case 1:
                kapitel1A();
            case 2:
                goToCafeteria();
            case 3:
                kapitel1C();
            case 4:
                kapitel1D();
            case 5:
                kapitel1A2();

            default:
                System.out.println("Wrong input for runStoryEvent()");
        }
    }

    public static void clearAll() {
        for (int i = 0; i<50; i++) {
            System.out.println("     ");
        }
    }
    static Player player = new Player("",0);
    static Menu menu = new Menu();
    public static void intro() {
        boolean running = true;
        while (running) {
            System.out.println("\nDet er en dejlig sommerdag. Solen skinner, der er ikke en sky på himlen og din rygsæk er fuld af dine ny-indkøbte bøger" +
                    "\nFørste skoledag på din nye uddannelse venter dig," +
                    "\nforhåbningsfuldt træder du igennem døren til CPH-Business." +
                    "\nForan dig står der tre skilte, hvilket vil du følge?" +
                    "\n\t(1) 'Elevator'" +
                    "\n\t(2) 'Kantine' " +
                    "\n\t(3) 'Undervisningslokaler'" +
                    "\n\t(4) 'Jeg bliver stående lidt endnu'" +
                    "\n\t(5) For menu" +
                    "\n----------------------------------------------------------------------------------------------------------");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                story.kapitel1A();
            } else if (pointer == 2) {
                story.goToCafeteria();
            } else if (pointer == 3) {
                clearAll();
                System.out.println("Du er smart, så du følger selvfølgelig skiltet hvorpå der står 'DATAMATIKER'," +
                        "\nog inden du ved af det, er du ankommet i din klasse." +
                        "\nDu er kommet i god tid, så du kan sætte dig lige hvor du vil." +
                        "\nHvor vil du sidde?");
                story.kapitel1C();
            } else if (pointer == 4) {
                player.setStudyPoints(player.getStudyPoints() - 5);
                story.kapitel1D();
            } else if (pointer == 5) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }
    }

    public static void kapitel1A() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println("Du træder hen til elevatoren, hvor der i forvejen står to piger og venter." +
                    "\nElevatoren ankommer med et 'DING', og pigerne træder ombord. Der er lige plads til dig, så du skynder dig med ind i elevatoren." +
                    "\nSå snart dørene lukker, mærker du i panik, at der er en prut på vej. " +
                    "\nHvad vil du gøre?" +
                    "\n\t(1) Jeg forsøger at holde den inde, hvor svært kan det være?" +
                    "\n\t(2) Jeg prutter. Det er kun naturligt!" +
                    "\n\t(3) Jeg panikker og trykker på en tilfældig knap i elevatoren" +
                    "\n\t(4) Jeg spørger om de søde piger også skal gå på datamatiker-studiet!" +
                    "\n\t(5) For menu");

            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                story.kapitel1A1();
            } else if (pointer == 2) {
                story.kapitel1A2();
            } else if (pointer == 3) {
                story.kapitel1A3();
            } else if (pointer == 4) {
                story.kapitel1A4();
            } else if (pointer == 5) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }
    }



    private static void kapitel1A1() {
        boolean running = true;
        while (running) {

            System.out.println("PRUT");
            //     player.buySandwich();
            // player.buyCoffee();
            // player.viewInventory();
        }


    }
    private static void kapitel1A2() {
        boolean running = true;
        while (running) {
            System.out.println("PRUTTTTT!");
        }

    }
    private static void kapitel1A3() {
        boolean running = true;
        while (running) {
            System.out.println("PANIK!");
        }
    }
    private static void kapitel1A4() {
        boolean running = true;
        while (running) {
            System.out.println("Flirt!");
        }
    }
    public static void goToCafeteria() {
        boolean running = true;
        while (running) {
            System.out.println("" +
                    "\n##     ##         #        ##       ##  ########### ######  ##       ##  ######## " +
                    "\n##    ##        ## ##      ####     ##      ##        ##    ####     ##  ##       " +
                    "\n##   ##        ##   ##     ## ##    ##      ##        ##    ## ##    ##  ##       " +
                    "\n## ##         ##     ##    ##  ##   ##      ##        ##    ##  ##   ##  ##       " +
                    "\n###          ##       ##   ##   ##  ##      ##        ##    ##   ##  ##  #####    " +
                    "\n## ##       #############  ##    ## ##      ##        ##    ##    ## ##  ##       " +
                    "\n##   ##     ##         ##  ##     ####      ##        ##    ##     ####  ##       " +
                    "\n##    ##    ##         ##  ##      ###      ##        ##    ##      ###  ##       " +
                    "\n##      ##  ##         ##  ##       ##      ##      ######  ##       ##  ######## ");

            System.out.println("Du ankommer til kantinen og mødes af en dejlig duft af morgenbrød," +
                    "\nfriskbrygget kaffe og ung-drengesved. Hvad vil du gøre?" +
                    "\n\t(1) Jeg vil gerne bede om et æble til 5 kroner." +
                    "\n\t(2) Jeg vil gerne bede om en kop kaffe til 10 kroner." +
                    "\n\t(3) Jeg vil gerne bede om en sandwich til 25 kroner." +
                    "\n\t(4) Jeg forlader kantinen og vender tilbage til det sidste sted jeg var." +
                    "\n\t(5) For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                // story.kapitel1B1();
                System.out.println("Vi har desværre udsolgt vores æbler." +
                        "---------------------------------------------------------------------------------------------------");
                story.goToCafeteria();
            } else if (pointer == 2) {
                player.buyCoffee();
                story.goToCafeteria();
            } else if (pointer == 3) {
                player.buySandwich();
                story.goToCafeteria();
            } else if (pointer == 4) {
                story.kapitel1B4();
            } else if (pointer == 5) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke gøre nu, prøv igen");
            }
        }
    }

    private static void kapitel1B4() {
        boolean running = true;
        while (running) {

        }
    }
/*
    private static void getSandwich() { // Er det sådan her vi skal gøre?
        Sandwich sandwich = new Sandwich(50);
        sandwich.buySandwich();
        }
*/
    private static void buyCoffee() {
      //  player.setCoffee(player.getCoffee()+1);
    //    System.out.println("Du får en kop kaffe og har nu " + player.getCoffee() + " kopper kaffe til rådighed!");
    }

    private static void kapitel1B1() {
        boolean running = true;
        while (running) {

        }
    }

    public static void kapitel1C() {
        boolean running = true;
        while (running) {
            System.out.println("\t(1) Jeg sætter mig forrest, så kan læreren bedre se mig når jeg har fingeren oppe." +
                    "\n\t(2) Bagerst. Gerne bag den højeste i klassen, så ingen bemærker mig." +
                    "\n\t(3) Der hvor de søde piger sidder, selvfølgelig." +
                    "\n\t(4) Jeg sætter mig i vindueskarmen, og beholder mine solbriller på." +
                    "\n\t(5) For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                clearAll();
                System.out.println("Du sætter dig selvfølgelig så langt fremme som muligt." +
                        "\n---------------------------------------------------------------------------------------------------");
                player.setStudyPoints(player.getStudyPoints() + 5);

                kapitel1C5();
            } else if (pointer == 2) {
                clearAll();
                System.out.println("Nede bagved skal du sidde, så kan du håbe, at læreren ikke bemærker dig." +
                        "\n------------------------------------------------------------------------------------------------");
                kapitel1C5();
            } else if (pointer == 3) {
                clearAll();
                System.out.println("Der sidder en rigtig sød pige yderst til venstre, mon ikke hun kan bruge lidt selskab?" +
                        "\n------------------------------------------------------------------------------------------------");
                player.setStudyPoints(player.getStudyPoints() - 5);
                kapitel1C5();
            } else if (pointer == 4) {
                clearAll();
                System.out.println("De andre kan sætte sig lige hvor de vil, du sætter dig selvfølgelig i vindueskarmen, og finder din mobiltelefon frem... Instagram skal jo opdateres!" +
                        "\n------------------------------------------------------------------------------------------------");
                player.setStudyPoints(player.getStudyPoints() - 15);
                kapitel1C5();
            } else if (pointer == 5) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke gøre nu, prøv igen");
            }
        }
    }
    //bliv stående lidt endnu

    public static void kapitel1D() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println("Du tænker, hey, det kunne da være sjovt at stå her og kigge på lobbyen." +
                    "\nDer kommer flere studerende, og de fleste kigger lidt skævt på dig, men kan man klandre dem det?" +
                    "\nDu står jo trods alt bare og kigger ud i luften." +
                    "\nNu har du så gjort det i noget tid... hvad vil du så nu?" +
                    "\n\t(1)Jeg går til elevatoren." +
                    "\n\t(2)Jeg går lige i kantinen." +
                    "\n\t(3)Jeg følger skiltet hvorpå der står 'Undervisningslokaler'." +
                    "\n\t(4)Jeg står lige så godt ..." +
                    "\n\t(5)For menu.");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                player.setStudyPoints(player.getStudyPoints() - 5);
                story.kapitel1A();
            } else if (pointer == 2) {
                player.setStudyPoints(player.getStudyPoints() - 10);
                story.goToCafeteria();
            } else if (pointer == 3) {
                player.setStudyPoints(player.getStudyPoints() - 5);
                clearAll();
                System.out.println("Du er smart, så du følger selvfølgelig skiltet hvorpå der står 'DATAMATIKER'," +
                        "\nog inden du ved af det, er du ankommet i din klasse." +
                        "\nDu er kommet i god tid, så du kan sætte dig lige hvor du vil." +
                        "\nHvor vil du sidde?");
                story.kapitel1C();
            } else if (pointer == 4) {
                player.setStudyPoints(player.getStudyPoints() - 15);
                story.kapitel1D1();
            } else if (pointer == 5) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }
    }
    private void kapitel1D1() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println("Nu står du så her... hvad i alverden gør du dog det for?" +
                    "\nDu kommer i hvert fald for sent til undervisningen, og du har allerede mistet studypoints." +
                    "\nDine studypoints er derfor p.t.: " + player.getStudyPoints() + "." +
                    "\nDer er altså undervisning som venter på dig ..." +
                    "\nHvad vil du nu gøre?" +
                    "\n\t(1)Jeg går til elevatoren." +
                    "\n\t(2)Jeg er blevet sulten af at stå her, så jeg skal da i kantinen." +
                    "\n\t(3)Jeg må hellere prøve at følge de skilte der ..." +
                    "\n\t(4)Jeg står og står og står ... " +
                    "\n\t(5)For menu.");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                player.setStudyPoints(player.getStudyPoints() - 10);
                story.kapitel1A();
            } else if (pointer == 2) {
                player.setStudyPoints(player.getStudyPoints() - 15);
                story.goToCafeteria();
            } else if (pointer == 3) {
                player.setStudyPoints(player.getStudyPoints() - 10);
                clearAll();
                System.out.println("Du er smart, så du følger selvfølgelig skiltet hvorpå der står 'DATAMATIKER'," +
                        "\nog inden du ved af det, er du ankommet i din klasse." +
                        "\nDu er kommet i god tid, så du kan sætte dig lige hvor du vil." +
                        "\nHvor vil du sidde?");
                story.kapitel1C();
            } else if (pointer == 4) {
                player.setStudyPoints(player.getStudyPoints() - 25);
                story.kapitel1D2();
            } else if (pointer == 5) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }
    }
    private void kapitel1D2() {
        boolean running = true;
        while (running) {
        clearAll();
        System.out.println("Det var smart gjort ... du hygger dig virkelig her." +
                "\nDu kan nu knap nå til time i dag? Måske du skulle være blevet hjemme i sengen?" +
                "\nDine studypoints er nu: " + player.getStudyPoints() + "."+
                "\nMåske du skulle finde på noget andet at lave?"+
                "\n\t(1)Jeg går til elevatoren. Det er vist på tide." +
                "\n\t(2)Jeg er blevet sulten af at stå her, så jeg skal da i kantinen." +
                "\n\t(3)Jeg løber af sted i den retning skiltet til 'Datamatiker' peger ..." +
                "\n\t(4)Jeg bliver da stående! Hold op med at stille mig så dumme spørgsmål!" +
                "\n\t(5)For menu.");
        int pointer;
        pointer = IO.getUserInput();
        if (pointer == 1) {
            player.setStudyPoints(player.getStudyPoints()-10);
            story.kapitel1A();
        } else if (pointer ==2){
            player.setStudyPoints(player.getStudyPoints()-15);
            story.goToCafeteria();
        } else if (pointer == 3) {
            player.setStudyPoints(player.getStudyPoints()-10);
            clearAll();
            System.out.println("Du er smart, så du følger selvfølgelig skiltet hvorpå der står 'DATAMATIKER'," +
                    "\nog inden du ved af det, er du ankommet i din klasse." +
                    "\nDu er kommet i god tid, så du kan sætte dig lige hvor du vil." +
                    "\nHvor vil du sidde?");
            story.kapitel1C();
        } else if (pointer ==4) {
            player.setStudyPoints(player.getStudyPoints()-25);
            story.kapitel1D3();
        } else if (pointer ==5) {
            menu.playingMenu();
        } else {
            System.out.println("Det kan du ikke nu, prøv igen!");
        }
        }
    }

    private void kapitel1D3() {
        boolean running = true;
        while (running) {
            System.out.println("Du blev stående i lobbyen hele dagen. Til sidst kom pedellen og smed dig ud. " +
                    "Måske du skulle spille noget andet?" +
                    "\n\tGAME OVER!");
            running= false;
            }
    }

    //TODO LAV ET NAVNELEGSSPIL!

    public static void kapitel1C5() {
            System.out.println("Første time går selvfølgelig med introduktion, navneleg og andre sjove påfund. " +
                    "\nDu får i løbet af dagen danset en følelse, hørt røverhistorier fra de andre studerende" +
                    "\nog næsten åbnet din bog. Du er træt, men har ikke helt lært så meget om kodning endnu.");
            Main.io.pressEnterToContinue();
            kapitel2();

    }

    private static void kapitel2() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println(

                              "####            ###       ##########   #########    " +
                            "\n## ###         ## ##      ##      ##   ##     ##    " +
                            "\n##   ##       ##   ##     ##      ##          ##    " +
                            "\n##    ##     ##     ##    ##                  ##    " +
                            "\n##     ##   ##       ##   ##           #########    " +
                            "\n##    ##   #############  ##    ####   ##           " +
                            "\n##   ##    ##         ##  ##      ##   ##           " +
                            "\n## ###     ##         ##  ##      ##   ##           " +
                            "\n####       ##         ##  ##########   ########     " +
                            "\n");
            System.out.println("Efter den første dag på studiet, er du nu tilbage hvor du startede. " +
                    "\nBogen i din taske har endnu ikke været åbnet, men mon ikke du får lov til, at lære noget i dag?" +
                    "\nNu står du i hvert fald i lobbyen på CPH-Business igen og overvejer hvilken vej du skal tage i dag." +
                    "\nHvad gør du?" +
                    "\n\t(1)Jeg går direkte til undervisningslokalet, nu kan jeg jo vejen." +
                    "\n\t(2)Jeg tager elevatoren, det må da gå hurtigere end trapperne?" +
                    "\n\t(3)Jeg skal liiiiiige forbi kantinen først!" +
                    "\n\t(4)For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                clearAll();
                System.out.println("-----------------------------------------------------------------------------------------------");

                kapitel2A();
            } else if (pointer == 2) {
                kapitel2B();
            } else if (pointer == 3) {
                goToCafeteria();
            } else if (pointer == 4) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }
    }

    private static void kapitel2A() {
        boolean running = true;
        while (running) {
            System.out.println("Du ankommer til første time med din nye lærer, William. Han fortæller dig gladeligt om en ting som hedder variabler." +
                    "\n" +
                    "\nDet hele er meget nyt for dig, men du når at opfange, at variabler skal erklæres (declares) førend de kan benyttes. " +
                    "\nFor at gøre det, skal man først specificere variabel-typen, og herefter give den værdi som passer til dens type." +
                    "\nHvis du f.eks. skal lave en variabel af typen String (en sekvens af bogstaver), så benyttes syntaksen: " +
                    "\n\tString name = \"Arne\" " +
                    "\ntil at lave en String med navnet \"name\" og med værdien \"Arne\". " +
                    "\nFørst variebel-typen (String), så det du navngiver den (name) og slutteligt dens værdi (Arne)\n");
            player.setStudyPoints(player.getStudyPoints() + 15);
            player.setEnergyLevel(player.getEnergyLevel() - 30);
            Main.io.pressEnterToContinue();
            clearAll();
            System.out.println("Et lige tal kaldes en int (kort for en Integer). Du kan gemme dem ud fra samme syntaks som Strings." +
                    "\n\tint newNumber = 100 " +
                    "\nHer oprettes en variabel-type \"int\", med navnet \"newNumber\" og værdien \"100\"." +
                    "\n");
            Main.io.pressEnterToContinue();
            kapitel2C();
        }
    }


    private static void kapitel2B() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println("Du stiller dig hen til elevatoren. Der er tre knapper." +
                    "\nSmart som du er, kan du ikke helt huske hvilken etage undervisningen foregår på." +
                    "\nDu trykker derfor på '3'. " +
                    "\nMon ikke det var den etage du var på i går?");
            player.setEnergyLevel(player.getEnergyLevel() - 5);
            player.setStudyPoints(player.getStudyPoints() - 5);
            Main.io.pressEnterToContinue();
            clearAll();
            System.out.println("Lyset i elevatoren blinker så snart dørene er lukket i. " +
                    "\nTi sekunder senere er elevatoren gået i stå... nu står du så her i mørket og venter." +
                    "\nDer lugter forresten en smule af tis... måske der var en som troede elevatoren var et lokum?");
            Main.io.pressEnterToContinue();
            clearAll();
            player.setEnergyLevel(player.getEnergyLevel()-10);
            player.setStudyPoints(player.getStudyPoints()-10);
            System.out.println("Først efter at have holdt alarmklokken i elevatoren nede i flere minutter får du kontakt til pedellen." +
                    "\nHan kommer og hjælper dig ud, men det tager selvfølgelig en rum tid. Du går derfor glip af noget undervsining. " +
                    "\nDu er også blevet træt, og din energi er derfor p.t.: " + player.getEnergyLevel() + "." +
                    "\nMen nu kan du i det mindste skynde dig hen til din første lektion på studiet ...");
            Main.io.pressEnterToContinue();
            clearAll();
            kapitel2A();
        }
    }
    private static void kapitel2C() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println("PYHA! Ovenpå den omgang med variabler, har du vist brug for en luftforandring. " +
                    "\nDu er dog blevet lidt træt, og din energi er nu " + player.getEnergyLevel() + "." + "" +
                     "\nTil gengæld har du fået nogle studypoints, og har nu i alt: " + player.getStudyPoints() + " studypoints." +
                    "\nHvad kunne du nu tænke dig at gøre?" +
                    "\n\t(1)Der er vist nogle af dine medstuderende som talte om nogle øl?" +
                    "\n\t(2)Jeg skal direkte hjem, drikke en kop the og så sove så jeg kan være frisk til i morgen." +
                    "\n\t(3)Jeg synes jeg har hørt om nogle spændende steder her på kampus. Jeg tror liiiige jeg skal se hvad det er ..." +
                    "\n\t(4)Jeg sidder lige så godt, så jeg åbner min bog og læser videre i den ..." +
                    "\n\t(5)For menu");
            int pointer;
            pointer = IO.getUserInput();
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
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }
    }
    private static void kapitel2D() {
        boolean running = true;
        while (running) {
            player.setEnergyLevel(player.getEnergyLevel()-25);
            System.out.println("Du kommer vist til at tage ud med nogen fra studiet." +
                    "\nDet blev ... sent? Du er faktisk i tvivl, for efter to øl kan du ikke huske hvad der skete." +
                    "\nMen billederne fra Instagram lyver ikke, og ifølge dem var du med til kl. lort." +
                    "\nDin energi er derfor langt fra i top næste morgen og er nu på: " + player.getEnergyLevel() + "" +
                    "\nMon du kan klare endnu en skoledag?");
            Main.io.pressEnterToContinue();
            kapitel3();
        }
    }

    private static void kapitel2E() {
        boolean running = true;
        while (running) {
            player.setEnergyLevel(player.getEnergyLevel() + 20);
            System.out.println("Jeg tager direkte hjem, min stakkels hjerne skal restituere og genopfriskes..." +
                    "\nDu får ny energi, og din energi er nu " + player.getEnergyLevel());
            Main.io.pressEnterToContinue();
            kapitel3();
        }
    }

    private static void kapitel2F() {
        boolean running = true;
        while (running) {

        }
    }

    private static void kapitel2G() {
        boolean running = true;
        while (running) {
            clearAll();
            player.setEnergyLevel(player.getEnergyLevel()-20);
            player.setStudyPoints(player.getStudyPoints()+10);
            System.out.println("Du bliver på skolen lidt længere og hygger dig med din bog." +
                    "\nDu lærer bl.a., at man kan give variabler en 'final' værdi, så kan de ikke ændres." +
                    "\nOg om variabel-typer som 'float' (komma-tal som erklæres med et 'f' efter værdien), " +
                    "\n'char' (enkelte bogstaver, her skal værdien være i enkle situationstegn 'E' " +
                    "\nog boolean, som altid har en 'true' eller 'false' værdi." +
                    "\nDet giver selvfølgelig lidt ekstra studypoints, men kan også mærkes på din energi, du er godt træt i hovedet nu ...." +
                    "\nDu tager hjem i seng, så du kan være klar til i morgen.");
            Main.io.pressEnterToContinue();
            kapitel3();
        }
    }


    private static void kapitel3() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println(

                              "####            ###       ##########   ########     " +
                            "\n## ###         ## ##      ##      ##   ##    ##     " +
                            "\n##   ##       ##   ##     ##      ##         ##     " +
                            "\n##    ##     ##     ##    ##                 ##     " +
                            "\n##     ##   ##       ##   ##            #######     " +
                            "\n##    ##   #############  ##    ####         ##     " +
                            "\n##   ##    ##         ##  ##      ##         ##     " +
                            "\n## ###     ##         ##  ##      ##   ##    ##     " +
                            "\n####       ##         ##  ##########   ########     " +
                            "\n");

        }
    }
}

