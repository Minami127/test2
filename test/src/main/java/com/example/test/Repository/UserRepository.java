package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.test.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
