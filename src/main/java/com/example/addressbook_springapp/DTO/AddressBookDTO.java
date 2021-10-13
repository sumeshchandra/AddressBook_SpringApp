package com.example.addressbook_springapp.DTO;

import lombok.Data;

@Data
public class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public int pincode;
    public double phoneNumber;

    public AddressBookDTO(String firstName, String lastName, String city,
                          String state, int pincode, double phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
    }
}
