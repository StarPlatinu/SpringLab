/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.config;

/**
 *
 * @author thanhvu
 */
import com.demo.impl.English;
import com.demo.language.Language;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.demo.bean")
public class AppConfig {
    @Bean(name = "language")
    public Language getLanguage(){
        return (Language) new English();
    }
}
