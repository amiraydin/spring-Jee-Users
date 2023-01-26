package com.example.carServiceUser;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByPermis(String permis);
}
