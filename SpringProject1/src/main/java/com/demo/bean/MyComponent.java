/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author thanhvu
 */
@Component
public class MyComponent {
    @Autowired
    private MyRepository repository;
    
    public void showAppInfo(){
        System.out.println("Row is: "+repository.getDateTime());
        System.out.println("App name: "+repository.getAppName());
    }
}
