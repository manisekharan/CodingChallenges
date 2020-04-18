package dataStructures.map;

import java.util.*;

public class CountWords {

    static void countWords(String sentence) {
        String words[] = sentence.split(" ");
        Map<String, Integer> myMap = new HashMap<>();

        for (String word : words) {
            Integer frequency = myMap.get(word);
            myMap.put(word, (null == frequency) ? 1 : frequency+1 );
        }

        /*for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }*/

        myMap.entrySet().stream()
                .filter(x -> "2".equals(x.getValue().toString()))
                .forEach( x -> System.out.println("Key : " + x.getKey() + " Value : " + x.getValue()));

    }

    public static void main(String[] args) {
        String sentence = "I not a child with a child";
        countWords(sentence);
    }
}
