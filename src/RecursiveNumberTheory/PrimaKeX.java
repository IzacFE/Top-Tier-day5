package RecursiveNumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

import static TimeSpaceAndComplexity.BilanganPrima.primeNumber;

public class PrimaKeX {
    public static int primeX(int input){
        int result = 0;
        int count = 0;
        for (int i = 2; i > 0; i++) {
            boolean prima = primeNumber(i);
            if (prima) {
                count += 1;
            }
            if (count == input) {
                result = i;
                break;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println("Masukkan jumlah print bilangan prima");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        System.out.println(primeX(input));

    }
}
