/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;

/**
 *
 * @author ASUS
 */
public class AcBeraksi {
    public static void main(String[] args) {
        AcPolytron ac = new AcPolytron();
        
        System.out.println("status Ac saat ini: Mati");
        
        ac.hidupkan();
        ac.matikan();
        ac.matikan();
        ac.hidupkan();
        ac.hidupkan();
        
        System.out.println("status Ac saat ini: dingin");
        
        ac.dinginkan();
        ac.panaskan();
        ac.panaskan();
        ac.dinginkan();
        ac.dinginkan();
    }
}
