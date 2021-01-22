package com.TestdataTypes;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Address {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String homePh;
	private String mobilePh;
	private String addressTitle;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHomePh() {
		return homePh;
	}

	public void setHomePh(String homePh) {
		this.homePh = homePh;
	}

	public String getMobilePh() {
		return mobilePh;
	}

	public void setMobilePh(String mobilePh) {
		this.mobilePh = mobilePh;
	}

	public String getAddressTitle() {
		return addressTitle;
	}

	public void setAddressTitle(String addressTitle) {
		this.addressTitle = addressTitle;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("firstName", firstName).append("lastName", lastName)
				.append("address", address).append("city", city).append("state", state).append("zip", zip)
				.append("country", country).append("homePh", homePh).append("mobilePh", mobilePh)
				.append("addressTitle", addressTitle).toString();
	}

}