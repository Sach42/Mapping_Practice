package com.sachin.mapping.practice.service;

import com.sachin.mapping.practice.model.Laptop;
import com.sachin.mapping.practice.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private ILaptopRepo laptopRepo;

    public void createLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public Laptop getLaptopById(String id) {
        return laptopRepo.findById(id).orElse(null);
    }

    public void updateLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public void deleteLaptopById(String id) {
        laptopRepo.deleteById(id);
    }
}
