package com.TestdataTypes;

import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;

public class User {

	private String id;
	private LoginCredentail loginCredentail;
	private List<Item> items = null;
	private Address address;
	private Payment payment;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LoginCredentail getLoginCredentail() {
		return loginCredentail;
	}

	public void setLoginCredentail(LoginCredentail loginCredentail) {
		this.loginCredentail = loginCredentail;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("loginCredentail", loginCredentail)
				.append("items", items).append("address", address).append("payment", payment).toString();
	}

}
