package com.sachin.mapping.practice.controller;

import com.sachin.mapping.practice.model.Laptop;
import com.sachin.mapping.practice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laptops")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping
    public void createLaptop(@RequestBody Laptop laptop) {
        laptopService.createLaptop(laptop);
    }

    @GetMapping("/{id}")
    public Laptop getLaptopById(@PathVariable String id) {
        return laptopService.getLaptopById(id);
    }

    @PutMapping("/{id}")
    public void updateLaptop(@PathVariable String id, @RequestBody Laptop laptop) {
        laptop.setID(id);
        laptopService.updateLaptop(laptop);
    }

    @DeleteMapping("/{id}")
    public void deleteLaptopById(@PathVariable String id) {
        laptopService.deleteLaptopById(id);
    }
}