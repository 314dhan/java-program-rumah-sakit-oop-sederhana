package Latihan.rumahsakit.dokter;

import java.util.*;

interface RumahSkt {
    void rawatInap();
    void rawatJalan();
}

abstract class AtributDokter implements RumahSkt {
    private String name, alamat, ruangan = "", namaDr = "", jnskel;
    private int dokter, kamar, lama, pilihDr, uang;
    private int hrgKamar = 0, jasaDr = 0, totalObat = 0, tindakan, totalBiaya = 0, umur, rm;
    Scanner input = new Scanner(System.in);

    @Override
    public void rawatInap() {

        System.out.print("nama : ");
        name = input.nextLine();
        System.out.print("alamat : ");
        alamat = input.nextLine();
        System.out.print("jenis kelamin : ");
        jnskel = input.nextLine();
        System.out.print("Lama menginap : ");
        lama = input.nextInt();

        System.out.print("umur anda : ");
        umur = input.nextInt();
        System.out.print("no. rekam medis : ");
        rm = input.nextInt();

        System.out.println("pilih jenis kamar");
        System.out.print("1. kelas I\n");
        System.out.print("2. kelas II\n");
        System.out.print("3. kelas III\n");
        System.out.print("4. kelas VIP\n");
        System.out.print("5. kelas VVIP\n");
        System.out.print("pilihan anda [ 1/2/3/4/5]: ");

        while (true) {
            kamar = input.nextInt();
            if (kamar == 1) {
                ruangan = "kelas I";
                System.out.println("------" + ruangan + "------");
                hrgKamar = 850000;
                break;
            } else if (kamar == 2) {
                ruangan = "kelas II";
                System.out.println("------" + ruangan + "------");
                hrgKamar = 1000000;
                break;
            } else if (kamar == 3) {
                ruangan = "kelas III";
                System.out.println("------" + ruangan + "------");
                hrgKamar = 1300000;
                break;
            } else if (kamar == 4) {
                ruangan = "kelas VIP";
                System.out.println("------" + ruangan + "------");
                hrgKamar = 1800000;
                break;
            } else if (kamar == 5) {
                ruangan = "kelas VVIP";
                System.out.println("------" + ruangan + "------");
                hrgKamar = 2450000;
                break;
            } else {
                System.out.println("pilihan tidak tersedia");
                System.out.print("pilih jenis kamar : ");
            }
        }

        System.out.println("=========================================================");

        System.out.println("pilih jenis dokter");
        System.out.print("1. Dokter anak : Dr. Azizul hakim\n");
        System.out.print("2. Dokter Penyakit dalam : Dr. Melanie Tan\n");
        System.out.print("3. Dokter Mata : Dr. Riyon\n");
        System.out.print("4. Dokter Umum : Dr. Hendra\n");
        System.out.print("5. Dokter Bedah Umum : Dr. Taufiq\n");
        System.out.print("pilihan anda [ 1/2/3/4/5]: ");

        while (true) {
            dokter = input.nextInt();
            if (dokter == 1) {
                namaDr = "Dr. Azizul hakim";
                jasaDr = 145000;
                break;
            } else if (dokter == 2) {
                namaDr = "Dr. Melanie Tan";
                jasaDr = 200000;
                break;
            } else if (dokter == 3) {
                namaDr = "Dr. Riyon";
                jasaDr = 170000;
                break;
            } else if (dokter == 4) {
                namaDr = "Dr. Hendra";
                jasaDr = 150000;
                break;
            } else if (dokter == 5) {
                namaDr = "Dr. Taufiq";
                jasaDr = 150000;
                break;
            } else {
                System.out.println("pilihan tidak tersedia");
                System.out.print("pilih jenis dokter : ");
            }
        }

        System.out.println("=========================================================\n");

        System.out.println("nama: " + name);
        System.out.println("no. rekam medis: " + rm);
        System.out.println("alamat: " + alamat);
        System.out.println("jenis kelamin: " + jnskel);
        System.out.println("umur : " + umur);
        System.out.println("jenis kamar: " + ruangan);
        System.out.println("Dokter Tujuan: " + namaDr);

        System.out.println("=========================================================");

        System.out.println(" TOTAL YANG HARUS DIBAYAR ");
        System.out.println("Atas nama : " + namaDr);
        System.out.println("Jasa dokter : Rp." + jasaDr);
        System.out.println("kamar inap : " + ruangan + " Rp." + hrgKamar);
        System.out.println("Lama menginap : " + lama + " hari");
        System.out.println("harga kamar : Rp." + hrgKamar * lama);
        System.out.print("total obat : Rp.");
        totalObat = input.nextInt();

        System.out.print("Tindakan : Rp.");
        tindakan = input.nextInt();

        totalBiaya = (jasaDr + (hrgKamar * lama) + totalObat + tindakan);
        System.out.println("total biaya: Rp." + totalBiaya);
        while(true){
            System.out.print("masukan uang anda : Rp.");
            uang = input.nextInt();
            if (uang < totalBiaya) {
                System.out.println("uang anda kurang");
            } else {
                System.out.println("kembalian : Rp." + (uang - totalBiaya));
                break;
            }
        }
        
    }

    @Override
    public void rawatJalan() {

        System.out.print("nama : ");
        String name = input.nextLine();
        System.out.print("alamat : ");
        alamat = input.nextLine();
        System.out.print("jenis kelamin : ");
        jnskel = input.nextLine();

        System.out.print("umur anda : ");
        umur = input.nextInt();
        System.out.print("no. rekam medis : ");
        rm = input.nextInt();

        System.out.println("=========================================================");

        System.out.println("Pilih Poli: ");
        System.out.print("1. Poli Bedah Umum : Dr. Ryu Hasan\n");
        System.out.print("2. Poli Anak : Dr. Daniel\n");
        System.out.print("3. Poli Mata : Dr. Andi suherman\n");
        System.out.print("4. Poli Penyakit Dalam : Dr. Nainggolan\n");
        System.out.print("5. Poli Umum : Dr. Zaid assalafi\n");

        System.out.print("pilihan anda [ 1/2/3/4/5]: ");

        while (true) {
            pilihDr = input.nextInt();
            if (pilihDr == 1) {
                namaDr = "Dr. Ryu Hasan";
                jasaDr = 150000;
                break;
            } else if (pilihDr == 2) {
                namaDr = "Dr. Daniel";
                jasaDr = 200000;
                break;
            } else if (pilihDr == 3) {
                namaDr = "Dr. Andi suherman";
                jasaDr = 150000;
                break;
            } else if (pilihDr == 4) {
                namaDr = "Dr. Nainggolan";
                jasaDr = 175000;
                break;
            } else if (pilihDr == 5) {
                namaDr = "Dr. Zaid assalafi";
                jasaDr = 150000;
                break;
            } else {
                System.out.println("pilihan tidak tersedia");
                System.out.print("pilih jenis dokter : ");
            }
        }

        System.out.println("nama pasien : " + name);
        System.out.println("alamat pasien: " + alamat);
        System.out.println("jenis kelamin : " + jnskel);
        System.out.println("umur : " + umur);
        System.out.println("Atas Tujuan dokter : " + namaDr);

        System.out.println("=========================================================");
        System.out.println(" TOTAL YANG HARUS DIBAYAR ");
        System.out.println("nama pasien : " + name);
        System.out.println("no. rekam medis : " + rm);
        System.out.println("Atas nama : " + namaDr);
        System.out.println("Jasa dokter : Rp." + jasaDr);
        System.out.print("total obat : Rp.");
        totalObat = input.nextInt();
        System.out.print("Tindakan : Rp.");
        tindakan = input.nextInt();

        totalBiaya = (jasaDr + totalObat + tindakan);
        System.out.println("total biaya: Rp." + totalBiaya);
        while (true) {
            System.out.print("masukan uang anda : Rp.");
            uang = input.nextInt();
            if (uang < totalBiaya) {
                System.out.println("uang anda kurang");
            } else {
                System.out.println("kembalian : Rp." + (uang - totalBiaya));
                break;
            }
        }
    }
}

public class Dokter extends AtributDokter {    
}