package general;

public class Recursion {
    public static void main(String a[]){
        int sum = add(5);
        System.out.println("Sum : "+sum);
        //int fact = factorial(4);
        //System.out.println("Factorial : "+fact);
    }

    private static int add(int n) {
        if (n == 1){
            return 1;
        }
        return n + add(n-1);
    }

    private static int factorial(int n){
        if ( n ==0 )
            return 1;
        return n * factorial(n-1);
    }
}
