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
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String category;

    public Buku(String judul, String isbn) throws Exception{
        pengarang = "-";  category = "-";
        setJudul(judul);
        try{
            setIsbn(isbn);
        } catch (Exception e){
            throw e;
        }
    }
    
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the pengarang
     */
    public String getPengarang() {
        return pengarang;
    }

    /**
     * @param pengarang the pengarang to set
     * @throws java.lang.Exception
     */
    public void setPengarang(String pengarang) throws Exception {
        for (char c : pengarang.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama tidak boleh "
                        + "mengandung angka");
            }
        }
        this.pengarang = pengarang;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) throws Exception {
        for (char c : isbn.toCharArray()) {
            if (!Character.isDigit(c)||isbn.length()!=13) {
                throw new Exception("ISBN buku harus berupa angka dan digitnya berjumlah 13");
            }
        }
        this.isbn = isbn;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
}
