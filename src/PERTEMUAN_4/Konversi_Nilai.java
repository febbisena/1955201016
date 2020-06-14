/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Konversi_Nilai {
    public static void main(String[] args) {
        
        Scanner inputNilai = new Scanner(System.in);
        System.out.println("Inputkan Nilai Angka 0-100");
        
        int nilai = inputNilai.nextInt();
        System.out.println("Nilai : " + nilai);
        
        if(nilai >= 91 && nilai <= 100){
            System.out.println("A");
        }
        else if(nilai >= 86 && nilai < 91){
            System.out.println("A-");
        }
        else if(nilai >=81 && nilai < 86){
            System.out.println("B+");
        }
        else if(nilai >= 76 && nilai < 81){
            System.out.println("B");
        }
        else if(nilai >=71 && nilai < 76){
            System.out.println("B-");
        }
        else if(nilai >= 66 && nilai < 71){
            System.out.println("C+");
        }
        else if(nilai >= 61 && nilai < 66){
            System.out.println("C");
        }
        else if(nilai >= 56 && nilai < 61){
            System.out.println("C-");
        }
        else if(nilai >= 51 && nilai < 56){
            System.out.println("D");
        }
        else if(nilai >= 0 && nilai < 51){
            System.out.println("E");
        }
        else{
            System.out.println("Nilai Salah");
        }
    }
}
