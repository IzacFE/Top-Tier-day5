package ProblemSolvingParadigm;

public class RomanNumerals {
    public static String romanConversion(int input){
        int[] inNumber = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] inRoman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        for(int i=0;i<inNumber.length;i++)
        {
            for (int j = input;input>=inNumber[i];j-=inNumber[i]){
                input = input - inNumber[i];
                result+=inRoman[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanConversion(2021));
    }
}
