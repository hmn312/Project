package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.cssl.dao")
@SpringBootApplication
public class APP {

    public static void main(String[] args) {
        SpringApplication.run(APP.class, args);
    }

}
