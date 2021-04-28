package com.rodrigooliveira.aulacrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigooliveira.aulacrud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
