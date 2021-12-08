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
                    "\n\t(4) Jeg forlader kantinen og skynder mig imod undervisningslokalerne." +
                    "\n\t(5) For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                // story.kapitel1B1();
                System.out.println("Vi har desværre udsolgt vores æbler." +
                        "---------------------------------------------------------------------------------------------------");
                Main.io.pressEnterToContinue();
                story.goToCafeteria();
            } else if (pointer == 2) {
                player.buyCoffee();
                Main.io.pressEnterToContinue();
                story.goToCafeteria();
            } else if (pointer == 3) {
                player.buySandwich();
                Main.io.pressEnterToContinue();
                story.goToCafeteria();
            } else if (pointer == 4) {
                clearAll();
                story.kapitel1C();
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
                goToCafeteria2();
            } else if (pointer == 4) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }
    }

    public static void goToCafeteria2() {
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
                Main.io.pressEnterToContinue();
                story.goToCafeteria2();
            } else if (pointer == 2) {
                player.buyCoffee();
                Main.io.pressEnterToContinue();
                story.goToCafeteria2();
            } else if (pointer == 3) {
                player.buySandwich();
                Main.io.pressEnterToContinue();
                story.goToCafeteria2();
            } else if (pointer == 4) {
                story.kapitel2();
            } else if (pointer == 5) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke gøre nu, prøv igen");
            }
        }
    }
    private static void kapitel2A() {
        boolean running = true;
        while (running) {
            System.out.println("" +
                    "\n#######        ###  ##                 ##      ###       " +
                    "\n     ##       ## ##  ##               ##      ## ##      " +
                    "\n     ##      ##   ##  ##             ##      ##   ##     " +
                    "\n     ##     ##     ##  ##           ##      ##     ##    " +
                    "\n     ##    ##       ##  ##         ##      ##       ##   " +
                    "\n     ##   ##         ##  ##       ##      ##         ##  " +
                    "\n     ##  ##############   ##     ##      ##############  " +
                    "\n     ##  ##          ##    ##   ##       ##          ##  " +
                    "\n     ##  ##          ##     ## ##        ##          ##  " +
                    "\n#######  ##          ##      ###         ##          ## \n " );
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
            clearAll();
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
            clearAll();
            System.out.println("Du tænker, at det da kunne være sjovt, at gå lidt på opdagelse og måske møde nogle andre elever på skolen." +
                    "\nEfter lidt overtagelse går to af dine klassekamerater med dig. " +
                    "\nHvor vil I begive jer hen?" +
                    "\n\t(1)Vi skal se hvad der er på anden sal." +
                    "\n\t(2)Vi bevæger os imod kantinen. Vi er SULTNE!" +
                    "\n\t(3)Der var vist noget med nogle piger som læste her på kampus ..." +
                    "\n\t(4)For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                kapitel2F1();
            } else if (pointer == 2) {
                kapitel2F2();
            } else if (pointer == 3) {
                kapitel2F3();
            } else if (pointer == 4) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }
    }

    private static void kapitel2F2() {

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
                        "\n\t(4) Jeg forlader kantinen og går hjem, jeg skal være frisk til i morgen." +
                        "\n\t(5) For menu");
                int pointer;
                pointer = IO.getUserInput();
                if (pointer == 1) {
                    // story.kapitel1B1();
                    System.out.println("Vi har desværre udsolgt vores æbler." +
                            "---------------------------------------------------------------------------------------------------");
                    Main.io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 2) {
                    player.buyCoffee();
                    Main.io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 3) {
                    player.buySandwich();
                    Main.io.pressEnterToContinue();
                    story.goToCafeteria2();
                } else if (pointer == 4) {
                    story.kapitel2();
                } else if (pointer == 5) {
                    menu.playingMenu();
                } else {
                    System.out.println("Det kan du ikke gøre nu, prøv igen");
                }
            }
        }



    private static void kapitel2F1() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println("Du ankommer sammen med dine nye venner på anden sal." +
                    "\nDer går en masse studerende der med et tomt blik går rundt i en zombielignende tilstand ..." +
                    "\nAnders, din nye ven fra klassen kigger på dig og udbryder: 'Nice!'" +
                    "\nDu er nu ikke helt så sikker på, at det er top-nice at være her på anden sal ..." +
                    "\nHvad vil du gøre nu?" +
                    "\n\t(1)Jeg skal i hvert fald ikke fremstå som en kylling. Vi BLIVER!" +
                    "\n\t(2)Anden sal er vist ikke lige mig ... jeg tror, at jeg tager hjem for i dag ..." +
                    "\n\t(3)For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                kapitel2F12();
            } else if (pointer == 2) {
                clearAll();
                System.out.println("Du synes de studerende på anden sal var lidt for skræmmende ... og vender næsen hjemad.");
                Main.io.pressEnterToContinue();
                kapitel3();
            } else if (pointer == 3) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }

        }



    private static void kapitel2F12() {
        boolean running = true;
        while (running) {
            clearAll();
            player.setStudyPoints(player.getStudyPoints()-15);
            player.setEnergyLevel(player.getEnergyLevel()-15);
            System.out.println("Anders synes det er sejt, så det gør du også. Desværre var det ikke så sejt." +
                    "\nDe studerende gik rundt og så lige zombie-agtige ud fordi de har læst på CPH-business for længe." +
                    "\nEfter I har tilbragt en halv time på anden sal kan du mærke din IQ blive tocifret, og derefter halveret." +
                    "\nDu har nu " + player.getStudyPoints() + " studypoints og " + player.getEnergyLevel() + " i energi." +
                    "\nDu skynder dig hjem i seng, så du kan blive klar til næste skoledag!");
            Main.io.pressEnterToContinue();
            kapitel3();
        }
    }
    private static void kapitel2F3() {
        boolean running = true;
        while (running) {
            player.setStudyPoints(player.getStudyPoints()-5);
            player.setEnergyLevel(player.getEnergyLevel()-10);
            clearAll();
            System.out.println("Du indser alt, alt for sent, at du er datamatiker studerende, " +
                    "\nog pigerne her på kampus, vil derfor absolut ikke ses i nærheden af dig." +
                    "\nDet kunne jo være, at dit nørderi smittede?" +
                    "\nDine studypoints går en smule ned ("+ player.getStudyPoints() + ") fordi du mister selvtillid, og din energi er også en smule drænet ("+player.getEnergyLevel()+")." +
                    "\nSkuffet vender du snuden hjemad. Ingen piger til dig i dag!");
                    Main.io.pressEnterToContinue();
                    kapitel3();
        }
    }

    private static void kapitel2G() {
        boolean running = true;
        while (running) {
            clearAll();
            player.setEnergyLevel(player.getEnergyLevel()-20);
            player.setStudyPoints(player.getStudyPoints()+10);
            System.out.println("Du bliver på skolen lidt længere og hygger dig med din bog." +
                    "\n-------------------------------------------------------------------------------------------------" +
                    "\nDu lærer bl.a., at man kan give variabler en 'final' værdi, så kan de ikke ændres." +
                    "\nOg om variabel-typer som 'float' (komma-tal som erklæres med et 'f' efter værdien), " +
                    "\n'char' (enkelte bogstaver, her skal værdien være i enkle situationstegn 'E' " +
                    "\nog boolean, som altid har en 'true' eller 'false' værdi." +
                    "\nDet giver selvfølgelig lidt ekstra studypoints, men kan også mærkes på din energi, du er godt træt i hovedet nu ...." +
                    "\nDu tager hjem i seng, så du kan være klar til i morgen.\n");
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
                            "\n" +
                   "\nEndnu en dejlig dag på CPH-Business venter dig, du er spændt på at se, hvad du mon skal lære i dag." +
                   "\nI lobbyen har du nu de velkendte valgmuligheder." +
                   "\n\t(1)For at gå direkte til time." +
                   "\n\t(2)For at gå i kantinen." +
                   "\n\t(3)For at tage elevatoren." +
                   "\n\t(4)For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                clearAll();
                System.out.println("Du bevæger dig straks til time, du skulle jo nødigt gå glip af noget undervisning!");
                Main.io.pressEnterToContinue();
                kapitel3A();
            } else if (pointer == 2) {
                clearAll();
                goToCafeteria3();
            } else if (pointer == 3) {
                kapitel3B();
            }  else if (pointer == 4) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke nu, prøv igen!");
            }
        }

        }


    private static void kapitel3B() {
        clearAll();
        player.setStudyPoints(player.getStudyPoints()-5);
        player.setEnergyLevel(player.getEnergyLevel()-5);
        System.out.println("Du har enten ikke prøvet at tage elevatoren før, " +
                "\neller også lærer du ikke af dine fejl. " +
                "\nElevatoren går i stå, og du kommer for sent til time fordi du først skal have hjælp af pedellen." +
                "\nDu får fratrukket nogle studypoints og din energi bliver en smule drænet.");
        Main.io.pressEnterToContinue();
        kapitel3A();
    }

    private static void goToCafeteria3() {
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
                    "\n\t(4) Jeg forlader kantinen og skynder mig til time" +
                    "\n\t(5) For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                // story.kapitel1B1();
                System.out.println("Vi har desværre udsolgt vores æbler." +
                        "---------------------------------------------------------------------------------------------------");
                Main.io.pressEnterToContinue();
                story.goToCafeteria3();
            } else if (pointer == 2) {
                player.buyCoffee();
                Main.io.pressEnterToContinue();
                story.goToCafeteria3();
            } else if (pointer == 3) {
                player.buySandwich();
                Main.io.pressEnterToContinue();
                story.goToCafeteria3();
            } else if (pointer == 4) {
                kapitel3A();
            } else if (pointer == 5) {
                menu.playingMenu();
            } else {
                System.out.println("Det kan du ikke gøre nu, prøv igen");
            }
        }
    }
    private static void kapitel3A() {
        boolean running = true;
        while (running) {
            clearAll();
            System.out.println("Du har sådan glædet dig til den næste time. Og i dag præsenterer din lærer et nyt koncept: if/else -statements.\n" +
                    "\n ######  #########     ##  ######## ##       ########  ######## " +
                    "\n   ##    ##           ##   ##       ##       ##        ##       " +
                    "\n   ##    ##          ##    ##       ##       ##        ##       " +
                    "\n   ##    ##         ##     ##       ##       ##        ##       " +
                    "\n   ##    #####     ##      #####    ##       ########  #####    " +
                    "\n   ##    ##       ##       ##       ##             ##  ##       " +
                    "\n   ##    ##      ##        ##       ##             ##  ##       " +
                    "\n   ##    ##     ##         ##       ##             ##  ##       " +
                    "\n   ##    ##    ##          ##       ##             ##  ##       " +
                    "\n ######  ##   ##           #######  #######  ########  ####### \n ");
            Main.io.pressEnterToContinue();
            clearAll();
            System.out.println("En if/else-statement benytter et booleansk udtryk til at køre koden hvis det booleanske udtryk er sandt," +
                    "\net andet stykke kode hvis et andet booleansk udtryk er sandt osv." +
                    "\nI praksis skrives det således op:" +
                    "\nif (1<2) {" +
                    "\n\t\tkør den kode (1) som står her hvis 1<2" +
                    "\n\t} else if (2<1) {" +
                    "\n\tkør den kode (2)som står her hvis 2<1" +
                    "\n\t} else {" +
                    "\n\t\tkør den her kode (3) hvis ingen af udtrykkene er sande." +
                    "\nHvilket stykke kode vil der blive kørt?" +
                    "\n(1)" +
                    "\n(2)" +
                    "\n(3)");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {
                player.setStudyPoints(player.getStudyPoints() + 5);
                System.out.println("Det er korrekt! Du får 5 studypoints og har nu " + player.getStudyPoints() + " i alt.");
                Main.io.pressEnterToContinue();
                kapitel3A1();
            } else if (pointer == 2) {
                player.setStudyPoints(player.getStudyPoints() - 5);
                System.out.println("Det er desværre forkert, da 2 ikke er mindre end 1 ... Du mister 5 studypoints og har nu " + player.getStudyPoints() + " i alt.");
                Main.io.pressEnterToContinue();
                kapitel3A1();
            } else if (pointer == 3) {
                player.setStudyPoints(player.getStudyPoints() - 5);
                System.out.println("Det er desværre forkert. Du mister 5 studypoints og har nu "  + player.getStudyPoints() + " i alt.");
                Main.io.pressEnterToContinue();
                kapitel3A1();
            } else {
                System.out.println("Det kan du ikke gøre nu, prøv igen.");
            }

        }
    }

    private static void kapitel3A1() {
        boolean running = true;
        while (running) {
            System.out.println("Din sidemakker begynder at sidde og synge en sang... inden længe hænger den fast i hovedet på ham. " +
                    "\nDu kan allerede mærke hovedpinen begynde at melde sig på banen, men du forsøger desperat at følge med i undervisningen." +
                    "\nDin sidemakker, Michael, spørger, om I skal slå sten, saks papir om en kop kaffe." +
                    "\nHvad vil du gøre?" +
                    "\n\t(1)Jeg ignorerer ham. Jeg er her for at lære, ikke for at få venner!" +
                    "\n\t(2)Jeg siger top og begynder at slå sten saks papir med ham ...." +
                    "\n\t(3)For menu");
            int pointer;
            pointer = IO.getUserInput();
            if (pointer == 1) {

            }else if (pointer == 2) {


            } else {
                System.out.println("Det kan du ikke gøre nu, prøv igen.");
            }
        }
    }


    private static void bossFightStart() {
        ArrayList<Question> qs = Main.io.readQuestionsFromFile();
        for(Question q : qs){
            System.out.println(q);
        }
    }
}


