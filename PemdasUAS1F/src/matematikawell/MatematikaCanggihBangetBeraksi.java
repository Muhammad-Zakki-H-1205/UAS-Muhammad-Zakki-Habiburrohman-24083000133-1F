/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikawell;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mat = new MatematikaCanggihBanget();
        
        mat.pertambahan(5, 5);
        System.out.println("pertambahan 5 + 5 = " + mat.operasi);
        mat.perkalian(5, 2);
        System.out.println("perkalian 5 * 2 = " + mat.operasi);
        mat.modulus(3, 1);
        System.out.println("modulus 3 % 1 = " + mat.operasi);
        mat.pertambahanTiga(5, 10, 5);
    }
}
