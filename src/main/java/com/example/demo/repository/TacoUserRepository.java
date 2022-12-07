package com.example.demo.repository;

import com.example.demo.security.TacoUser;
import org.springframework.data.repository.CrudRepository;

public interface TacoUserRepository extends CrudRepository<TacoUser, Long> {
    TacoUser findByUsername(String name);
}
