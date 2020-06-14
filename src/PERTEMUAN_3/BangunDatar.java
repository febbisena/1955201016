/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_3;

/**
 *
 * @author USER
 */
public class BangunDatar {
    public static void main(String[] args) {
        //TUGAS 2
        //LUAS DAN KELILING BANGUN DATAR
        //Persegi panjang, segitiga, trapesium, lingkaran
        System.out.println("===LUAS DAN KELILING BANGUN DATAR===");
        System.out.println("PERSEGI PANJANG");
            int panjang = 10;
            int lebar = 5;
            int l_persegipanjang = panjang*lebar;
            int k_persegipanjang = 2*(panjang+lebar);
        System.out.println("    PANJANG     = " + panjang);
        System.out.println("    LEBAR       = " + lebar);
        System.out.println("    LUAS        = " + l_persegipanjang);
        System.out.println("    KELILING    = " + k_persegipanjang);
        
        System.out.println("SEGITIGA");
            double alas = 4.5;
            double tinggi = 7.5;
            double l_segitiga = 0.5*alas*tinggi;
            double k_segitiga = 3*alas;
        System.out.println("    ALAS        = " + alas);
        System.out.println("    TINGGI      = " + tinggi);
        System.out.println("    LUAS        = " + l_segitiga);
        System.out.println("    KELILING    = " + k_segitiga);
            
        System.out.println("TRAPESIUM");
            double sisi_atas = 4;
            double sisi_bawah = 8;
            double tinggi_tra = 3;
            double miring = 5;
            double l_trapesium = 0.5*(sisi_atas+sisi_bawah)*tinggi_tra;
            double k_trapesium = sisi_atas+sisi_bawah+tinggi_tra+miring;
        System.out.println("    SISI ATAS       = " + sisi_atas);
        System.out.println("    SISI BAWAH      = " + sisi_bawah);
        System.out.println("    SISI MIRING     = " + miring);
        System.out.println("    TINGGI          = " + tinggi_tra);
        System.out.println("    LUAS            = " + l_trapesium);
        System.out.println("    KELILING        = " + k_trapesium);
            
        System.out.println("LINGKARAN");
            double jari = 7;
            double phi = 3.14;
            double l_ling = phi*jari*jari;
            double k_ling = 2*phi*jari;
        System.out.println("    JARI-JARI   = " + jari);
        System.out.println("    LUAS        = " + l_ling);
        System.out.println("    KELILING    = " + k_ling);
    }
}
