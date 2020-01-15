package general;

interface A{
    int f();
}
interface B{
    int f();
}
class TwoInterfacesImpl implements A, B{
    public static void main(String... args) throws Exception{
       new TwoInterfacesImpl().f();
    }

    //@Override
    public int f() { // from which interface A or B
        System.out.printf("Test");
        return 0;
    }
}