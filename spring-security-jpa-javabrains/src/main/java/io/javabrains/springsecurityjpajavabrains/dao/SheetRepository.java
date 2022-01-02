	package io.javabrains.springsecurityjpajavabrains.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springsecurityjpajavabrains.Entity.Sheet;

public interface SheetRepository extends JpaRepository<Sheet, Double> {

}
