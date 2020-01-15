package general.lambda;

public interface Interface1 {
    void method1(String str);
    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    /*default int hashCode(){
        return 0;
    }*/

    static void staticMethod(){
        System.out.println("Interface1 :: staticMethod");
    }

}