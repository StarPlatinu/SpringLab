/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dependencyinjection;

/**
 *
 * @author thanhvu
 */
public class Girl {
    private String name;
    private IOutfit outfit;
    
    public Girl(String name,IOutfit outfit) {
        this.name = name;
        this.outfit = outfit;
    }

    public void setOutfit(IOutfit outfit) {
        this.outfit = outfit;
    }
    
    
      public void showOutfit(){
          System.out.println("CO gai: "+this.name);
          outfit.wear();
      }
}
