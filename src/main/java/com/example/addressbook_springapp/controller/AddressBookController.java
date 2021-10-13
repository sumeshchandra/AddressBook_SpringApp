package com.example.addressbook_springapp.controller;


import com.example.addressbook_springapp.DTO.AddressBookDTO;
import com.example.addressbook_springapp.DTO.ResponseDTO;
import com.example.addressbook_springapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping({"/get", "", "/"})
    public ResponseEntity<ResponseDTO> getAddressBook() {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new AddressBookDTO("Sumesh", "Jena", "Rourkela", "Odisha", 769012, 987654321));
        ResponseDTO responseDto = new ResponseDTO("Get Success Call", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("Id") int Id) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new AddressBookDTO("Sumesh", "Jena", "Rourkela", "Odisha", 769012, 987654321));
        ResponseDTO responseDto = new ResponseDTO("Get call by Id : " + Id, addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Add Address Detail : ", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);

    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("AddressBook Updated : ", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<ResponseDTO> deleteAddressById(@PathVariable("Id") int Id) {
        ResponseDTO responseDto = new ResponseDTO("Deleted Successfully ", "Id Deleted : " + Id);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }
}







