package bagian2;

import java.util.ArrayList;

public class latihanMandiri1 {
    public static void main(String[] args) {
        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");      
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Gula Pasir");    
        daftarBelanja.add("Telur Ayam");  

        System.out.println("Daftar Awal: " + daftarBelanja);

        String itemDihapus = daftarBelanja.remove(1); 
        System.out.println("-> Berhasil menghapus item ke-2: " + itemDihapus);
        System.out.println("------------------------------------");

        System.out.println("=== Isi Daftar Belanja Akhir ===");
        for (int i = 0; i < daftarBelanja.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBelanja.get(i));
        }

        System.out.println("------------------------------------");
        System.out.println("Jumlah akhir item belanja: " + daftarBelanja.size() + " item");
    }    
}
