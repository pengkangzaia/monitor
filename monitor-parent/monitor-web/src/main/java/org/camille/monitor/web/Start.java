package org.camille.monitor.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 彭康
 * @create 2021-05-23 20:17
 **/
@SpringBootApplication
@ComponentScan("org.camille.monitor")
@MapperScan("org.camille.monitor.dao")
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }


}
