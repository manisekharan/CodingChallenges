package coding.general.ProtectedDemo.Package2;

import coding.general.ProtectedDemo.Package1.*;

class SubClass extends ProtectedClass{
    public static void main(String a[]){
        ProtectedClass protectedClass = new SubClass();
        protectedClass.print();
    }

    public void print(){
        System.out.println("SubClass::print");
    }
}
