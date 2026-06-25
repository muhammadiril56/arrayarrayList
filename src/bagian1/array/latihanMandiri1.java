package bagian1.array;

public class latihanMandiri1 {
    public static void main(String[] args) {
        double[] suhuHarian = {28.5, 31.2, 25.0, 33.4, 29.1, 27.8};

        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];

        System.out.println("=== Data Suhu Harian ===");
        for (int i = 0; i < suhuHarian.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + suhuHarian[i] + "°C");
        }
        System.out.println("------------------------");

        for (int i = 1; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > suhuTertinggi) {
                suhuTertinggi = suhuHarian[i];
            }

            if (suhuHarian[i] < suhuTerendah) {
                suhuTerendah = suhuHarian[i];
            }
        }

        System.out.println("Hasil Analisis Suhu:");
        System.out.println("Suhu Tertinggi : " + suhuTertinggi + "°C");
        System.out.println("Suhu Terendah  : " + suhuTerendah + "°C");
    }   
}

//=== Data Suhu Harian ===
//Hari ke-1: 28.5°C
//Hari ke-2: 31.2°C
//Hari ke-3: 25.0°C
//Hari ke-4: 33.4°C
//Hari ke-5: 29.1°C
//Hari ke-6: 27.8°C
//------------------------
//Hasil Analisis Suhu:
//Suhu Tertinggi : 33.4°C
//Suhu Terendah  : 25.0°C