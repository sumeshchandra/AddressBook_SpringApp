package com.example.addressbook_springapp.DTO;

import lombok.Data;

@Data
public class AddressBookDTO {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String pincode;
    private String phoneNumber;
}
