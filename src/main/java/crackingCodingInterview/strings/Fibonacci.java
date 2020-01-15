package crackingCodingInterview.strings;

public class Fibonacci {

    int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    void fib_iterative(int n){
        int n1 = 0;
        int n2 = 1;
        while(n1 <=  n){
            System.out.print(n1 +" ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fib(10));
        new Fibonacci().fib_iterative(11);
    }
}

/*

n  = 0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	...
xn = 0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	...

The Rule is xn = xn-1 + xn-2

x9	= x9-1 + x9-2
 	= x8 + x7
 	= 21 + 13
 	= 34

The Golden Ratio = 1.61803398874989484820... (etc.). It appears many times in geometry, art, architecture and other areas.
Some artists and architects believe the Golden Ratio makes the most pleasing and beautiful shape.
 */