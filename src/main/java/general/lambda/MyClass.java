package general.lambda;

public class MyClass implements Interface1, Interface2 {

    @Override
    public void method1(String str) {
        System.out.println("MyClass method1::"+str);
    }

    @Override
    public void log(String str) {
        System.out.println("MyClass logging::"+str);
        //Interface1.print("abc");
    }

    @Override
    public void method2(String str) {

    }

    //@Override
    static void staticMethod(){
        System.out.println("MyClass :: staticMethod");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.log("test");
        myClass.method1("method1");
        Interface1.staticMethod();
        MyClass.staticMethod();
    }
}