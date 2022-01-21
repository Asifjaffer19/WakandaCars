package com.wakanda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wakanda.entity.Car;
import com.wakanda.repository.CarRepo;


@Service
public class CarService {
	@Autowired
	private CarRepo repo;
	
	public void addCar(Car c)
	{
		repo.save(c);
	}
	
	  public List<Car> getAllCars() { return repo.findAll(); }
	  
		
		  public Car getCarById(int carid)
		  {
        Optional<Car> c = repo.findById(carid); 
		  if(c.isPresent()) 
		  { 
			  return c.get();
		  }
		  return null;
		  
		  }
		  
			 public void deleteCar(int carid) 
			 {
				 repo.deleteById(carid); 
			 } 
		 

}

