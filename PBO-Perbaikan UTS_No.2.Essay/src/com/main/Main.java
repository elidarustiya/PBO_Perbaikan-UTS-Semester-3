package com.main;

/**
 *
 * @author ACER_Eli Darustiya_20210040068_TI21A
 */

import com.persegipanjang.PersegiPanjang;
import com.lingkaran.Lingkaran;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang : ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar persegi panjang : ");
        int lebar = input.nextInt();
        System.out.print("Masukkan jari-jari lingkaran : ");
        int jari = input.nextInt();
        
        PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);
        Lingkaran lingkaran = new Lingkaran(jari);
        
        System.out.print("Luas daerah yang diarsir adalah " + persegi.luas() + " cm - " + lingkaran.luas() + " cm = " + (persegi.luas() - lingkaran.luas()) + " cm");
    }
    
}
