package io.javabrains.springsecurityjpajavabrains.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springsecurityjpajavabrains.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


 public	User findByUsername(String username);


}
