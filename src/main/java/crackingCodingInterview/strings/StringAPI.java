package crackingCodingInterview.strings;

public class StringAPI {

    public static void main(String[] args) {
        String string = "Testing";

        System.out.println("Length : " +string.length());

        //begIndex : the begin index, inclusive.
        System.out.println("substring(begIndex)");
        System.out.println(string.substring(0));
        System.out.println(string.substring(1));

        // the end index, exclusive.
        System.out.println("substring(begIndex, endIndex)");
        System.out.println(string.substring(0,1));
        System.out.println(string.substring(0,2));
        System.out.println(string.substring(0,string.length()));
        System.out.println(string.substring(0,string.length()-1));

        System.out.println("charAt() : "+string.charAt(0));
        System.out.println(string.indexOf("T"));

    }
}
