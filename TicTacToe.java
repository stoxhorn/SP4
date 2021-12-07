import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();


    public TicTacToe() {


        //laver spillepladen vha et 2d array
        char[][] gameBoard =
                {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};


            printGameBoard(gameBoard);
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Vælg placering af din brik (1-9):");
            int playerPos = scan.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)) {
                System.out.println("Der står allerede en brik på den plads, prøv igen!");
                playerPos = scan.nextInt();
            }


            placePiece(gameBoard, playerPos, "player");

            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            placePiece(gameBoard, cpuPos, "cpu");
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPositions)) {
                cpuPos = rand.nextInt(9) + 1;
            }
            printGameBoard(gameBoard);

            String result = checkWinner();
            System.out.println(result);
        }

    }


    public static void printGameBoard(char[][] gameBoard) {
        for(char[] row : gameBoard){
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else  if(user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(pos);
        }

        switch (pos) {
            case 1 :
                gameBoard[0][0] = symbol;
                break;
            case 2 :
                gameBoard[0][2] = symbol;
                break;
            case 3 :
                gameBoard[0][4] = symbol;
                break;
            case 4 :
                gameBoard[2][0] = symbol;
                break;
            case 5 :
                gameBoard[2][2] = symbol;
                break;
            case 6 :
                gameBoard[2][4] = symbol;
                break;
            case 7 :
                gameBoard[4][0] = symbol;
                break;
            case 8 :
                gameBoard[4][2] = symbol;
                break;
            case 9 :
                gameBoard[4][4] = symbol;
                break;

            default:
                break;
        }
    }
    public static String checkWinner() {
//lister som checker efter om der er markeret i de  positioner, tre på stribe = win.
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List lefCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(midRow);
        winningConditions.add(botRow);
        winningConditions.add(lefCol);
        winningConditions.add(midCol);
        winningConditions.add(rightCol);
        winningConditions.add(cross1);
        winningConditions.add(cross2);

        for(List l : winningConditions) {
            if (playerPositions.containsAll(l)) {
                return "Du vandt! Sådan!";
            }
            else if (cpuPositions.containsAll(l)) {
                return "Du tabte spillet ... pokkers også!";
            } else if (playerPositions.size()+ cpuPositions.size() == 9) {
                return  "Den blev uafgjort ...";
            }
        }
        return "";
    }
}
