package com.example.mock1.repository;

import com.example.mock1.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<employee,Integer> {
}
