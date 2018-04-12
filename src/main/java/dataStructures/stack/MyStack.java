package coding.dataStructures.tree.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
    Object elements[];
    int size;
    private static final int DEFAULT_CAPACITY = 4; //static: To reduce memory foot print. We don't each instance hold a seperate reference

    MyStack(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Object obj){
        ensureCapacity();
        elements[size++] = obj;
    }

    public Object pop() {
        if(size == 0) throw new EmptyStackException(); //Needs to check and throw meaningful exception
        Object result = elements[--size];
        elements[size] = null; //Eliminate obsolete reference. Otherwise, GC will not know what objects are obsolete. Since elements is not null yet.
        return result;
    }

    private void ensureCapacity(){
        System.out.println("ensureCapacity() -> elements.length = "+elements.length+ ", size = "+size);
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size - 1);
            System.out.println("Array is doubled. Size = "+elements.length);
        }
    }
}

class StackDemo{
    public static void main(String arg[]){
        MyStack stack1 = new MyStack();
        System.out.println("Stack size : "+ stack1.size);
        stack1.push(new Integer(1));
        stack1.push(new Integer(3));
        stack1.push(new Integer(4));
        stack1.push(new Integer(5));
        stack1.push(new Integer(5));

        System.out.println("Stack size : "+ stack1.size);

        System.out.println("Pop : "+ stack1.pop());
        System.out.println("Pop : "+ stack1.pop());

        System.out.println("Stack size : "+ stack1.size);

        MyStack stack2 = new MyStack();
        System.out.println("Stack size : "+ stack2.size);
        //System.out.println("Pop : "+ stack2.pop());
        int a =1;
        System.out.println(a++);
        System.out.println(a++);
    }
}