import java.util.*;

public class RatioofPositiveAndNegativeNums {
    public static void main (String[] args) {
        //The task is to print the ratio of the positive, negative, and zero numbers
        //in an List array

            //the {{ }} after the new array is created allows you to add new items
            //to the arraylist
            List<Integer> arr= new ArrayList<>(){{add(-4);add(3);add(-9);add(0);add(4);add(1);}};
            Integer n = arr.size();

            System.out.println(arr.size());
            double positiveRatio=0;
            double negativeRatio=0;
            double zeroRatio=0;
            if(0<n )
            for (int number: arr) {
                if (number>0){
                    positiveRatio++;
                    System.out.println("positive count is:" +positiveRatio);
                }
                if (number<0){
                    negativeRatio++;
                    System.out.println("negative count is:" +negativeRatio);
                }
                else if (number==0){zeroRatio++;}
            }


            System.out.println("zero count is:" +zeroRatio);
            System.out.println("zero count is:" +zeroRatio);
            System.out.println(String.format("%.6f", positiveRatio/n));
            System.out.println(String.format("%.6f",negativeRatio/n));
            System.out.println(String.format("%.6f",zeroRatio/n));


    }
}
