package leetcode;

public class LongestSemiAlteringSubstring {
    private int findLongestSemiAlteringSubstring(String str) {
        int len = 0;
        if(str == null) return 0;
        if(str.length() < 3) return str.length();
        for(int i=2,j=0;i<str.length(); ++i) {
            if(str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i-2))
                j = i-1;
            len = Math.max(len, i-j+1);
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSemiAlteringSubstring().findLongestSemiAlteringSubstring("baaabbabbb"));
        System.out.println(new LongestSemiAlteringSubstring().findLongestSemiAlteringSubstring("abaaaa"));
    }
}

/*

Input: "baaabbabbb"
Output: 7
Explanation: "aabbabb"

Input: "abaaaa"
Output: 4
Explanation: "abaa"

 */