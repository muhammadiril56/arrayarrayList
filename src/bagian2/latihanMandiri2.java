package bagian2;

import java.util.ArrayList;

public class latihanMandiri2 {
    public static void main(String[] args) {
        ArrayList<Integer> daftarAngka = new ArrayList<>();

        daftarAngka.add(12);
        daftarAngka.add(45);
        daftarAngka.add(8);
        daftarAngka.add(73);
        daftarAngka.add(21);

        System.out.println("Daftar Angka: " + daftarAngka);
        System.out.println("------------------------------------");

        int nilaiTerbesar = daftarAngka.get(0);

        for (int i = 1; i < daftarAngka.size(); i++) {
            int angkaSekarang = daftarAngka.get(i);

            if (angkaSekarang > nilaiTerbesar) {
                nilaiTerbesar = angkaSekarang;
            }
        }

        System.out.println("Hasil Penelusuran:");
        System.out.println("Nilai terbesar di dalam list adalah: " + nilaiTerbesar);
    }    
}
