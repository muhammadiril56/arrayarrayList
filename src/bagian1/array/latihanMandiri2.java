package bagian1.array;

public class latihanMandiri2 {
    public static void main(String[] args) {
        String[] daftarHari = {"Senin", "Selasa", "Rabu", "Kamis", "Minggu"};

        System.out.println("=== Daftar Hari Terpilih ===");
        System.out.println("Hari yang memiliki lebih dari 5 huruf:");
        System.out.println("------------------------------------");

        for (String daftarHari1 : daftarHari) {
            if (daftarHari1.length() > 5) {
                System.out.println("- " + daftarHari1 + " (" + daftarHari1.length() + " huruf)");
            }
        }
    }   
}

//=== Daftar Hari Terpilih ===
//Hari yang memiliki lebih dari 5 huruf:
//------------------------------------
//- Selasa (6 huruf)
//- Minggu (6 huruf)