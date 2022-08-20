package ProblemSolvingParadigm;

import java.util.HashMap;

public class FiboTopDown {
    public static HashMap<Integer, Integer> saveValue= new HashMap<Integer, Integer>();
    public static int fibonacciTopDown(int target){
        if(saveValue.containsKey(target)) return saveValue.get(target);
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        int getValue = fibonacciTopDown(target - 1) + fibonacciTopDown(target - 2);
        saveValue.put(target, getValue);
        return getValue;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciTopDown(5));
    }
}
