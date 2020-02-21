package crackingCodingInterview.arrays;

public class SumIndex {

    void sumIndex(int[] list){

        for(int i=0; i< list.length; i++){
            int temp =0;
            for(int j=0; j< list.length; j++){
                if((i!=j)){
                    temp = temp + list[j];
                    System.out.println("i : "+i+", j = "+j+ "   "+list[j]+" : temp = "+temp);
                }
            }
            list[i]=temp;
        }

        for(int element : list){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] list = {1,2,3};
        new SumIndex().sumIndex(list);
    }
}
/*
1 2 3 4 5
0 = 5 2 3
1 = 5 8 3
2 = 5 8 13
3 =
*/