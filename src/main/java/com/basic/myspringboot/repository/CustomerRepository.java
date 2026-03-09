package com.basic.myspringboot.repository;

import com.basic.myspringboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer , Long> {
    //finder or query method
    //1. customerId(고객 번호)로 조회하는 finder메서드

    Optional<Customer> findByCustomerId(String customerId);

    //2.customerName(고객명)를 조회하는 finder 메서드 중복허용 한 값
    List<Customer> findByCustomerName(String customerName);


}
