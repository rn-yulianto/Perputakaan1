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
public class Peminjam {
    private String nama, noPeminjam, alamatPeminjam;
    
    public Peminjam(String nama) throws Exception{
        try{
            setNama(nama);
        } catch (Exception e){
            throw e;
        }
    }
    public Peminjam(String nama, String id) throws Exception{
        try{
            setNama(nama);
            setNoPeminjam(id);
        } catch (Exception e){
            throw e;
        }
    }
    
    public void setNoPeminjam(String noPeminjam) throws Exception {
        for (char c : noPeminjam.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new Exception("no Peinjam harus berupa angka");
            }
        }
        this.noPeminjam = noPeminjam;
    }
    
    public String getNoPeminjam(){
        return noPeminjam;
    }
    
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) throws Exception {
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama tidak boleh "
                        + "mengandung angka");
            }
        }
        this.nama = nama;
    }

    /**
     * @return the alamatPeminjam
     */
    public String getAlamatPeminjam() {
        return alamatPeminjam;
    }

    /**
     * @param alamatPeminjam the alamatPeminjam to set
     */
    public void setAlamatPeminjam(String alamatPeminjam) {
        this.alamatPeminjam = alamatPeminjam;
    }
}
