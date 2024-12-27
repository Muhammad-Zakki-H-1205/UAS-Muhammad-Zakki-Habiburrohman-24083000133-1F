/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankBni;

/**
 *
 * @author ASUS
 */
public class BankBeraksi {
    public static void main(String[] args) {
        BankBni bank = new BankBni (100000);
        bank.getSaldo();
        bank.simpanUang(150000);
        bank.ambilUang(100000);
    }
}
