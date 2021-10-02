public class CheckerBoard {
    public static void main(String[] args) {
        int[][] checkerBoard = new int[8][8];
        for (int i = 0; i < checkerBoard.length; i++) {
            for (int j = 0; j < checkerBoard[0].length; j++) {
                checkerBoard[i][j] = (int) (Math.round(Math.random()));
            }
        }
        for (int[] rows : checkerBoard) {
            for (int elem : rows) {
                System.out.print(elem);
            }
            System.out.println();
        }
        checkRow(checkerBoard);
        checkColumn(checkerBoard);
        checkMajorDiagonal(checkerBoard);
        checkMinorDiagonal(checkerBoard);
    }

    public static void checkRow(int[][] checkerBoard) {
        for (int i = 0; i < checkerBoard.length; i++) {
            int initial = checkerBoard[i][0];
            for (int j = 0; j < checkerBoard[0].length; j++) {
                if (checkerBoard[i][j] != initial) {
                    break;
                }
                if (j == checkerBoard[0].length - 1) {
                    System.out.println("All " + initial + "'s on " + (i + 1) + " row");
                }
            }
        }
    }

    public static void checkColumn(int[][] checkerBoard) {
        for (int j = 0; j < checkerBoard[0].length; j++) {
            int initial = checkerBoard[0][j];
            for (int i = 0; i < checkerBoard.length; i++) {
                if (checkerBoard[i][j] != initial) {
                    break;
                }
                if (i == checkerBoard.length - 1) {
                    System.out.println("All " + initial + "'s on " + (j + 1) + " column");
                }
            }
        }
    }

    public static void checkMajorDiagonal(int[][] checkerBoard) {
        int initial = checkerBoard[0][0];
        for (int i = 0; i < checkerBoard.length; i++) {
            if (checkerBoard[i][i] != initial) {
                break;
            }
            if (i == checkerBoard.length - 1) {
                System.out.println("All " + initial + "'s on major diagonal");
            }
        }
    }

    public static void checkMinorDiagonal(int[][] checkerBoard) {
        int initial = checkerBoard[0][7];
        for (int[] ints : checkerBoard) {
            for (int j = 7; j > -1; j--) {
                if (ints[j] != initial) {
                    break;
                }
                if (j == 0) {
                    System.out.println("All " + initial + "'s on minor diagonal");
                }
            }
        }
    }
}