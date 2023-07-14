package com.sachin.mapping.practice.repository;

import com.sachin.mapping.practice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {
}
