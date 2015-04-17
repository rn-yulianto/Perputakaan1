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
import java.util.*;

public class Perpustakaan {
    private ArrayList<Buku> buku = new ArrayList<Buku>();
    private String namaPerpus, alamatPerpus;
    
    public Perpustakaan(){
        namaPerpus = "Anonymous";
    }
    public Perpustakaan(String nama){
        namaPerpus = nama;
    }
    public void tambahBuku(Buku buku){
        this.buku.add(buku);
    }
    
    public Buku getBuku(String isbn){
        Buku temp = null;
        for(Buku b : buku){
            if (b.getIsbn().equals(isbn)) temp = b;
        }
        return temp;
    }

    /**
     * @return the namaPerpus
     */
    public String getNamaPerpus() {
        return namaPerpus;
    }

    /**
     * @param namaPerpus the namaPerpus to set
     */
    public void setNamaPerpus(String namaPerpus) {
        this.namaPerpus = namaPerpus;
    }

    /**
     * @return the alamatPerpus
     */
    public String getAlamatPerpus() {
        return alamatPerpus;
    }

    /**
     * @param alamatPerpus the alamatPerpus to set
     */
    public void setAlamatPerpus(String alamatPerpus) {
        this.alamatPerpus = alamatPerpus;
    }
    
}
