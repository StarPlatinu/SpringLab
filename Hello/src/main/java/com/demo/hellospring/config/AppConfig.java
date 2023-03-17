/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.hellospring.config;

/**
 *
 * @author thanhvu
 */
import com.demo.hellospring.impl.English;
import com.demo.hellospring.language.Language;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.demo.hellospring.bean")
public class AppConfig {
    @Bean(name = "language")
    public Language getLanguage(){
        return new English();
    }
}
