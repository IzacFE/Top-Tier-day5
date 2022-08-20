package ProblemSolvingParadigm;

import java.util.ArrayList;
import java.lang.Math;

public class Frog {

    public static int frog(int[] jumps){
        int[] nStones = jumps.clone();
        int arrLength = jumps.length;

        ArrayList<Integer> different = new ArrayList<>();
        different.add(0);
        different.add(Math.abs(nStones[1] - nStones[0]));

        for (int i = 2; i < arrLength; i++) {
            int check1step = different.get(i-1) + Math.abs(nStones[i] - nStones[i - 1]);
            int check2step = different.get(i-2) + Math.abs(nStones[i] - nStones[i - 2]);
            int setValue = Math.min(check1step, check2step);
            different.add(setValue);
        }
        return different.get(arrLength - 1);
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{10, 30, 40, 20};
        int[] input2 = new int[]{30, 10, 60, 10, 60, 50};
        System.out.println(frog(input1));
        System.out.println(frog(input2));
    }
}
