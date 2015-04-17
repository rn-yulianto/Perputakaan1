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
public class Petugas {

    private String id;
    private String nama;
    
    public Petugas(){
        
    }

    public Petugas(String id, String nama) throws Exception {
        this.setId(id);
        try {
            this.setNama(nama);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
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
}

