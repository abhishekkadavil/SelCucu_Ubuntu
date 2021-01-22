
package com.TestdataTypes;

import java.util.List;

public class TestData2 {

    public String ID;
    public LoginCredentail loginCredentail;
    public List<Item> items = null;
    public Address address;
    public Payment payment;
    
    public class LoginCredentail {

        @Override
		public String toString() {
			return "LoginCredentail [username=" + username + ", password=" + password + "]";
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String username;
        public String password;

    }
    
    public class Item {

        @Override
		public String toString() {
			return "Item [url=" + url + ", size=" + size + ", quantity=" + quantity + "]";
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String url;
        public String size;
        public String quantity;

    }
    
    public class Address {

        @Override
		public String toString() {
			return "Address [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
					+ city + ", state=" + state + ", zip=" + zip + ", country=" + country + ", home=" + home
					+ ", mobile=" + mobile + ", addressTitle=" + addressTitle + "]";
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
		public String getHome() {
			return home;
		}
		public void setHome(String home) {
			this.home = home;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getAddressTitle() {
			return addressTitle;
		}
		public void setAddressTitle(String addressTitle) {
			this.addressTitle = addressTitle;
		}
		public String firstName;
        public String lastName;
        public String address;
        public String city;
        public String state;
        public String zip;
        public String country;
        public String home;
        public String mobile;
        public String addressTitle;

    }
    
    public class Payment {

        public String pmtType;

    }

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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
		return "TestData2 [ID=" + ID + ", loginCredentail=" + loginCredentail + ", items=" + items + ", address="
				+ address + ", payment=" + payment + ", getID()=" + getID() + ", getLoginCredentail()="
				+ getLoginCredentail() + ", getItems()=" + getItems() + ", getAddress()=" + getAddress()
				+ ", getPayment()=" + getPayment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
