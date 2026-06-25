package bagian1.array;

public class latihanMandiri3 {
    public static void main(String[] args) {
        // Array yang diberikan oleh soal
        int[] angka = {4, 8, 15, 16, 23, 42};
        
        // Variabel counter untuk menyimpan jumlah angka genap
        int jumlahGenap = 0;

        // Perulangan untuk memeriksa setiap elemen array
        for (int i = 0; i < angka.length; i++) {
            
            // Kondisi angka genap: jika angka dibagi 2 sisanya adalah 0
            if (angka[i] % 2 == 0) {
                jumlahGenap++; // Tambah 1 ke counter jika benar genap
            }
        }

        // Menampilkan hasil akhir
        System.out.println("=== Analisis Array ===");
        System.out.println("Banyaknya angka genap di dalam array adalah: " + jumlahGenap);
    } 
}
