package com.sachin.mapping.practice.controller;

import com.sachin.mapping.practice.model.Address;
import com.sachin.mapping.practice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public void createAddress(@RequestBody Address address) {
        addressService.createAddress(address);
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    @PutMapping("/{id}")
    public void updateAddress(@PathVariable Long id, @RequestBody Address address) {
        address.setAddressId(id);
        addressService.updateAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddressById(@PathVariable Long id) {
        addressService.deleteAddressById(id);
    }
}
