package com.blit.repositories;

import java.util.List;

import com.blit.models.Car;

public interface ICarRepo {
	
	public List<Car> getAllCars();
	public void addCar(Car car);
	public void updateCar(Car car, int index); 
	public void deleteCar(int index); 

}
