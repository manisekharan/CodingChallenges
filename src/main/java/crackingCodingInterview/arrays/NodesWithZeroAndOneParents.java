package crackingCodingInterview.arrays;

/*
Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique integer identifier.

For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:

1   2    4
 \ /   / | \
  3   5  8  9
   \ / \     \
    6   7    11


Sample input/output (pseudodata):

parentChildPairs = [
    (1, 3), (2, 3), (3, 6), (5, 6),
    (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
]


Write a function that takes this data as input and returns two collections: one containing all individuals with zero known parents, and one containing all individuals with exactly one known parent.


Output may be in any order:

findNodesWithZeroAndOneParents(parentChildPairs) => [
  [1, 2, 4],       // Individuals with zero parents
  [5, 7, 8, 9, 11] // Individuals with exactly one parent
]

n: number of pairs in the input

*/

import java.util.*;

public class NodesWithZeroAndOneParents {
    public static void main(String[] argv) {


        int[][] parentChildPairs = new int[][] {
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
                {4, 5}, {4, 8}, {4, 9}, {9, 11}
        };

        //NodesWithZeroAndOneParents.findNodesWithZeroAndOneParents(parentChildPairs);
    }

    static void findNodesWithZeroAndOneParents(int[][]  parentChildPairs){
        int parent = 0;
        int child = 0;
        List<Integer> list = new ArrayList<>();

        for(int row=0; row < parentChildPairs.length; row ++){
            parent = parentChildPairs[row][0];
            child = parentChildPairs[row][1];
            for(int element =0; element < parentChildPairs[row].length; element++ ){
                child = parentChildPairs[element][1];
                if (parent == child){
                    break;
                }
                System.out.print(parent);
            }

        }
    }
}
