/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIm   : 10119039
 * Deskripsi Program : berisi program nilai mahasiswa menggunakan pendekatan objek
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa mahasiswa = new NilaiMahasiswa();
        mahasiswa.setQuiz(60);
        mahasiswa.setUts(80);
        mahasiswa.setUas(75);
        
        
        System.out.println("QUIZ\t\t= " + mahasiswa.getQuiz());
        System.out.println("UTS\t\t=" + mahasiswa.getUts());
        System.out.println("UAS\t\t=" + mahasiswa.getUas());
        
        mahasiswa.setNilaiAkhir(mahasiswa.hitungNilaiAkhir());
        System.out.println("\nNilai Akhir\t= " + mahasiswa.getNilaiAkhir());
        
        
        mahasiswa.setIndex(mahasiswa.indexNilai(mahasiswa.getNilaiAkhir()));
        System.out.println("\nIndex\t\t= " + mahasiswa.getIndex());
        
        mahasiswa.setKeterangan(mahasiswa.keteranganIndex(mahasiswa.getIndex()));
        System.out.println("Keterangan\t= ".concat(mahasiswa.getKeterangan()));
        }
    }
    

