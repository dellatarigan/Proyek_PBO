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
class User {
    private String id_mahasiswa, nama, jurusan;
    private int poin;
    private String gelar;
    private int semester;
    
    public User(String id_mahasiswa, String nama, String jurusan, int poin, String gelar, int semester){
       this.id_mahasiswa = id_mahasiswa;
       this.nama = nama;
       this.jurusan = jurusan;
       this.poin = poin;
       this.gelar = gelar;
       this.semester = semester;
        
    }
        public String getNIM(){
        return id_mahasiswa;
    }
        public String getNama(){
        return nama;
    }
        public String getJurusan(){
        return jurusan;
    }
        public int getPoin(){
        return poin;
    }
        public String getGelar(){
        return gelar;
    }
        public int getSemester(){
        return semester;
    }
}

