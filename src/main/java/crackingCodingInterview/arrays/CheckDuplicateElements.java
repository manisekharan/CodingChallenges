package crackingCodingInterview.arrays;

public class CheckDuplicateElements {

    public boolean isUnique(int[] arrays){
        for(int i=0; i < arrays.length; i++){
            for (int j=i+1; j < arrays.length; j++){
                if( arrays[i] == arrays [j]){
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{7,6,1,3,5,2,7};
        System.out.println("Is Unique : "+new CheckDuplicateElements().isUnique(arrays));
    }
}
