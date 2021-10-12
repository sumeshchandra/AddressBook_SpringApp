package com.example.addressbook_springapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j

@SpringBootApplication
public class AddressBookSpringAppApplication {

    public static void main(String[] args) {
        log.info("Welcome");
        SpringApplication.run(AddressBookSpringAppApplication.class, args);
    }

}
