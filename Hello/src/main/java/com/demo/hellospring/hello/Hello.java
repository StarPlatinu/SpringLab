/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.demo.hellospring.hello;

import com.demo.hellospring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author thanhvu
 */
public class Hello {
     private static ApplicationContext context;
    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
