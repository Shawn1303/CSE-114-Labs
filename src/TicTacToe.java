import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean firstPlayersTurn = true;
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "_";
            }
        }
        while (true) {
            printBoard(board);
            if (firstPlayersTurn) {
                System.out.print("Player1: Enter a row and column for your piece: ");
            } else {
                System.out.print("Player 2: Enter a row and column for your piece: ");
            }
            int row = in.nextInt();
            int col = in.nextInt();
            if (firstPlayersTurn) {
                boolean validTurn = takeTurn(board, row, col, "X");
                if (!validTurn) {
                    System.out.println("Invalid move.Try again.");
                    continue;
                }
            } else {
                boolean validTurn = takeTurn(board, row, col, "O");
                if (!validTurn) {
                    System.out.println("Invalid move.Try again.");
                    continue;
                }
            }
            String result = checkWin(board);
            if (result.equals("Unfinished")) {
                firstPlayersTurn = !firstPlayersTurn;
                continue;
            }
            System.out.println("\n");
            printBoard(board);
            if (result.equals("Win")) {
                if (firstPlayersTurn)
                    System.out.println("Congrats player 1! You win.");
                else
                    System.out.println("Congrats player 2! You win.");
            }
            if (result.equals("Draw")) {
                System.out.println("Draw");
            }
            break;
        }
        in.close();
    }

    public static boolean takeTurn(String[][] matrix, int row, int col, String piece){
        if(matrix[row][col].equals("O")||matrix[row][col].equals("X"))
            return false;
        else{
            matrix[row][col] = piece;
            return true;
        }
    }

    public static void printBoard(String[][] matrix){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static String checkWin(String[][] matrix){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            int inARow = 0;
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j].equals("O")||matrix[i][j].equals("X"))
                    count++;
                if(matrix[i][j].equals("O"))
                    inARow++;
                if(matrix[i][j].equals("X"))
                    inARow--;
            }
            if(Math.abs(inARow) == 3)
                return "Win";
        }
        for(int j = 0; j<matrix[0].length;j++) {
            int inACol = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j].equals("O")) ;
                inACol++;
                if (matrix[i][j].equals("X")) ;
                inACol--;
            }
            if (Math.abs(inACol) == 3)
                return "Win";
        }
        if(matrix[1][1].equals("O")||matrix[1][1].equals("X")){
            if(matrix[0][0].equals(matrix[1][1])&&matrix[1][1].equals(matrix[2][2]))
                return "Win";
            if(matrix[0][2].equals(matrix[1][1])&&matrix[1][1].equals(matrix[2][0]))
                return "Win";
        }
        if(count ==9)
            return "Draw";
        else
            return "Unfinished";
    }

}
