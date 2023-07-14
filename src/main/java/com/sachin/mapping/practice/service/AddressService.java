package com.sachin.mapping.practice.service;

import com.sachin.mapping.practice.model.Address;
import com.sachin.mapping.practice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private IAddressRepo addressRepo;

    public void createAddress(Address address) {
        addressRepo.save(address);
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElse(null);
    }

    public void updateAddress(Address address) {
        addressRepo.save(address);
    }

    public void deleteAddressById(Long id) {
        addressRepo.deleteById(id);
    }
}








