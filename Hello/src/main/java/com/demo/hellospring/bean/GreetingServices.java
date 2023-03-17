/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.hellospring.bean;

import com.demo.hellospring.language.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author thanhvu
 */
@Service
public class GreetingServices {
    private Language  language;

    public GreetingServices() {
    }
    
    
    @Autowired
    public GreetingServices(Language languge){
        this.language = languge;
    }
    
    public void sayGreeting(){
        System.out.println("Greeting: "+language.getGreeting());
    }
        
        
}
