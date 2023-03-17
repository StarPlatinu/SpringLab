/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tightcoupling;

/**
 *
 * @author thanhvu
 */
public class VeryComplexService {
    //Ham xu ly rat phuc tap
    //Mot trong so do la sap xep data dau vao
   ISortAlgorithm sortAlgorithm;

   //still complex
//    public VeryComplexService() {
//        sortAlgorithm = new QuickSort();
//    }
   
       public VeryComplexService(ISortAlgorithm algorithm) {
        this.sortAlgorithm = algorithm;
    }
   
   
    public void complexFucntion(int[] numbers){
        sortAlgorithm.sort(numbers);
        
    }
        
}
