package crackingCodingInterview.arrays;

public class CheckUniqueChars {

    public boolean isUnique(String ascii){
        if(ascii.length() > 128 ){
            return false;
        }
        boolean[] charSet = new boolean[128];
        try {
            for (int i = 0; i < ascii.length(); i++) {
                int val = ascii.charAt(i);
                System.out.println(ascii.charAt(i) + " -> val = " + val + ", charSet[val] : " + charSet[val]);
                if (charSet[val]) {
                    return false;
                }
                charSet[val] = true;
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //String ascii = "Ô";
        String ascii = "axsza";
        System.out.println("IsUnique : "+new CheckUniqueChars().isUnique(ascii));
    }


}
