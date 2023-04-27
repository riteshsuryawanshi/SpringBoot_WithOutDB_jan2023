package com.jbk;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.jbk.model.Product;

@SpringBootApplication

public class SpringBootWithoutDbJan2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithoutDbJan2023Application.class, args);
	}

	

}
