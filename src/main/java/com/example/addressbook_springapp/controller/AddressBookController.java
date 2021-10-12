package com.example.addressbook_springapp.controller;


import com.example.addressbook_springapp.DTO.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping({"/get", "", "/"})
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String>("Get call successful for data", HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<String> getAddressBookDataById(@PathVariable("Id") int Id) {
        return new ResponseEntity<String>("Get call successful for id : " + Id, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Created new contact " + addressBookDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateData(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Updated Data successful :" + addressBookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> deleteDataById(@PathVariable("Id") int Id) {
        return new ResponseEntity<String>("deleted data for Id :" + Id, HttpStatus.OK);
    }
}
