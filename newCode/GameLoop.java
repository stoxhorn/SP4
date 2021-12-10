public class GameLoop {
    Player player;
    static IO io = new IO();

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
                "\nGennem hæsblæsende undervisning i faget, skal du forberede dig til eksamen... men pas på! " +
                "\nFor fristelserne er mange, og de faglige områder svære," +
                "\nså det gælder om at følge godt med i undervisningen, og ikke bruge for meget tid på at kigge efter piger!" +
                "\n");
                IO.pressEnterToContinue();
        System.out.println("Reglerne for DATAMATIKER-SPILLET er simple... " +
                "\n Din karakter samler Study Points ved at gå til undervisning, læse bøger eller anden aktivitet." +
                "\n Hvis du skal til eksamen, skal du samle i alt 100 Study Points. Består du eksamen har du vundet spillet!" +
                "\n Men husk at hold øje med dit energiniveau! For alle aktiviteter koster energi." +
                "\n Heldigvis kan du købe lækker med i kantinen for at få ny energi. Det koster dog penge, og livet på SU er ikke let." +
                "\n Du finder dine købte og fundne ting i din rygsæk ved hjælp af Menuen.");

        boolean running = true;
        while (running) {
            io.pressEnterToContinue();
            io.clearAll();
            Storyline.intro();

            io.getUserInput();
        }

    }
}
