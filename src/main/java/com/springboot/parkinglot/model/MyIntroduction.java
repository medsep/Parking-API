package com.springboot.parkinglot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyIntroduction {

	private String name;
	private String skills;
	private int age;

}
