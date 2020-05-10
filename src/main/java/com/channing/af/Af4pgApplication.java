package com.channing.af;

import com.channing.af.entity.Goods;
import com.channing.af.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Af4pgApplication {
	@Autowired
	private GoodsService goodsService;

	public static void main(String[] args) {
		SpringApplication.run(Af4pgApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		Goods goods = new Goods();
		goods.setGDesc("I am a test goods");
		goods.setGName("good goods");
		goods.setGSize(123);
		return args -> {
			goodsService.save(goods);
		};
	}
}
