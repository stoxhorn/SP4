public class Storyline {
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
        System.out.println("\nDet er en dejlig sommerdag. Solen skinner, der er ikke en sky på himlen og din rygsæk er fuld af dine ny-indkøbte bøger" +
                "\nFørste skoledag på din nye uddannelse venter dig," +
                "\nforhåbningsfuldt træder du igennem døren til CPH-Business." +
                "\nForan dig står der tre skilte, hvilket vil du følge?" +
                "\n\t(1) 'Elevator'" +
                "\n\t(2) 'Kantine' " +
                "\n\t(3) 'Undervisningslokaler'" +
                "\n\t(4) 'Jeg bliver stående lidt endnu'" +
                "\n\t(5) 'for menu'" +
                "\n----------------------------------------------------------------------------------------------------------");
        int pointer;
        pointer = IO.getUserInput();
        if (pointer == 1) {
            story.kapitel1A();
        } else if (pointer ==2){
            story.goToCafeteria();
        } else if (pointer == 3) {
            clearAll();
            System.out.println("Du er smart, så du følger selvfølgelig skiltet hvorpå der står 'DATAMATIKER'," +
                            "\nog inden du ved af det, er du ankommet i din klasse." +
                            "\nDu er kommet i god tid, så du kan sætte dig lige hvor du vil." +
                            "\nHvor vil du sidde?");
            story.kapitel1C();
        } else if (pointer ==4) {
            story.kapitel1D();
        } else if (pointer ==5) {
            menu.playingMenu();
        } else {
            System.out.println("Det kan du ikke nu, prøv igen!");
        }
    }

    public static void kapitel1A() {
        clearAll();
        System.out.println("Du træder hen til elevatoren, hvor der i forvejen står to piger og venter." +
                "\nElevatoren ankommer med et 'DING', og pigerne træder ombord. Der er lige plads til dig, så du skynder dig med ind i elevatoren." +
                "\nSå snart dørene lukker, mærker du i panik, at der er en prut på vej. " +
                "\nHvad vil du gøre?" +
                "\n\t(1) Jeg forsøger at holde den inde, hvor svært kan det være?" +
                "\n\t(2) Jeg prutter. Det er kun naturligt!" +
                "\n\t(3) Jeg panikker og trykker på en tilfældig knap i elevatoren" +
                "\n\t(4) Jeg spørger om de søde piger også skal gå på datamatiker-studiet!");
        int pointer;
        pointer = IO.getUserInput();
        if (pointer == 1) {
            story.kapitel1A1();
        } else if (pointer ==2){
            story.kapitel1A2();
        } else if (pointer == 3) {
            story.kapitel1A3();
        } else if (pointer ==4) {
            story.kapitel1A4();
        } else {
            System.out.println("Det kan du ikke nu, prøv igen!");
        }

    }



    private static void kapitel1A1() {
        System.out.println("PRUT");
        player.buySandwich();
     player.buyCoffee();
     player.viewInventory();



    }
    private static void kapitel1A2() {
        System.out.println("PRUTTTTT!");

    }
    private static void kapitel1A3() {
        System.out.println("PANIK!");
    }
    private static void kapitel1A4() {
        System.out.println("Flirt!");
    }

    public static void goToCafeteria(){
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
                "\n\t(4) Jeg forlader kantinen og vender tilbage til det sidste sted jeg var." );
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
        } else {
            System.out.println("Det kan du ikke gøre nu, prøv igen");
        }
    }


    private static void kapitel1B4() {

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

    }

    public static void kapitel1C() {
        System.out.println("\t(1) Jeg sætter mig forrest, så kan læreren bedre se mig når jeg har fingeren oppe." +
                "\n\t(2) Bagerst. Gerne bag den højeste i klassen, så ingen bemærker mig." +
                "\n\t(3) Der hvor de søde piger sidder, selvfølgelig." +
                "\n\t(4) Jeg sætter mig i vindueskarmen, og beholder mine solbriller på.");
        int pointer;
        pointer = IO.getUserInput();
        if (pointer == 1) {
            clearAll();
            System.out.println("Du sætter dig selvfølgelig så langt fremme som muligt." +
                    "\n---------------------------------------------------------------------------------------------------");
            player.setStudyPoints(5);
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
            player.setStudyPoints(-5);
            kapitel1C5();
        } else if (pointer == 4) {
            clearAll();
            System.out.println("De andre kan sætte sig lige hvor de vil, du sætter dig selvfølgelig i vindueskarmen, og finder din mobiltelefon frem... Instagram skal jo opdateres!" +
                    "\n------------------------------------------------------------------------------------------------");
            player.setStudyPoints(-15);
            kapitel1C5();
        } else {
            System.out.println("Det kan du ikke gøre nu, prøv igen");

        }
    }
    //bliv stående lidt endnu

    public static void kapitel1D() {

        System.out.println("" +
                "" +
                "" +
                "" +
                "");
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
                "\n\t(3)Jeg skal liiiiiige forbi kantinen først!");
        int pointer;
        pointer = IO.getUserInput();
        if (pointer == 1) {
            clearAll();
            System.out.println("-----------------------------------------------------------------------------------------------");

            kapitel2A();
        } else if (pointer ==2){
            kapitel2B();
        } else if (pointer == 3) {
            goToCafeteria();
        } else {
            System.out.println("Det kan du ikke nu, prøv igen!");
        }

    }

    private static void kapitel2A() {
        System.out.println("Du ankommer til første time med din nye lærer, William. Han fortæller dig gladeligt om en ting som hedder variabler." +
                "\n" +
                "\nDet hele er meget nyt for dig, men du når at opfange, at variabler skal erklæres (declares) førend de kan benyttes. " +
                "\nFor at gøre det, skal man først specificere variabel-typen, og herefter give den værdi som passer til dens type." +
                "\nHvis du f.eks. skal lave en variabel af typen String (en sekvens af bogstaver), så benyttes syntaksen: " +
                "\n\tString name = \"Arne\" " +
                "\ntil at lave en String med navnet \"name\" og med værdien \"Arne\". " +
                "\nFørst variebel-typen (String), så det du navngiver den (name) og slutteligt dens værdi (Arne)\n");
        player.setStudyPoints(player.getStudyPoints()+10);
        player.setEnergyLevel(player.getEnergyLevel()-30);
        Main.io.pressEnterToContinue();
        clearAll();
        System.out.println("Et lige tal kaldes en int (kort for en Integer). Du kan gemme dem ud fra samme syntaks som Strings." +
                "\n\tint newNumber = 100 " +
                "\nHer oprettes en variabel-type \"int\", med navnet \"newNumber\" og værdien \"100\"." +
                "\n");
        Main.io.pressEnterToContinue();
        kapitel2C();
    }


    private static void kapitel2B() {
    }

    private static void kapitel2C() {
        clearAll();
        System.out.println("PYHA! Ovenpå den omgang med variabler, har du vist brug for en luftforandring. " +
                "\nDu er dog blevet lidt træt, og din energi er nu " + player.getEnergyLevel() + "." +
                "\nHvad kunne du nu tænke dig at gøre?" +
                "\n\t(1)Der er vist nogle af dine medstuderende som talte om nogle øl?" +
                "\n\t(2)Jeg skal direkte hjem, drikke en kop the og så sove så jeg kan være frisk til i morgen." +
                "\n\t(3)Jeg synes jeg har hørt om nogle spændende steder her på kampus. Jeg tror liiiige jeg skal se hvad det er ..." +
                "\n\t(4)Jeg sidder lige så godt, så jeg åbner min bog og læser videre i den ...");
        int pointer;
        pointer = IO.getUserInput();
        if (pointer == 1) {
            kapitel2D();
        } else if (pointer ==2){
            kapitel2E();
        } else if (pointer == 3) {
            kapitel2F();
        } else if (pointer ==4) {
            kapitel2G();
        } else {
            System.out.println("Det kan du ikke nu, prøv igen!");
        }
    }

    private static void kapitel2D() {
    }

    private static void kapitel2E() {
        player.setEnergyLevel(player.getEnergyLevel()+20);
        System.out.println("Jeg tager direkte hjem, min stakkels hjerne skal restituere og genopfriskes..." +
                "\nDu får ny energi, og din energi er nu " + player.getEnergyLevel());
    }

    private static void kapitel2F() {
    }

    private static void kapitel2G() {
    }

}

