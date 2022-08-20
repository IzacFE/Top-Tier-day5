package TimeSpaceAndComplexity;

public class FastExponentiation {
//    Menggunakan rekursif
    public static int pow(int angka, int pangkat){
        if(pangkat==0){
            return 1;
        }
        if(pangkat%2==0){
            return pow(angka,pangkat/2)*pow(angka, pangkat/2);
        }else{
            return angka*pow(angka,(pangkat-1)/2)*pow(angka, (pangkat-1)/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));  // 8
        System.out.println(pow(5, 3));  // 125
        System.out.println(pow(10, 2)); // 100
        System.out.println(pow(2, 5)); // 32
        System.out.println(pow(7, 3));  // 343
    }
}
