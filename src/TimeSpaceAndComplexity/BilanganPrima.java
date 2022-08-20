package TimeSpaceAndComplexity;

import java.util.Scanner;

public class BilanganPrima {
    public static boolean primeNumber(int input){
        int check = input;

        if (check<2||check==4||check==9){
            return false;
        } else if (check==2) {
            return true;
        }else{
            for (int i = 2 ; i < Math.sqrt(check) ; i++){
                if(check%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(1000000007));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
        System.out.println(primeNumber(4));

    }
}
