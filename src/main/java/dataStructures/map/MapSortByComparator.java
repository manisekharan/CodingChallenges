package dataStructures.map;

import java.util.*;

public class MapSortByComparator {

    public static void main(String[] args) {

        Map<Integer, String> unsortMap = new HashMap<Integer, String>();
        unsortMap.put(5, "b");
        unsortMap.put(6, "c");
        unsortMap.put(1, "a");
        unsortMap.put(10, "d");

        System.out.println("Unsort Map......");
        printMap(unsortMap);

        System.out.println("\nSorted Map......By Key");
        // Sort key ASC by default
        Map<Integer, String> treeMap = new TreeMap<>(unsortMap);
        printMap(treeMap);

        Map<Integer, String> treeMap2 = new TreeMap<>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);  //DESC
                        //return o1.compareTo(o2);  //ASC
                    }

                });

        printMap(treeMap2);

	    // For Java 8, try this lambda
		Map<Integer, String> treeMap3 = new TreeMap<>(
		                (Comparator<Integer>) (o1, o2) -> o2.compareTo(o1)
		        );

        treeMap.putAll(unsortMap);

        printMap(treeMap3);

    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

}