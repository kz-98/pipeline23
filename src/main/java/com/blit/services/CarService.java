package com.blit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.blit.models.Car;
import com.blit.repositories.ICarRepo;

@Service
public class CarService {
	private ICarRepo carRepo;
	
	@Autowired
	public CarService(ICarRepo carRepo) {
		this.carRepo=carRepo;
	}
	
	public List<Car> getAllCars(){
		return carRepo.getAllCars();
	}
	
	public void addCar(Car car) {
		carRepo.addCar(car);
	}
	
	public void updateCar(int index, Car car) {
		carRepo.updateCar(car, index);
	}
	
	public void deletCar(int index) {
		carRepo.deleteCar(index);
	}
	

}
