package ProblemSolvingParadigm;

import java.util.ArrayList;
import java.lang.Math;

public class MoneyChange {
    public static ArrayList getChange(int input){
        int[] changeArray = new int[]{10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 1};
        int arrLength = changeArray.length;
        ArrayList result = new ArrayList<>();
        // loop untuk mengecek antara sisa uang yang dimiliki dengan list uang change
        for (int i = 0; i < arrLength; i++) {
            // mencek sisa uang apakah masih bisa di bagi dengan list uang index[i], jika bisa maka masuk ke loop untuk mengepush nilai uang changenya
            double jumlahMuncul = Math.floor(input / changeArray[i]);
            for (int j = 0; j < jumlahMuncul; j++) {
                // jika sisa uang lebih dari list uang index[i] maka masih bisa dikurangi, dan masuk ke dalam result
                if (input >= changeArray[i]) {
                    input -= changeArray[i];
                    result.add(changeArray[i]);
                } else {
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getChange(123));
    }
}
