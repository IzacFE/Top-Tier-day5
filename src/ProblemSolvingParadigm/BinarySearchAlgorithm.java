package ProblemSolvingParadigm;

public class BinarySearchAlgorithm {
    public static int binarySearch(int[] data,int target){
        int arrLength = data.length;
        // binary search berpedoman indetarget paling kiri dan paling kanan
        int leftPoint = 0;
        int rightPoint = arrLength - 1;

        for (var i = 0; i < arrLength; i++) {
            int middlePoint =(leftPoint + rightPoint) / 2;
            // kalau dilihat pada data nilainya sudah urut dari terkecil ke terbesar
            // jika titik tengah sama dengan target maka lansung di return, jika lebih kecil dari target maka akan bergeser ke kanan, jika lebih besar dari target maka bergeser ke kiri
            if (data[middlePoint] == target) {
                return middlePoint;
            } else if (data[middlePoint] < target) {
                leftPoint = middlePoint + 1;
            } else if (data[middlePoint] > target) {
                rightPoint = middlePoint + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] dataArray1 = new int[]{1, 1, 3, 5, 5, 6, 7};
        int[] dataArray2 = new int[]{1, 2, 3, 5, 6, 8, 10};
        System.out.println(binarySearch(dataArray1,3));
        System.out.println(binarySearch(dataArray2,5));
    }
}
