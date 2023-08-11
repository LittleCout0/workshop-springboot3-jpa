package com.littlecouto.workshopspringboot.repositories;

import com.littlecouto.workshopspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
