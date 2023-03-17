/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dependencyinjection;

/**
 *
 * @author thanhvu
 */
public class DependencyInjection {

    public static void main(String[] args) {
        //use fied to inject 
        Girl normalGirl = new Girl("normal",new TShirt());//interface to inject
        normalGirl.showOutfit();
        //use setter to inject
        normalGirl.setOutfit(new Bikini());
    }
}
