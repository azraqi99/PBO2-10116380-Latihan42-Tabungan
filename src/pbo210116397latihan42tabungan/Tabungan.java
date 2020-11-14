/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Tabungan
 */
package pbo210116397latihan42tabungan;

/**
 *
 * @author Zetro
 */
public class Tabungan {
    private int saldo;
      
    public Tabungan(int saldo){
         this.saldo = saldo;
    }
   
    public int ambilUang(int jumlah){
       return saldo - jumlah; 
    }
}
