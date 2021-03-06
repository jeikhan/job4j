package ru.job4j.array;

/**
 * MatrixCheck проверяет элементы двумерного массива
 * @author Evgeniy Kapaev
 * @version 1.2
 */
public class MatrixCheck {

    /**
     * isWin проверяет элементы массива по диагонали
     * сверяя их с начальным элементом находящемся в
     * ячейке [0][0].
     * @param board - массив
     * @return result - возвращает true или false
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int x = 0;
        int y = 0;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                if (board[cell][cell] == 'X') {
                    if (board[row][cell] == 'X') {
                        x++;
                    }
                    if (board[cell][row] == 'X') {
                        y++;
                    }
                    if (x == board.length || y == board.length) {
                        result = true;
                        break;
                    }
                }
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
