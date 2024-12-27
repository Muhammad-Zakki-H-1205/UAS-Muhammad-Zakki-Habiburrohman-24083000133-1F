/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author ASUS
 */
public class MobilBerkasi {
    public static void main(String[] args) {
        // buat object baru
        MobilBalap Mobil = new MobilBalap();
        
        // memanggil attribute dan memberikan nilai
        Mobil.warna = "biru";
        Mobil.tahunProduksi = 2025;
        
        // tampilkan hasilnya
        System.out.println("warna : " + Mobil.warna);
        System.out.println("Tahun Produksi : " + Mobil.tahunProduksi);
    }
}
