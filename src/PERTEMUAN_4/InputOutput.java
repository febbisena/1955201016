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
public class InputOutput {
    public static void main(String[] args) {
        Scanner inputNilai = new Scanner(System.in);
        System.out.println("Inputkan Nilai Angka 0-100");
        
        int tampungNilai = inputNilai.nextInt();
        System.out.println("Nilai : " + tampungNilai);
    }
}
