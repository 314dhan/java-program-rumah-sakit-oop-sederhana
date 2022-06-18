package Latihan.rumahsakit.dokter;

import java.util.*;

interface RumahSkt {
    void rawatInap();
    void rawatJalan();
}

abstract class Atributtdokter implements RumahSkt {
    private String name, alamat, ruangan = "", namaDr = "", jnskel;
    private int dokter, kamar, lama, pilihDr, uang;
    private int hrgKamar = 0, jasaDr = 0, totalObat = 0, tindakan, totalBiaya = 0, umur, rm;
    Scanner input = new Scanner(System.in);

    @Override
    public void rawatInap() {

        System.out.print("nama : ");
        this.name = input.nextLine();
        System.out.print("alamat : ");
        this.alamat = input.nextLine();
        System.out.print("jenis kelamin : ");
        this.jnskel = input.nextLine();
        System.out.print("Lama menginap : ");
        this.lama = input.nextInt();

        System.out.print("umur anda : ");
        this.umur = input.nextInt();
        System.out.print("no. rekam medis : ");
        this.rm = input.nextInt();

        System.out.println("pilih jenis kamar");
        System.out.print("1. kelas I\n");
        System.out.print("2. kelas II\n");
        System.out.print("3. kelas III\n");
        System.out.print("4. kelas VIP\n");
        System.out.print("5. kelas VVIP\n");
        System.out.print("pilihan anda [ 1/2/3/4/5]: ");

        while (true) {
            this.kamar = input.nextInt();
            if (this.kamar == 1) {
                ruangan = "kelas I";
                System.out.println("------" + ruangan + "------");
                hrgKamar = 850000;
                break;
            } else if (this.kamar == 2) {
                ruangan = "kelas II";
                System.out.println("------" + ruangan + "------");
                this.hrgKamar = 1000000;
                break;
            } else if (this.kamar == 3) {
                this.ruangan = "kelas III";
                System.out.println("------" + ruangan + "------");
                this.hrgKamar = 1300000;
                break;
            } else if (this.kamar == 4) {
                this.ruangan = "kelas VIP";
                System.out.println("------" + ruangan + "------");
                this.hrgKamar = 1800000;
                break;
            } else if (this.kamar == 5) {
                this.ruangan = "kelas VVIP";
                System.out.println("------" + ruangan + "------");
                this.hrgKamar = 2450000;
                break;
            } else {
                System.out.println("pilihan tidak tersedia");
                System.out.print("pilih jenis kamar : ");
            }
        }

        System.out.println("=========================================================");

        System.out.println("pilih jenis this.dokter");
        System.out.print("1. dokter anak : Dr. Azizul hakim\n");
        System.out.print("2. dokter Penyakit dalam : Dr. Melanie Tan\n");
        System.out.print("3. dokter Mata : Dr. Riyon\n");
        System.out.print("4. dokter Umum : Dr. Hendra\n");
        System.out.print("5. dokter Bedah Umum : Dr. Taufiq\n");
        System.out.print("pilihan anda [ 1/2/3/4/5]: ");

        while (true) {
            this.dokter = input.nextInt();
            if (this.dokter == 1) {
                this.namaDr = "Dr. Azizul hakim";
                this.jasaDr = 145000;
                break;
            } else if (this.dokter == 2) {
                this.namaDr = "Dr. Melanie Tan";
                this.jasaDr = 200000;
                break;
            } else if (this.dokter == 3) {
                this.namaDr = "Dr. Riyon";
                this.jasaDr = 170000;
                break;
            } else if (this.dokter == 4) {
                this.namaDr = "Dr. Hendra";
                this.jasaDr = 150000;
                break;
            } else if (this.dokter == 5) {
                this.namaDr = "Dr. Taufiq";
                this.jasaDr = 150000;
                break;
            } else {
                System.out.println("pilihan tidak tersedia");
                System.out.print("pilih jenis dokter : ");
            }
        };

        System.out.println("=========================================================\n");

        System.out.println(" TOTAL YANG HARUS DIBAYAR ");
        System.out.println("Atas nama : " + this.namaDr);
        System.out.println("Jasa dokter : Rp." + this.jasaDr);
        System.out.println("kamar inap : " + this.ruangan + " Rp." + this.hrgKamar);
        System.out.println("Lama menginap : " + this.lama + " hari");
        System.out.println("harga kamar : Rp." + this.hrgKamar * this.lama);
        System.out.print("total obat : Rp.");
        this.totalObat = input.nextInt();

        System.out.print("Tindakan : Rp.");
        this.tindakan = input.nextInt();

        this.totalBiaya = (this.jasaDr + (this.hrgKamar * this.lama) + this.totalObat + this.tindakan);
        System.out.println("total biaya: Rp." + this.totalBiaya);
        while(true){
            System.out.print("masukan uang anda : Rp.");
            this.uang = input.nextInt();
            if (this.uang < this.totalBiaya) {
                System.out.println("uang anda kurang");
            } else {
                System.out.println("kembalian : Rp." + (this.uang - this.totalBiaya));
                break;
            }
        }
    }

    @Override
    public void rawatJalan() {

        System.out.print("nama : ");
        this.name = input.nextLine();
        System.out.print("alamat : ");
        this.alamat = input.nextLine();
        System.out.print("jenis kelamin : ");
        this.jnskel = input.nextLine();

        System.out.print("umur anda : ");
        this.umur = input.nextInt();
        System.out.print("no. rekam medis : ");
        this.rm = input.nextInt();

        System.out.println("=========================================================");

        System.out.println("Pilih Poli: ");
        System.out.print("1. Poli Bedah Umum : Dr. Ryu Hasan\n");
        System.out.print("2. Poli Anak : Dr. Daniel\n");
        System.out.print("3. Poli Mata : Dr. Andi suherman\n");
        System.out.print("4. Poli Penyakit Dalam : Dr. Nainggolan\n");
        System.out.print("5. Poli Umum : Dr. Zaid assalafi\n");

        System.out.print("pilihan anda [ 1/2/3/4/5]: ");

        while (true) {
            this.pilihDr = input.nextInt();
            if (this.pilihDr == 1) {
                this.namaDr = "Dr. Ryu Hasan";
                this.jasaDr = 150000;
                break;
            } else if (this.pilihDr == 2) {
                this.namaDr = "Dr. Daniel";
                this.jasaDr = 200000;
                break;
            } else if (this.pilihDr == 3) {
                this.namaDr = "Dr. Andi suherman";
                this.jasaDr = 150000;
                break;
            } else if (this.pilihDr == 4) {
                this.namaDr = "Dr. Nainggolan";
                this.jasaDr = 175000;
                break;
            } else if (this.pilihDr == 5) {
                this.namaDr = "Dr. Zaid assalafi";
                this.jasaDr = 150000;
                break;
            } else {
                System.out.println("pilihan tidak tersedia");
                System.out.print("pilih jenis dokter : ");
            }
        }

        System.out.println("=========================================================");
        System.out.println(" TOTAL YANG HARUS DIBAYAR ");
        System.out.println("nama pasien : " + this.name);
        System.out.println("no. rekam medis : " + this.rm);
        System.out.println("Atas nama : " + this.namaDr);
        System.out.println("Jasa dokter : Rp." + this.jasaDr);
        System.out.print("total obat : Rp.");
        this.totalObat = input.nextInt();
        System.out.print("Tindakan : Rp.");
        this.tindakan = input.nextInt();

        this.totalBiaya = (this.jasaDr + this.totalObat + this.tindakan);
        System.out.println("total biaya: Rp." + this.totalBiaya);
        while (true) {
            System.out.print("masukan uang anda : Rp.");
            this.uang = input.nextInt();
            if (this.uang < this.totalBiaya) {
                System.out.println("uang anda kurang");
            } else {
                System.out.println("kembalian : Rp." + (this.uang - this.totalBiaya));
                break;
            }
        }
    }
}

public class Dokter extends Atributtdokter {
}
