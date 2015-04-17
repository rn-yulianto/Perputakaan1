/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan1;

/**
 *
 * @author Rn Yulianto
 */
import java.util.Date;
public class Perpustakaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        final long ONE_DAY = 24*60*60*1000;
        Perpustakaan perpus1 = new Perpustakaan("Maju Jaya");
        Petugas petugas1; Buku buku1=null; Peminjam peminjam1=null;
        try{
            peminjam1 = new Peminjam("Rio Bruneo", "331025");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            petugas1 = new Petugas("657rf6", "Gorgon");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            buku1 = new Buku("Rayuan Es Campur", "3674837628901");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        perpus1.tambahBuku(buku1);
        perpus1.tambahBuku(new Buku("Lulaby", "1234567890123"));
        perpus1.tambahBuku(new Buku("Boo", "1464567890123"));
        Peminjaman peminjaman1 = new Peminjaman(perpus1, perpus1.getBuku("3674837628901"), peminjam1);
        peminjaman1.cetak();
        peminjaman1.kembali(new Date(new Date().getTime()+(6*ONE_DAY)));
        peminjaman1.cetak(); //terlambat mengembalikan 1 hari denda 3000
    }
    
}
