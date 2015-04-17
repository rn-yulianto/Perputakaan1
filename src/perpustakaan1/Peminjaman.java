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
import java.text.SimpleDateFormat;

public class Peminjaman {
    private final long ONE_DAY = 24*60*60*1000;
    private Perpustakaan perpus;
    private Buku bukuPinjaman;
    private Peminjam peminjam;
    private Petugas petugas = null;
    private int denda;
    private Date waktuPinjam, waktuKembali;
    private boolean isKembali;
    
    public Peminjaman(Perpustakaan perpus, Buku buku, Peminjam peminjam){
        this.perpus = perpus;
        bukuPinjaman = buku;
        this.peminjam = peminjam;
        waktuPinjam = new Date();
        denda = 0;
        isKembali = false;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }
    
    private void hitungDenda(long keterlambatan){
        if (keterlambatan<=0) denda = 0;
        else denda = (int)Math.ceil(keterlambatan/ONE_DAY)*3000;
    }
    
    public void kembali(Date waktuKembali){
        this.waktuKembali = waktuKembali;
        long keterlambatan = waktuKembali.getTime()-(waktuPinjam.getTime()+4*ONE_DAY);
        hitungDenda(keterlambatan);
        isKembali = true;
    }
    public void cetak(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMMM/yyyy");
        System.out.println("###Rincian Peminjaman###");
        System.out.println("Nama Peminjam: "+peminjam.getNama());
        System.out.println("ID Peminjam: "+peminjam.getNoPeminjam()+"\n");
        System.out.println("Perputakaan: "+perpus.getNamaPerpus());
        System.out.println("Judul Buku (ISBN): "+bukuPinjaman.getJudul()+"("+bukuPinjaman.getIsbn()+")\n");
        System.out.println("Waktu Pinjam: "+dateFormat.format(waktuPinjam));
        System.out.println("Waktu Pengembalian: "+dateFormat.format(new Date(waktuPinjam.getTime()+4*ONE_DAY)));
        System.out.print("Waktu Dikembalikan: ");
        if(isKembali){
            System.out.println(dateFormat.format(waktuKembali));
            System.out.println("Denda: Rp. "+denda);
        }
        else System.out.println("Belum Dikembalikan");
        System.out.println("#########################\n");
    }
}
