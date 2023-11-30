package com.blit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blit.models.Car;
import com.blit.services.CarService;

@Controller
@ResponseBody
@RequestMapping("/car")
public class CarController {
	
	
	public CarService carService;
	
	@Autowired //Setter injection
	public void setCarService(CarService carService) {
		this.carService = carService;
	}

	@GetMapping
	public List<Car> getAllCars(){
		return carService.getAllCars();
	}
	
	@PostMapping
	public ResponseEntity addCar(@RequestBody Car car) {
		carService.addCar(car);
		return ResponseEntity.status(201).build();
	}
	
	@PutMapping("/{index}")
	public ResponseEntity updateCar(@PathVariable int index, @RequestBody Car car) {
		carService.updateCar(index, car);
		return ResponseEntity.accepted().build();
	}
	
	@DeleteMapping("/{index}")
	public ResponseEntity deleteCar(@PathVariable int index) {
		carService.deletCar(index);
		return ResponseEntity.accepted().build();
	}
}
