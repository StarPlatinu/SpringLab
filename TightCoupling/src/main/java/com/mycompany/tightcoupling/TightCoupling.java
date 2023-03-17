/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tightcoupling;

/**
 *
 * @author thanhvu
 */
public class TightCoupling {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        ThanhSort sort = new ThanhSort();
        VeryComplexService services = new VeryComplexService(sort);
        int[] numbers = new int[]{1,2,3,4,5};
        services.complexFucntion(numbers);
    }
}
