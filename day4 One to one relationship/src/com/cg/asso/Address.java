package com.cg.asso;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable{
	@Id
	@Column(name="ID")
	private int addressId;
	@Column(name="Street")
	private String Street;
	@Column (name="State")
	private String State;
	@Column(name="City")
	private String city;
	
	@OneToOne(mappedBy="address")
	private Employee employee;
	public Address() {
		super();
	}
	
	public Address(int addressId, String street, String state, String city) {
		super();
		this.addressId = addressId;
		this.Street = street;
		this.State = state;
		this.city = city;
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		this.Street = street;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + Street + ", state=" + State + ", city=" + city + "]";
	}
	
}
	
    
    
	


