package com.gmail.marco.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.marco.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
