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
public class Vietnamese implements Language{

    @Override
    public String getGreeting() {
       return "Xin Chao";
    }

    @Override
    public String getBye() {
      return "Tam biet";
    }
    
}
