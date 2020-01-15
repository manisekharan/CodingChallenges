package general;

import com.sun.org.apache.regexp.internal.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'minSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY num
     *  2. INTEGER k
     */

    public static int minSum(List<Integer> num, int k) {
        int sum = 0;
        int reducedValue = 0;
        int n = num.size();

        for (int i= 0; i< k; i++){
            int index = new Random().nextInt(n);
            int element = num.get(index);
            System.out.print("index : "+index+" element : "+element);
            System.out.print(" divide : "+element/2f);
            System.out.print(" ceiling : "+(int)Math.ceil(element/2f));
            System.out.println();
            reducedValue = (int)Math.ceil(num.get(index)/2f);
            num.set(index, reducedValue);
        }

        for(Integer d : num)
            sum += d;
        return (sum);
    }
}

public class SumOfMinArray {
    public static void main(String[] args) throws IOException {

        List<Integer> num = new ArrayList<Integer>(){
            {
                add(10);
                add(20);
                add(7);
            }
        };

        int k = 4;

        int min = new Result().minSum(num, k);

        System.out.println(min);

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> num = IntStream.range(0, numCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.minSum(num, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}


/*

    public static int minSum(List<Integer> num, int k) {
        // Write your code here
        int sum = 0;
         for(int i=0; i < k; i++){
            sum += num.get(i);
        }
    //Arrays.sort(num);

    int min = num.get(0);
    int max = 0;

    int n = num.size();

        for (int i= n-1; i>=1; i--){
                int number = num.get(i);
                int total = number + min;
                int j;
                for(j = 2; j <= number; j++){
                if(number % j == 0){
                int d = j;
                int now = (number / d) + (min * d);
                int reduce = total - now;
                if (reduce > max){
                max = reduce;
                }
                }
                }
                }
                return (sum - max);
                }
 */