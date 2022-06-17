package dokter;

import java.util.Scanner;
import Latihan.rumahsakit.dokter.Dokter;

public class Main{
    public static void main(String[] args) {
        int pilihan;
        char choice;
        Scanner input = new Scanner(System.in);
        Dokter dok = new Dokter();
        
        System.out.println("pilih no Rawat : ");
        System.out.println("1. Rawat Inap");
        System.out.println("2. Rawat Jalan");
        System.out.print("Pilih [1 / 2]: ");
        
        pilihan = input.nextInt();
        if(pilihan == 1){
            dok.rawatInap();
        }else if(pilihan == 2){
            dok.rawatJalan();
        }else{
            System.out.println("pilihan tidak tersedia");
        }

        System.out.print("\nApakah anda ingin mengulangi program? [y/n]: ");
        choice = input.next().charAt(0);
        if(choice == 'y'){
            main(args);
        }else{
            System.out.println("Terima Kasih telah menggunakan jasa kami");    
        }
        input.close();
    }  
}
