package coding.general.ProtectedDemo.Package1;

public class ProtectedClass {
    protected ProtectedClass() {
    }
    public void print(){
        System.out.println("ProtectedClass::print");
    }
}

class SubClass extends ProtectedClass{
    public static void main(String a[]){
        ProtectedClass protectedClass = new SubClass();
        protectedClass.print();
    }

    public void print(){
        System.out.println("SubClass::print");
    }
}


