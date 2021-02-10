package com.springboot.parkinglot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.parkinglot.model.MyIntroduction;
import com.springboot.parkinglot.model.VehicleDTO;
import com.springboot.parkinglot.service.ParkingService;
import java.util.List;

import lombok.Builder;


@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
	
	
	//API returns myIntrodution object
	@Autowired
	ParkingService parkingService;
	
	
	  @GetMapping("/aboutMe") public MyIntroduction aboutMe() { return
	  MyIntroduction.builder().name("Mehdi").age(25).skills("java and Spring boot")
	  .build(); }
	  
	  //API returns myIntrodution object
	  
	  @GetMapping("/infoAboutSomeone") public MyIntroduction
	  infoAboutSomeone(String name, int age, String skills) { return
	  MyIntroduction.builder().name(name).age(age).skills(skills).build(); }
	 
		
		@GetMapping("/parkingInfo")
		public List<VehicleDTO> getAllVehicles(){
			return parkingService.getAllVehicles();
		}
		
		@PostMapping("/park")
		public String park(VehicleDTO vehicleDTO) {
			return parkingService.park(vehicleDTO);
		}
		
		@DeleteMapping("/unpark")
		public String unpark(Long id) {
			return parkingService.unpark(id);
		}

}
