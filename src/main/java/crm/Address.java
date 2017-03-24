package com.relleom.crm;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.hibernate.validator.constraints.NotEmpty;

public class Address {
    @Id private String id;
    @NotEmpty private String streetAddress;
    @NotEmpty private String city;
    @NotEmpty private String state;
    @NotEmpty private String postalCode;
    @NotEmpty private String country;

	public Address getId(){
		return this;
	}
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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

    public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
