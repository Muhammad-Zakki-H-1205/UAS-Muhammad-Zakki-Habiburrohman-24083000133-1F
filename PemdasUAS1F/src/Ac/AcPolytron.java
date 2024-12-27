/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;

/**
 *
 * @author ASUS
 */
public class AcPolytron implements InterfaceAC {
  int statusAc;

public void hidupkan(){
    if (statusAc == KEADAAN_MATI){
        statusAc = KEADAAN_HIDUP;
        System.out.println("hidupkan Ac!--> Ac hidup");
    }else{
        System.out.println("hidupkan Ac!--> Ac sudah hidup kok");}
    }
public void matikan(){
    if (statusAc == KEADAAN_HIDUP){
        statusAc = KEADAAN_MATI;
        System.out.println("matikan Ac!--> Ac mati");
    }else{
        System.out.println("matikan Ac!--> Ac sudah mati kok");
    }
}  
public void dinginkan(){
    if (statusAc == KEADAAN_PANAS){
        statusAc = KEADAAN_PANAS;
        System.out.println("dinginkan Ac!--> Ac sudah dingin");
    }else{
        System.out.println("dinginkan Ac!--> Ac sudah dingin kok");}
    }
public void panaskan(){
    if (statusAc == KEADAAN_DINGIN){
        statusAc = KEADAAN_DINGIN;
        System.out.println("panaskan Ac!--> Ac sudah panas");
    }else{
        System.out.println("panaskan Ac!--> Ac sudah panas kok");
    }
}
}
