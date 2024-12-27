/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankBni;

/**
 *
 * @author ASUS
 */
public class BankBni {
    int saldo;
    
    public BankBni(int saldo){
        this.saldo = saldo;
    }
    public void getSaldo(){
        System.out.println("Selamat datang di BankBni");
        System.out.println("Saldo saat ini " + saldo);
    }
    public void simpanUang(int tambah){
        System.out.println("Simpan uang " + tambah);
        saldo += tambah;
        System.out.println("Saldo saat ini " + saldo);
    }
    public void ambilUang(int kurang){
        System.out.println("Ambil uang " + kurang);
        saldo -= kurang;
        System.out.println("Saldo saat ini " + saldo);
    }
}