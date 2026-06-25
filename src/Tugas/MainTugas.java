package Tugas;

public class MainTugas {
public static void main(String[] args) {
        // 4. Menyimpan daftar nama mata kuliah dalam array String (ukuran tetap)
        String[] mataKuliah = {
            "Pemrograman Berorientasi Objek", 
            "Struktur Data & Algoritma", 
            "Sistem Basis Data"
        };

        // Menampilkan daftar mata kuliah
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // 3. Membuat objek KelasKuliah
        KelasKuliah kelasPBO = new KelasKuliah();

        // Menambahkan minimal 5 objek Mahasiswa awal
        kelasPBO.tambahMahasiswa(new Mahasiswa("Andi Wijaya", "20260101", 78.5));
        kelasPBO.tambahMahasiswa(new Mahasiswa("Budi Santoso", "20260102", 55.0));
        kelasPBO.tambahMahasiswa(new Mahasiswa("Citra Lestari", "20260103", 92.0));
        kelasPBO.tambahMahasiswa(new Mahasiswa("Dewi Sartika", "20260104", 45.5));
        kelasPBO.tambahMahasiswa(new Mahasiswa("Eko Prasetyo", "20260105", 85.0));

        // Menampilkan data mahasiswa awal
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelasPBO.tampilkanSemua();

        // 5. Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelasPBO.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelasPBO.jumlahLulus());
        System.out.println("Total Data Mahasiswa  : " + kelasPBO.getJumlahData());
        System.out.println();

        // 6. Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println(">>> Menambahkan 1 Mahasiswa Baru...");
        kelasPBO.tambahMahasiswa(new Mahasiswa("Fajar Utama", "20260106", 65.0));
        System.out.println();

        // Menampilkan kembali data dan jumlah data terbaru
        System.out.println("=== DATA MAHASISWA TERBARU ===");
        kelasPBO.tampilkanSemua();
        System.out.println("Total Data Terbaru    : " + kelasPBO.getJumlahData() + " mahasiswa");
        System.out.printf("Rata-rata Terbaru     : %.2f\n", kelasPBO.hitungRataRata());
        System.out.println("Jumlah Lulus Terbaru  : " + kelasPBO.jumlahLulus());
    }   
}
