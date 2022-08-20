package ProblemSolvingParadigm;

import java.util.Arrays;

public class DragonOfLoowater {
    public static String fightDragon(int[] dragonHead, int[] knightHeight){
        int[] sortedHead = dragonHead;
        Arrays.sort(sortedHead);
        int[] sortedKnight = knightHeight;
        Arrays.sort(sortedKnight);
        int sumKnight = knightHeight.length;
        int sumHead = dragonHead.length;
        int result = 0;
        // jika jumlah knight lebih sedikit dari jumlah dragon head maka sudah pasti kalah/tidak ada solusi
        if (sumKnight < sumHead) {
            return "knight fall";
        }
        // headCount untuk mengecek apakah kepala naganya sudah habis atau belum
        int headCount = sumHead;
        // looping untuk mencari knight yang bisa mengalahkan salah satu kepala naga yg ada, dimulai dari knight dengan height terkecil
        for (int i = 0; i < sumHead; i++) {
            for (int j = 0; j < sumKnight; j++) {
                // jika ditemukan knight yang dapat mengalahkan kepala naga, maka nilai hasil akan ditambahkan dengan nilai height dari knight dan di break agar menghemat looping
                if (sortedHead[i] <= sortedKnight[j]) {
                    headCount -= 1;
                    result += sortedKnight[j];
                    break;
                }
            }
        }
        // jika headcount sama dengan 0 berarti seluruh kepala naga sudah dipotong, jika lebih dari 0 maka belum semua kepala naga terpotong(knight fall)
        if (headCount == 0) {
            return String.valueOf(result);
        } else {
            return "knight fall";
        }
    }

    public static void main(String[] args) {
        int[] dragon = new int[]{5, 4};
        int[] knight = new int[]{7, 8, 4};
        int[] dragon1 = new int[]{5, 10};
        int[] knight1 = new int[]{5};

        System.out.println(fightDragon(dragon,knight));
        System.out.println(fightDragon(dragon1,knight1));
    }
}
