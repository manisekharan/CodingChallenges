package crackingCodingInterview.strings;

public class StringsCompare {

    static boolean compare(String str1, String str2){
        boolean flag = false;

        if(str1 == null || str2 == null){
            return flag;
        }

        if(str1.length() != str2.length()){
            return flag;
        }

        for(int i=0; i < str1.length(); i++){
            flag = false;
            for(int j=0; j < str1.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String str1 = "sfd";
        String str2 = "dfs";
        System.out.println(compare(str1,str2));
    }
}
