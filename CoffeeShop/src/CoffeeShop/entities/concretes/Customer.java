package CoffeeShop.entities.concretes;

import CoffeeShop.entities.abstracts.Entity;
import java.time.LocalDate;

public class Customer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityIdentity;
	
	
	//bo� constructor(get-set kullan�m� i�in gerek)
	public Customer() {
		
	}


	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityIdentity = nationalityIdentity;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate DateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityIdentity() {
		return nationalityIdentity;
	}
	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}
	

}
