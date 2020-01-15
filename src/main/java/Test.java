import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S, int K) {
        // write your code in Java SE 8
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Map<String, Integer> daysMap = new HashMap<String, Integer>();
        daysMap.put("Mon",1);
        daysMap.put("Tue",2);
        daysMap.put("Wed",3);
        daysMap.put("Thu",4);
        daysMap.put("Fri",5);
        daysMap.put("Sat",6);
        daysMap.put("Sun",7);


        int index = daysMap.get(S) + K%7;
        return days[index-1];

    }
}