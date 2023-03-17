/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.bean;

import java.util.Date;
import org.springframework.stereotype.Repository;

/**
 *
 * @author thanhvu
 */
@Repository
public class MyRepository {
    public String getAppName(){
        return "Hello Sring App";
    }
    
    public Date getDateTime(){
        return new Date();
    }
        
}
