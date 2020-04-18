package dataStructures.map;

import java.util.*;

public class MapLoopElements {
    public static void main(String[] args) {
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("a", 1);
        dataMap.put("b", 2);
        dataMap.put("c", 3);
        dataMap.put("d", 4);

        //1. Classic way : Iterator

        Set<Map.Entry<String, Integer>> set = dataMap.entrySet();

        System.out.println("Iterator");
        Iterator iterator = dataMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry) iterator.next();

            // Both are same
            // Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }

        //2. Using entrySet()
        System.out.println("Using entrySet()");
        for(Map.Entry<String, Integer> entry : dataMap.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }

        //3. Using Lambda Java 8
        System.out.println("Java 8 forEach loop");
        dataMap.forEach((key,value) -> System.out.println(key + " : "+value));

        //4. Print all keys
        System.out.println("KeySet");
        for(String key :  dataMap.keySet()){
            System.out.println(key);
        }

        //5. Print all values
        System.out.println("Map values()");
        for(Integer value :  dataMap.values()){
            System.out.println(value);
        }
    }
}
