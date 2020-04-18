package hackerrank;


import junit.framework.*;

import java.io.*;
import java.util.*;

public class sockPairCount {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int pairCount = 0;
        Map<Integer, Integer> myMap = new HashMap<>();

        for (Integer element : ar) {
            Integer frequency = myMap.get(element);
            myMap.put(element, (null == frequency) ? 1 : frequency+1 );
        }

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if(entry.getValue() % 2 >= 0){
                pairCount +=  (entry.getValue()/2);
            }
        }

        return pairCount;

    }

    public static void main(String[] args) throws IOException {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        TestCase.assertEquals(3, sockMerchant(n, ar));
    }
}
