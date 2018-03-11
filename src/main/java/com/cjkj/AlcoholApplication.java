package com.cjkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cjkj.mapper")
public class AlcoholApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlcoholApplication.class, args);
	}
}
