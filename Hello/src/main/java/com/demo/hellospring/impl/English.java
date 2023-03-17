/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.hellospring.impl;

import com.demo.hellospring.language.Language;

/**
 *
 * @author thanhvu
 */
public class English implements Language{

    @Override
    public String getGreeting() {
       return "Hello";
    }

    @Override
    public String getBye() {
        return "Good Bye";
    }
    
}
