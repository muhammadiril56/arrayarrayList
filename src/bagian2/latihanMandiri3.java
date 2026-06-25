package bagian2;

import java.util.ArrayList;

public class latihanMandiri3 {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Ahmad");
        daftarNama.add("Citra");
        daftarNama.add("Anisa");
        daftarNama.add("Dewi");

        System.out.println("Daftar Semua Nama: " + daftarNama);
        System.out.println("------------------------------------");
        System.out.println("Nama yang diawali dengan huruf 'A':");

        for (int i = 0; i < daftarNama.size(); i++) {
            String namaSekarang = daftarNama.get(i);

            if (namaSekarang.startsWith("A")) {
                System.out.println("- " + namaSekarang);
            }
        }
    }    
}
