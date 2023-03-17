/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.demo.main;

import com.demo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author thanhvu
 */
public class HelloSpring {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
