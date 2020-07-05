package com.xizi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xizi.dao")  //扫描所有dao接口
public class EmsThyemleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmsThyemleafApplication.class, args);
    }

}
