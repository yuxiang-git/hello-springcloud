package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//读取不了本地yml文件
@SpringBootApplication
public class NativeConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigClientApplication.class,args);
    }
}
