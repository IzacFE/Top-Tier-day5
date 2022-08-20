package SearchingAndSorting;

import java.util.Arrays;

public class MaximumBuyProduct {

    public static int maxSum(int money,int[] list){
        int pjgList = list.length;
        int[] sorted = list;
        Arrays.sort(sorted);
        int moneyLeft = money;
        int hasil = 0;
        for (int i = 0; i < pjgList; i++) {
            int check = (moneyLeft -= sorted[i]);
            if (check >= 0) {
                hasil += 1;
            } else {
                break;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{25000, 25000, 10000, 14000};
        int[] input2 = new int[]{15000, 10000, 12000, 5000, 3000};
        System.out.println(maxSum(50000,input1));
        System.out.println(maxSum(30000,input2));
    }
}
