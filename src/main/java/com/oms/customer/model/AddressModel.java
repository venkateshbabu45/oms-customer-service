package com.oms.customer.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "address")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class AddressModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6578461468403337081L;

	@Id
	private int addressId;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;

	public AddressModel() {
	}

	public AddressModel(int addressId, String street1, String street2, String city, String state, String zip) {
		super();
		this.addressId = addressId;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
