package com.uniin.mybatisPlus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动通用主程序
 * @EnableCaching使用了redis开启缓存
 * @EnableSwagger2开启swagger
 * @author zhangyy
 */
@MapperScan("com.uniin.mybatisPlus.mapper")
@SpringBootApplication
@EnableCaching
@EnableSwagger2
public class MybatisServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisServiceApplication.class, args);
    }
}
