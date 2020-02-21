package general;

import java.util.*;

public class ReverseInteger {


    void reverse(int number){
        List<Integer> list = new ArrayList<>();

        while(number > 0) {
            list.add(number % 10);
            number = number / 10;
        }

        list.forEach(System.out::print);

        //list.stream().forEach(System.out::print);
        //list.stream().forEach(e -> System.out.print(e));
        /*list.stream().forEach(e -> {
            if(e.intValue() > 5) {
                System.out.print(e);
            }
        });

        list.stream()
                .filter(e -> e.intValue() > 6)
                .forEach(System.out::print);*/

    }

    void reverse2(int number){

        int reversed = 0;

        while(number !=0 ){
            int digit = number%10;
            reversed = 10 * reversed + digit;
            number = number/10;
        }
        System.out.print(reversed);
    }

    public static void main(String[] args) {
        int number = -12345;
        //new ReverseInteger().reverse(number);
        new ReverseInteger().reverse2(number);
    }
}
