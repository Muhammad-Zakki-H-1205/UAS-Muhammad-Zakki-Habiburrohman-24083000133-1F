/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikawell;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggih extends MatematikaWell{
    int hasil;
    double hasilDouble;
    
    public void modulus(int a, int b){
        hasil = a % b;
    }
    public void modulus(int a, int b, int c){
        hasil = a % b % c;
    }
    public void modulus(double a, double b, double c){
        hasilDouble = a % b % c;
    }
    public void modulus(double a, double b){
        hasilDouble = a % b;
    }
    
    int getHasil(){
        return hasil;
    }
    
    double getHasilDouble(){
        return hasilDouble;
    }
}
