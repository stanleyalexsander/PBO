package tugasPBO.M06;

import java.util.Scanner;

class RentalWarnet {
    private int waktuInternet;
    private int waktuPengetikan;
    private int waktuGameOnline;
    private int lembarScan;
    private int lembarPrintHitamPutih;
    private int lembarPrintWarna;
    private int jumlahTehBotol;

    public RentalWarnet(int waktuInternet, int waktuPengetikan, int waktuGameOnline, int lembarScan, int lembarPrintHitamPutih, int lembarPrintWarna, int jumlahTehBotol) {
        this.waktuInternet = waktuInternet;
        this.waktuPengetikan = waktuPengetikan;
        this.waktuGameOnline = waktuGameOnline;
        this.lembarScan = lembarScan;
        this.lembarPrintHitamPutih = lembarPrintHitamPutih;
        this.lembarPrintWarna = lembarPrintWarna;
        this.jumlahTehBotol = jumlahTehBotol;
    }

    public double hitungBiayaRental() {
        double tarifInternetPerMenit = 4000.0 / 60.0;
        double tarifPengetikanPerMenit = 2000.0 / 60.0;
        double tarifGameOnlinePerMenit = 5000.0 / 60.0;

        // Menghitung biaya Internet
        double biayaInternet = waktuInternet * tarifInternetPerMenit;

        // Menghitung biaya Pengetikan
        double biayaPengetikan = waktuPengetikan * tarifPengetikanPerMenit;

        // Menghitung biaya Game Online
        double biayaGameOnline = waktuGameOnline * tarifGameOnlinePerMenit;

        // Menghitung biaya Scan
        int biayaScan = lembarScan * 1000;

        // Menghitung biaya Print
        int biayaPrintHitamPutih = lembarPrintHitamPutih * 300;
        int biayaPrintWarna = lembarPrintWarna * 500;

        // Menghitung biaya Teh Botol
        int biayaTehBotol = jumlahTehBotol * 3000;

        // Menghitung total biaya keseluruhan
        double totalBiaya = biayaInternet + biayaPengetikan + biayaGameOnline + biayaScan + biayaPrintHitamPutih + biayaPrintWarna + biayaTehBotol;

        return totalBiaya;
    }
}

public class QuizSoal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lama pemakaian Internet (menit): ");
        int waktuInternet = input.nextInt();
        System.out.print("Lama pemakaian Pengetikan (menit): ");
        int waktuPengetikan = input.nextInt();
        System.out.print("Lama pemakaian Game Online (menit): ");
        int waktuGameOnline = input.nextInt();
        System.out.print("Jumlah lembar Scan: ");
        int lembarScan = input.nextInt();
        System.out.print("Jumlah lembar Print Hitam-Putih: ");
        int lembarPrintHitamPutih = input.nextInt();
        System.out.print("Jumlah lembar Print Warna: ");
        int lembarPrintWarna = input.nextInt();
        System.out.print("Jumlah Teh Botol: ");
        int jumlahTehBotol = input.nextInt();

        RentalWarnet rental = new RentalWarnet(waktuInternet, waktuPengetikan, waktuGameOnline, lembarScan, lembarPrintHitamPutih, lembarPrintWarna, jumlahTehBotol);

        double totalBiaya = rental.hitungBiayaRental();

        System.out.println("Total biaya rental: Rp. " + totalBiaya);
    }
}
