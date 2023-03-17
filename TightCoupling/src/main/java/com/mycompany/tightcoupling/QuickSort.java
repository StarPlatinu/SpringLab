/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tightcoupling;

/**
 *
 * @author thanhvu
 */
public class QuickSort implements ISortAlgorithm{
    public void xapsep(int[] mangso){
        System.out.println("mang quiclsort");
    }

    @Override
    public void sort(int[] number) {
        xapsep(number);    
    }
}
