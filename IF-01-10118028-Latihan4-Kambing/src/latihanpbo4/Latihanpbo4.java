/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo4;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-1 2018
   NIM       : 10118028
   DESKRIPSI : Kambing
 */
public class Latihanpbo4 {

    
    public void tambahKambing () {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : " +jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Latihanpbo4 kambingJantan = new Latihanpbo4();
        kambingJantan.tambahKambing();
    }
   
    
}
