package ProblemSolvingParadigm;

public class SimpleEquations {

    public static String solutions(String input){
        String[] array = input.split(" ");
        int A = Integer.parseInt(array[0]);
        int B = Integer.parseInt(array[1]);
        int C= Integer.parseInt(array[2]);
        for (var x = 0; x <= 10000; x++) {
            for (var y = 0; y <= 10000; y++) {
                // berpedoman z dari persamaan x + y + z =A
                int z = A- x - y;
                // jika nilai x y dan z memenuhi ketiga persamaan, maka solusi ditemukan
                if (x * y * z == B && x * x + y * y + z * z == C) {
                    return x+" "+y+" "+z;
                }
            }
        }
        return "no solution";
    }

    public static void main(String[] args) {
        System.out.println(solutions("1 2 3"));
        System.out.println(solutions("6 6 14"));
    }
}
