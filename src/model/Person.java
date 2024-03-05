package model;

import java.time.LocalDate;

public class Person {
	private int id;
	private String name;
	private String email;	
	private String phone;
	private LocalDate birthDate;

	public Person(int id, String name, String email, String phone, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.birthDate = birthDate;
	}
	
	
}
