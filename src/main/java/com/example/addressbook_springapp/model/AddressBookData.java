package com.example.addressbook_springapp.model;

import com.example.addressbook_springapp.DTO.AddressBookDTO;
import lombok.Data;

@Data
public class AddressBookData {

    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int pincode;
    private double phoneNumber;


    public AddressBookData(int id, AddressBookDTO addressBookDto) {
        this.id = id;
        this.firstName = addressBookDto.firstName;
        this.lastName = addressBookDto.lastName;
        this.city = addressBookDto.city;
        this.state = addressBookDto.state;
        this.pincode = addressBookDto.pincode;
        this.phoneNumber = addressBookDto.phoneNumber;
    }
}
