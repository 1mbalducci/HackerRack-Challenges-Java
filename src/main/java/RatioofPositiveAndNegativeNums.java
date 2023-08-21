import java.util.*;

public class RatioofPositiveAndNegativeNums {
    public static void main (String[] args) {
        //The task is to print the ratio of the positive, negative, and zero numbers
        //in an List array

            //the {{ }} after the new array is created allows you to add new items
            //to the arraylist
            List<Integer> arr= new ArrayList<>(){{add(1);add(1);add(0);add(-1);add(-1);}};

            Integer n = arr.size();

            double positiveCount=0.0;
            double negativeCount=0.0;
            double zeroCount=0.0;
            double positiveRatio;
            double negativeRatio;
            double zeroRatio;

            for (int number: arr) {
                if (number>0){
                    positiveCount++;
                    System.out.println("positive count is:" +positiveCount);
                }
                if (number<0){
                    negativeCount++;
                    System.out.println("negative count is:" +negativeCount);
                }
                else {zeroCount++;}
            }

            positiveRatio=positiveCount/n;
            negativeRatio=(negativeCount/n);
            zeroRatio=zeroCount/n;


            System.out.println(String.format("%.6f", positiveRatio));
            System.out.println(String.format("%.6f",negativeRatio));
            System.out.println(String.format("%.6f",zeroRatio));


    }
}
