package bagian2;

import java.util.ArrayList;

public class latihan5 {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(80);
        nilai.add(75);
        nilai.add(90);

        int total = 0;
        total = nilai.stream().map((n) -> n).reduce(total, Integer::sum);
        double rata = (double) total / nilai.size();

        System.out.println("Data      : " + nilai);
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + rata);
    }   
}
