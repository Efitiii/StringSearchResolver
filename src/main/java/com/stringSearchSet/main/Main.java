package com.stringSearchSet.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Efrem  on 4/28/19
 * @project SetContainsString
 */
@SpringBootApplication(scanBasePackages = {"com.stringSearchSet"})
public class Main extends SpringBootServletInitializer {


    public static void main(String[] args){
        new Main().configure(new SpringApplicationBuilder(Main.class)).run(args);
    }

}
