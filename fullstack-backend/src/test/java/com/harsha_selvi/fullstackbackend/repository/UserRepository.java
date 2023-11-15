package com.harsha_selvi.fullstackbackend.repository;

import com.harsha_selvi.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
