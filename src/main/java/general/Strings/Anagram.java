package general.Strings;

import java.util.*;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){

        Map<String, Integer> strMap = new HashMap<>();

        for(int i=0; i < s1.length(); i++){

            String ch = String.valueOf(s1.charAt(i));

            Integer frequency = strMap.get(ch);

            strMap.put(ch, (frequency == null)? 1 : frequency+1);
        }

        for(int i=0; i < s2.length(); i++){

            String ch = String.valueOf(s2.charAt(i));

            Integer frequency = strMap.get(ch);

            //System.out.println(ch+":"+frequency);

            if(frequency == null || frequency==0){
                return false;
            }else{
                strMap.put(ch, frequency-1);
                if(strMap.get(ch) ==0 ){
                    strMap.remove(ch);
                }
            }

        }

        return strMap.isEmpty();
    }

    public static boolean isAnagramXOR(String s1, String s2)
    {
        // Remove all the white space, convert to lower case & character array
        char[] arr1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        if (arr1.length != arr2.length)
            return false;

        int xor = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println("xor : "+xor+", arr1 = "+arr1[i]+", arr2 = "+arr2[i]);
            xor ^= arr1[i] ^ arr2[i];
            System.out.println("xor : "+xor+", arr1 = "+arr1[i]+", arr2 = "+arr2[i]);
            System.out.println("-----------------------------------");

        }

        return xor == 0 ? true: false;
    }

    public static void main(String[] args) {
        String s1 = "steel";
        String s2 = "stool";

        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagramXOR(s1, s2));

    }
}
