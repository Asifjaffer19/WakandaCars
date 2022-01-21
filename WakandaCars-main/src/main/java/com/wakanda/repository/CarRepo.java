package com.wakanda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wakanda.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {

}
