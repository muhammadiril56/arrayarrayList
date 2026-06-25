package Tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public KelasKuliah() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        
        double totalNilai = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            totalNilai += m.getNilai();
        }
        return totalNilai / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                count++;
            }
        }
        return count;
    }

    public int getJumlahData() {
        return daftarMahasiswa.size();
    }

    public void tampilkanSemua() {
        System.out.println("----------------------------------------------------");
        System.out.printf("%-15s %-12s %-10s %-10s\n", "Nama", "NPM", "Nilai", "Status");
        System.out.println("----------------------------------------------------");
        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-15s %-12s %-10.2f %-10s\n", m.getNama(), m.getNpm(), m.getNilai(), status);
        }
        System.out.println("----------------------------------------------------");
    }    
}
