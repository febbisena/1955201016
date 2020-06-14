/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_6_DARING;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Loop_4_While {
    public static void main(String[] args) {
        //Membuat Variabel dan Scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while(running){
            System.out.println("Apakah Anda ingin keluar?");
            System.out.println("Jawab [ya/tidak]> ");
            
            jawab = scan.nextLine();
            
            //Cek jawabannya, kalau ya maka berhenti mengulang
            if(jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " +counter+ " kali");
    }
}
