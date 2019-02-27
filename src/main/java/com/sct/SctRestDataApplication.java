package com.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sct.entity.Item;
import com.sct.repository.ItemRepository;

@SpringBootApplication
@ComponentScan(basePackages={"com.sct"}) 
@EnableJpaRepositories(basePackageClasses={ItemRepository.class})
@EntityScan(basePackageClasses=Item.class)
public class SctRestDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SctRestDataApplication.class, args);
	}

}
