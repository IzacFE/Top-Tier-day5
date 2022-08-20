package RecursiveNumberTheory;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int target){
        if (target == 1) {
            return 0;
        } else if (target == 2) {
            return 1;
        } else {
            return fibonacci(target - 1) + fibonacci(target - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input angka urutan fibonacci");
        int input = scanner.nextInt();
        scanner.close();

        System.out.println(fibonacci(input));

    }
}
