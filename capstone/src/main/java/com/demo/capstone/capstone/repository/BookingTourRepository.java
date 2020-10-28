package com.demo.capstone.capstone.repository;

import com.demo.capstone.capstone.entity.Bookingtour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingTourRepository extends JpaRepository<Bookingtour, Integer> {
}
