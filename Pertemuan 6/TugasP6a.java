package tugasPBO.M06;

import java.util.Scanner;

public class TugasP6a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total nilai = ");
        int totalNilai = input.nextInt();

        String nilaiHuruf;

        if (totalNilai >= 0 && totalNilai <= 100) {
            if (totalNilai >= 90) {
                nilaiHuruf = "A";
            } else if (totalNilai >= 80) {
                nilaiHuruf = "A-";
            } else if (totalNilai >= 75) {
                nilaiHuruf = "B+";
            } else if (totalNilai >= 70) {
                nilaiHuruf = "B";
            } else if (totalNilai >= 65) {
                nilaiHuruf = "B-";
            } else if (totalNilai >= 60) {
                nilaiHuruf = "C+";
            } else if (totalNilai >= 55) {
                nilaiHuruf = "C";
            } else if (totalNilai >= 50) {
                nilaiHuruf = "C-";
            } else if (totalNilai >= 40) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Hasil:");
            System.out.println("Nilai Angka = " + totalNilai);
            System.out.println("Nilai Huruf = " + nilaiHuruf);
        } else {
            System.out.println("Input nilai tidak valid. Nilai harus berada dalam rentang 0 hingga 100.");
        }
    }
}
