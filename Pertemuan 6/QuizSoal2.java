package tugasPBO.M06;

import java.util.Scanner;

class PhoneCell {
    private int biayaPerPulsa;
    private int detikPerPulsa;

    public PhoneCell(int biayaPerPulsa, int detikPerPulsa) {
        this.biayaPerPulsa = biayaPerPulsa;
        this.detikPerPulsa = detikPerPulsa;
    }

    public int hitungBiayaPercakapan(int lamaPercakapanDetik) {
        return (lamaPercakapanDetik / detikPerPulsa) * biayaPerPulsa;
    }
}

public class QuizSoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan waktu awal percakapan (hh:mm:ss): ");
        String waktuAwal = input.nextLine();
        String[] waktuAwalArray = waktuAwal.split(":");
        int jamAwal = Integer.parseInt(waktuAwalArray[0]);
        int menitAwal = Integer.parseInt(waktuAwalArray[1]);
        int detikAwal = Integer.parseInt(waktuAwalArray[2]);

        System.out.print("Masukkan waktu selesai percakapan (hh:mm:ss): ");
        String waktuSelesai = input.nextLine();
        String[] waktuSelesaiArray = waktuSelesai.split(":");
        int jamSelesai = Integer.parseInt(waktuSelesaiArray[0]);
        int menitSelesai = Integer.parseInt(waktuSelesaiArray[1]);
        int detikSelesai = Integer.parseInt(waktuSelesaiArray[2]);

        int lamaPercakapanDetik = (jamSelesai - jamAwal) * 3600 + (menitSelesai - menitAwal) * 60 + (detikSelesai - detikAwal);

        int biayaPerPulsa = 150;
        int detikPerPulsa = 5; 

        PhoneCell phoneCell = new PhoneCell(biayaPerPulsa, detikPerPulsa);

        int biayaPercakapan = phoneCell.hitungBiayaPercakapan(lamaPercakapanDetik);

        System.out.println("Lama percakapan: " + lamaPercakapanDetik + " detik");
        System.out.println("Biaya percakapan: Rp. " + biayaPercakapan);
    }
}

