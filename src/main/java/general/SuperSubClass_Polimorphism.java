package general;

public class SuperSubClass_Polimorphism {

    public static void main(String a[]) {
        SuperClass superObject = new SuperClass();
        superObject.method();

        SubClass subObject = new SubClass();
        subObject.method();


        SuperClass refObj = new SubClass();
        refObj.method();
        System.out.println("refObj.i ; "+refObj.i);
    }

}

class SuperClass{
    int i = 1;
    public void method(){
        System.out.println("Super Class Method : "+i);
    }
}

class SubClass extends SuperClass{
    int i = 2;
    public void method(){
        System.out.println("Sub Class Method : "+i);
    }
}