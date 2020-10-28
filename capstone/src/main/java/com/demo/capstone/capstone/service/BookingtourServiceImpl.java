package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.Bookingtour;
import com.demo.capstone.capstone.repository.BookingTourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingtourServiceImpl implements BookingtourService{
    @Autowired
    private BookingTourRepository bookingTourRepository;

    @Override
    public Bookingtour saveBookingtour(Bookingtour bookingtour) {
        return bookingTourRepository.save(bookingtour);
    }
}
