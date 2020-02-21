package general;

import java.util.*;

public class IntToBinary {

    void convertToBinary(int number) {

        if (number == 0) {
            System.out.print(number);
        }

        int binary[] = new int[40];
        int index = 0;
        while (number > 0) {
            binary[index++] = number % 2;
            number = number / 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

    }

    void convertToBinaryStack(int number) {

        if (number == 0) {
            System.out.print(number);
        }

        Stack<Integer> stack = new Stack<>();

        int index = 0;
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
            index++;
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }

    public static int convertToDecimal(int binarynumber) {
        int decimalnumber = 0;
        int power = 0;
        while (true) {
            if (binarynumber == 0) {
                break;
            } else {
                int temp = binarynumber % 10;
                decimalnumber += temp * Math.pow(2, power);
                binarynumber = binarynumber / 10;
                power++;
            }
        }
        return decimalnumber;
    }

    public static void main(String[] args) {
        int number = 10;
        int binarynumber = 1010;
        System.out.println("Convert Decimal to Binary ");
        new IntToBinary().convertToBinary(number);
        System.out.println();
        new IntToBinary().convertToBinaryStack(number);
        System.out.println("\nTest : " + Integer.toString(number, 2));

        System.out.println("Convert Binary to Decimal ");
        System.out.println(convertToDecimal(binarynumber));
        System.out.println("Test : " + Integer.parseInt(Integer.toString(binarynumber), 2));
    }
}
