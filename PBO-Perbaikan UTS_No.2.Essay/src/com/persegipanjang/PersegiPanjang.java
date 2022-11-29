package com.persegipanjang;

import com.bangundatar.BangunDatar;

/**
 *
 * @author ACER_Eli Darustiya_20210040068_TI21A
 */

public class PersegiPanjang implements BangunDatar{
     private int panjang;
    private int lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {
        return panjang * lebar;
    }
    
}
