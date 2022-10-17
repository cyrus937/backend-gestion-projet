package com.example.gestionprojet;

import controller.ProjetController;
import controller.TacheController;
import controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.ProjetRepository;
import repository.TacheRepository;
import repository.UserRepository;
import service.ProjetService;
import service.TacheService;
import service.UserService;

@ComponentScan(basePackageClasses = UserController.class)
@ComponentScan(basePackageClasses = UserService.class)
@ComponentScan(basePackageClasses = UserRepository.class)
@ComponentScan(basePackageClasses = ProjetController.class)
@ComponentScan(basePackageClasses = ProjetService.class)
@ComponentScan(basePackageClasses = ProjetRepository.class)
@ComponentScan(basePackageClasses = TacheController.class)
@ComponentScan(basePackageClasses = TacheService.class)
@ComponentScan(basePackageClasses = TacheRepository.class)
@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class GestionProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProjetApplication.class, args);
	}

}
