package crackingCodingInterview.strings;

import java.io.FileNotFoundException;
import java.io.IOException;


public class StringReverse {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "Sony";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

        //iterative method to reverse String in Java
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

        //recursive method to reverse String in Java
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

    public static String reverseBySwapping(String str) {

        char[] charStr = str.toCharArray();
        int len = str.length();
        char temp;
        for (int i = 0; i < len / 2; i++) {
            temp = charStr[i];
            charStr[i] = charStr[len - i - 1];
            charStr[len - i - 1] = temp;
        }
        return new String(charStr);
    }

    }


