package general;

import static java.lang.Math.PI;

public class ExceptionTest {
    public static void main(String a[]){
        System.out.println("Main");
        try{
            demo();
            System.out.println("after demo()");
        }catch (NullPointerException ex){
            System.out.println("Recaught : "+ex);
        }
        System.out.println("Program done");

    }

    private static void demo() {
        try{
            throw new NullPointerException("Test");
        }catch (NullPointerException ex){
            System.out.println("Exception : "+ex);
            throw ex;
        }
    }

    static {
        System.out.println("Static");
    }
}
