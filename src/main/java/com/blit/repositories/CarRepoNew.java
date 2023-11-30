package com.blit.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.blit.models.Car;

@Repository
public class CarRepoNew implements ICarRepo{

private List<Car> cars; 
	
	public CarRepoNew() {
		cars = new ArrayList<>();
		cars.add(new Car("Nissan", "Ultima", "Gold", 2023));
		cars.add(new Car("Dodge", "Challenger", "Pink", 2013));
		cars.add(new Car("Honda", "Odyssy", "Green", 2005));
	}
	
	
	@Override
	public List<Car> getAllCars() {
		return cars;
	}

	@Override
	public void addCar(Car car) {
		cars.add(car);
	}

	@Override
	public void updateCar(Car car, int index) {
		cars.add(index, car);
	}

	@Override
	public void deleteCar(int index) {
		cars.remove(index);
	}
}
