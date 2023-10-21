package tugasPBO.M05;

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

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

public class LuasSegitigaDanLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih bangun datar:");
            System.out.println("1. Segitiga");
            System.out.println("2. Lingkaran");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): ");

            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan panjang alas segitiga: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = input.nextDouble();

                Segitiga segitiga = new Segitiga(alas, tinggi);
                double luasSegitiga = segitiga.hitungLuas();
                System.out.println("Luas segitiga: " + luasSegitiga);
            } else if (pilihan == 2) {
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();

                Lingkaran lingkaran = new Lingkaran(jariJari);
                double luasLingkaran = lingkaran.hitungLuas();
                System.out.println("Luas lingkaran: " + luasLingkaran);
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan masukkan 1, 2, atau 3.");
            }
        }
    }
}


