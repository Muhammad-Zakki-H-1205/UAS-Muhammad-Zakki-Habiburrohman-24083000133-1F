/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikawell;

/**
 *
 * @author ASUS
 */
public class MatematikaMudahBukan {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        
        mtk.pertambahan(23, 34);
        System.out.println("pertambahan 23 + 34 = " + mtk.operasi);
        
        mtk.pertambahan(3.4, 4.9);
        System.out.println("pertambahan 3.4 + 4.9 = " + mtk.operasiDouble);
        
        mtk.pertambahan(12, 28, 14);
        System.out.println("pertambahan 12 + 28 + 14 = " + mtk.operasi);
        
        mtk.pertambahan(12.5, 28.7, 14.2);
        System.out.println("pertambahan 12.5 + 28.7 + 14.2 = " + mtk.operasiDouble);
        
        mtk.pengurangan(23, 34);
        System.out.println("pengurangan 23 - 34 = " + mtk.operasi);
        
        mtk.pengurangan(3.4, 4.9);
        System.out.println("pengurangan 3.4 - 4.9 = " + mtk.operasiDouble);
        
        mtk.pengurangan(12, 28, 14);
        System.out.println("pengurangan 12 - 28 - 14 = " + mtk.operasi);
        
        mtk.pengurangan(12.5, 28.7, 14.2);
        System.out.println("pengurangan 12 - 28 - 14 = " + mtk.operasiDouble);
        
        mtk.perkalian(23, 34);
        System.out.println("perkalian 23 * 34 = " + mtk.operasi);
        
        mtk.perkalian(3.4, 4.9);
        System.out.println("perkalian 3.4 * 4.9 = " + mtk.operasiDouble);
        
        mtk.perkalian(12, 28, 14);
        System.out.println("perkalian 12 * 28 * 14 = " + mtk.operasi);
        
        mtk.perkalian(12.5, 28.7, 14.2);
        System.out.println("perkalian 12.5 * 28.7 * 14.2 = " + mtk.operasiDouble);
        
        mtk.pembagian(23, 34);
        System.out.println("pembagian 23 / 34 = " + mtk.operasi);
        
        mtk.pembagian(3.4, 4.9);
        System.out.println("pembagian 3.4 / 4.9 = " + mtk.operasiDouble);
        
        mtk.pembagian(12, 28, 14);
        System.out.println("pembagian 12 / 28 / 14 = " + mtk.operasi);
        
        mtk.pembagian(12.5, 28.7, 14.2);
        System.out.println("pembagian 12.5 / 28.7 / 14.2 = " + mtk.operasiDouble);
        
        mtk.modulus(23, 34);
        System.out.println("hasil modulus = " + mtk.hasil);
        
        mtk.modulus(12, 28, 14);
        System.out.println("hasil modulus = " + mtk.hasil);
        
        mtk.modulus(3.4, 4.9);
        System.out.println("hasil modulus = " + mtk.hasilDouble);
        
        mtk.modulus(12.5, 28.7, 14.2);
        System.out.println("hasil modulus = " + mtk.hasilDouble);
        
    }
}
