// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.*;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int numberAmazonGoStores(int rows, int column, List<List<Integer> > grid)
    {
        // WRITE YOUR CODE HERE
        int[][] inputGrid = new int[rows][column];
        for(int i=0; i<rows; i++){
            List<Integer> inputRow = grid.get(i);
            for(int j=0; j<column; j++){
                inputGrid[i][j] = inputRow.get(j);
            }
        }


        return countBuildings(inputGrid, rows, column);
    }
    // METHOD SIGNATURE ENDS

    int countBuildings(int grid[][], int rows, int column){
        boolean checked[][] = new boolean[rows][column];

        int count = 0;

        for(int i=0; i < rows; ++i){
            for(int j=0; j < column; ++j){
                if(grid[i][j] == 1 && !checked [i][j]){
                    depthFirstSerch(grid, i, j, checked);
                    ++count;
                    System.out.println(count);
                }
            }
        }

        return count;
    }

    void depthFirstSerch(int grid[][], int rows, int column, boolean checked[][]){
        int rowNum[] = new int[] {-1,-1,-1, 0,0,1,1,1};
        int colNum[] = new int[] {-1,0,1,-1,1,-1,0,1};

        checked[rows][column] = true;

        for(int k=0; k < 8; ++k){
            if(isValid(grid, rows + rowNum[k], column+colNum[k], checked, rows, column)){
                depthFirstSerch(grid, rows + rowNum[k], column + colNum[k], checked);
            }
        }
    }

    boolean isValid(int grid[][], int row, int col, boolean checked[][], int rows, int column){
        return (row >=0 ) && (row < rows) && (col >=0 ) && (col < column) &&
                (grid[row][col] == 1 ) && !checked[row][col];
    }

    public static void main(String[] args) {
        int rows = 4;
        int column = 4;
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<Integer>(Arrays.asList(1,1,0,0)));
        grid.add(new ArrayList<Integer>(Arrays.asList(0,0,0,0)));
        grid.add(new ArrayList<Integer>(Arrays.asList(0,0,1,1)));
        grid.add(new ArrayList<Integer>(Arrays.asList(0,0,0,0)));
        System.out.println(new Solution().numberAmazonGoStores(rows, column, grid));
    }
}