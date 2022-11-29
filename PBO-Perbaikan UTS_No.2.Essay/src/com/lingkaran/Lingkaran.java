package com.lingkaran;

import com.bangundatar.BangunDatar;

/**
 *
 * @author ACER_Eli Darustiya_20210040068_TI21A
 */

public class Lingkaran implements BangunDatar{
    private int jari;
    
    public Lingkaran(int jari) {
        this.jari = jari;

    }
    
    @Override
    public double luas() {
        return ( Math.PI * jari * jari) / 2 ;
    }
    
}
