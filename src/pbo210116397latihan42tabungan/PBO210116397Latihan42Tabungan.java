/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Tabungan
 */
package pbo210116397latihan42tabungan;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("=======Program Penarikan Uang========");
        System.out.print("Masukkan Saldo Awal : " );
        Scanner scn = new Scanner(System.in);
        int saldo = scn.nextInt();
        
        System.out.print("Jumlah Uang Yang diambil : " );
        int ambil = scn.nextInt();
        
        Tabungan tbg = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang : " +tbg.ambilUang(ambil));
    }
    
}
