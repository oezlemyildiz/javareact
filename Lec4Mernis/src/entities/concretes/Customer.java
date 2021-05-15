package entities.concretes;

import entities.abstracts.Entities;

public class Customer implements Entities {
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public String nationality;
	
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationality) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
	}
	
}
