package tugasPBO.M06;

import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

public class QuizSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean lanjut = true;
        while (lanjut) {
            System.out.print("Masukkan panjang alas segitiga: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = input.nextDouble();

            Segitiga segitiga = new Segitiga(alas, tinggi);
            double luasSegitiga = segitiga.hitungLuas();
            System.out.println("Luas segitiga: " + luasSegitiga);

            System.out.print("Hitung luas segitiga lagi? (y/t): ");
            String pilihan = input.next().toLowerCase();
            if (pilihan.equals("t")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih telah menggunakan program ini.");
    }
}


