package com.springboot.parkinglot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class VehicleDTO {
	
	@Id
	private Long id;
	private String vehicleNumber;
	private String ownerName;
	
	
	//INSERT INTO VEHICLEDTO VALUES (10,'MH001','Sahil');
	//INSERT INTO VEHICLEDTO VALUES (9,'MH002','sam');

}
