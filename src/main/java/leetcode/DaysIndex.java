package leetcode;

import java.util.*;

public class DaysIndex {
    public String solution(String S, int K) {
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Map<String, Integer> daysMap = new HashMap<String, Integer>();
        daysMap.put("Mon",1);
        daysMap.put("Tue",2);
        daysMap.put("Wed",3);
        daysMap.put("Thu",4);
        daysMap.put("Fri",5);
        daysMap.put("Sat",6);
        daysMap.put("Sun",7);

        if(daysMap.containsKey(S)){
            int index = (daysMap.get(S) + K)%7;
            return days[index-1];
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(new DaysIndex().solution("Mon",22));
    }
}