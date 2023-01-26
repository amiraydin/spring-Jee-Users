package com.example.carServiceUser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;

@SpringBootApplication
public class CarServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceUserApplication.class, args);
	}

	@Bean
	public CommandLineRunner CarServiceUserApplication(UserRepository userRepository) {
		return (args) -> {
			User user = new User("Aydin", "Amir", "ABBA77");
			User user1 = new User("Erkan", "yunus", "ABBA66");
			User user2 = new User("Brati", "Adam", "ABBA55");
			//Dates date1= new Dates("9/3/2022", "2/1/2023");
			//car.setDates(date1);
			//date1.setCar(car1);
			userRepository.save(user);
			userRepository.save(user1);
			userRepository.save(user2);

			Iterator<User> users = userRepository.findAll().iterator();
			while (users.hasNext()) {
				User c = users.next();
				System.out.println(c.getNom() + " " + c.getPrenom() + " " + c.getPermis());
			}
			user = userRepository.findByPermis("ABBA77");
			System.out.println(user);
		};
	}
}
