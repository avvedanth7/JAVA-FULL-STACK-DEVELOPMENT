package com.avvedanth7.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avvedanth7.springbootdemo.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
