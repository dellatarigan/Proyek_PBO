/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legendaapp;

/**
 *
 * @author ASUS
 */
class Mahasiswa {
    private String id_mahasiswa, nama, pelanggaran;
    private int poin_dimasukkan;
    private int semester_pemasukkan;
    
    public Mahasiswa(String id_mahasiswa, String nama,String pelanggaran, int poin_dimasukkan, int semester_pemasukkan){
       this.id_mahasiswa = id_mahasiswa;
       this.nama = nama;
       this.pelanggaran = pelanggaran;
       this.poin_dimasukkan = poin_dimasukkan;
       this.semester_pemasukkan = semester_pemasukkan;
        
    }

    Mahasiswa(String string, String string0, String string1, int aInt, String string2, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public String getID(){
        return id_mahasiswa;
    }
        public String getNAMA(){
        return nama;
    }
        
        public String getPELANGGARAN(){
        return pelanggaran;
    }
        public int getPOIN(){
        return poin_dimasukkan;
    }
        public int getSEMESTER(){
        return semester_pemasukkan;
    }
}

