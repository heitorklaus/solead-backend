package com.buracosapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.buracosapp.model.Post;
import com.buracosapp.repository.PostRepository;

@SpringBootApplication
public class buracosAppMain {

	public static void main(String[] args) {
		SpringApplication.run(buracosAppMain.class, args);
	}
}
