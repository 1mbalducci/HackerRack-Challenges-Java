import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMaxNumber {

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 4, 5};

       List<Integer> arr2= new ArrayList(){{ add(1);add(3);add(2);add(4);add(5);}};
       List<Integer> arr3= new ArrayList(){{ add(256741038);add(623958417);add(467905213);add(714532089);add(938071625);}};

        Long sumSmallestNums=0L;
        Long sumlargestNums= 0L;


        Collections.sort(arr3);
        System.out.println(arr3.size());

        for (int i=0; i<arr3.size()-1; i++){
            sumSmallestNums+= arr3.get(i).longValue();
        };
        System.out.println(arr3.toString());

        Collections.reverse(arr3);
        for (int i=0; i<arr3.size()-1; i++){
            sumlargestNums+=arr3.get(i).longValue();
        };
        System.out.println(arr3.toString());

        System.out.println(sumSmallestNums);
        System.out.println(sumlargestNums);
        }



//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] < arr[i + 1]) {
//                    sumSmallestNums+= arr[i];
//                    sumlargestNums+= arr[i+1];
//            }
//
//            if (arr[i] == arr[i + 1]) {
//
//                if (arr[i]<arr[i+2]){
//                    sumSmallestNums+= arr[i];
//                }
//                if (arr[i]>arr[i+2]){
//                    sumlargestNums+= arr[i];
//                }
//            }
//
//            }


//        System.out.println("largest sum is:" + sumlargestNums);
//        System.out.println("smallest sum is:" + sumSmallestNums);
//    }
}
