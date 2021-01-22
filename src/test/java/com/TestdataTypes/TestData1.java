
package com.TestdataTypes;

import java.util.List;

public class TestData1 {

    public String ID;
    public LoginCredentail loginCredentail;
    public List<Item> items = null;
    public Address address;
    public Payment payment;
    
    public class LoginCredentail {

        public String username;
        public String password;

    }
    
    public class Item {

        public String url;
        public String size;
        public String quantity;

    }
    
    public class Address {

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

}
