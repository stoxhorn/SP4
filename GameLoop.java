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

        boolean running = true;
        while (running) {
            io.pressEnterToContinue();
            io.clearAll();
            Storyline.intro();

            io.getUserInput();
        }

    }
}
