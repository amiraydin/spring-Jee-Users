package com.example.carServiceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/")
    public List<Car> chercherVpiture(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/jpa/cars";
        HttpHeaders myHeader = new HttpHeaders();
        myHeader.add("Content-Type", "application/json");
        HttpEntity<String> request = new HttpEntity<>(myHeader);
        ResponseEntity<Car[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, request, Car[].class);
        List<Car> cars = Arrays.asList(responseEntity.getBody());
        /*Car car = null;
        //if(cars.size() > 0){
            car = cars.get(0);
            String plaque = car.getPlaque();
            url = "http://localhost:8080/jpa/cars/" + plaque;
            ResponseEntity<Car> entityCar = restTemplate.getForEntity(url, Car.class);
            car = entityCar.getBody();
        }
        return car;*/
        return cars;
    }
    @GetMapping("/users")
    public Iterable<User> getUsers() {return userRepository.findAll();}

    @GetMapping("/users/{permis}")
    public User getUser(@PathVariable("permis") String licence) throws UserNotFoundException {

        User user = userRepository.findByPermis(licence);
        if (user == null) {
            throw new UserNotFoundException("Voiture non trouvée : " + licence);
        }
        return user;
    }

    @PutMapping("/users/{permis}/{carId}")
    public User userRent(@PathVariable("permis") String permit , @PathVariable("carId") int carID) throws UserNotFoundException {

        User user = userRepository.findByPermis(permit);
        if (user == null) {
            throw new UserNotFoundException("Voiture non trouvée : " + permit);
        }
        user.setIdCar(carID);
        return user;
    }

}