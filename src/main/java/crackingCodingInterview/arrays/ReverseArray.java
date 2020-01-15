package crackingCodingInterview.arrays;

public class ReverseArray {

    public void reverse(int[] arrayList) {
        if(arrayList == null || arrayList.length <= 1){
            return;
        }
        for(int i=0; i < arrayList.length/2; i++){
            int temp = arrayList[arrayList.length-1-i];
            arrayList[arrayList.length-1-i]  = arrayList[i];
            arrayList[i] = temp;
        }

        for (int i = 0; i < arrayList.length; i++){
            System.out.print(arrayList[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrayList = new int[]{1,2,3,4};
        new ReverseArray().reverse(arrayList);
    }
}
