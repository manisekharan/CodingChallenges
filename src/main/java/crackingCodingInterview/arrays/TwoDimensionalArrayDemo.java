package crackingCodingInterview.arrays;

import java.util.*;

/** Java Program to demonstrate how to loop over two-dimensional array.
 *  We first loop to populate the array and later to print values.
 * */

public class TwoDimensionalArrayDemo{
    public static void main(String args[]) {
        int[][] board = new int[4][4];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }

        int[][] parentChildPairs = new int[][] {
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
                //{4, 5}, {4, 8}, {4, 9}, {9, 11}
        };

        for(int[] rows : parentChildPairs){
            for(int element : rows){
                System.out.print(element + "\t");
            }
            System.out.println("\n");
        }

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(parentChildPairs));
    }
}

