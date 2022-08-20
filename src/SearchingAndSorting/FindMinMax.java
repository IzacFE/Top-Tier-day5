package SearchingAndSorting;

public class FindMinMax {
    public static String minMax(int[] input){
        int arrLength = input.length;
        int maxNumb = input[0];
        int indexMax = 0;
        int minNumb = input[0];
        int indexMin = 0;

        for (int i = 1; i < arrLength; i++) {
            if (input[i] > maxNumb) {
                indexMax = i;
                maxNumb=input[i];
            }
            if (input[i] < minNumb) {
                indexMin=i;
                minNumb=input[i];
            }
        }
        return "min : "+minNumb+" index : "+indexMin+" max : "+maxNumb+" index : "+indexMax;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 4, -2, -1, 8};
        int[] array2 = new int[]{2, -5, -4, 22, 7, 7};
        System.out.println(minMax(array));
        System.out.println(minMax(array2));
    }
}
