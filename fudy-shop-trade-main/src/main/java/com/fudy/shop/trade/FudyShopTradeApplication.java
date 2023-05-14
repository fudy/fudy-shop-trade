package com.fudy.shop.trade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.fudy.trade.infrastructure.mybatis.mapper")
@SpringBootApplication
public class FudyShopTradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FudyShopTradeApplication.class, args);
	}

}
