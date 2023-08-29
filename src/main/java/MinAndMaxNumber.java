import java.util.ArrayList;

public class MinAndMaxNumber {

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 4, 5};

        ArrayList arrayList= new ArrayList(){{ add(1);add(2);add(3);add(4);add(5);}};


        int sumSmallestNums=0;
        int sumlargestNums=0;


        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                    sumSmallestNums+= arr[i];
                    sumlargestNums+= arr[i+1];
            }

            if (arr[i] == arr[i + 1]) {

                if (arr[i]<arr[i+2]){
                    sumSmallestNums+= arr[i];
                }
                if (arr[i]>arr[i+2]){
                    sumlargestNums+= arr[i];
                }
            }

            }


        System.out.println("largest sum is:" + sumlargestNums);
        System.out.println("smallest sum is:" + sumSmallestNums);
    }
}
