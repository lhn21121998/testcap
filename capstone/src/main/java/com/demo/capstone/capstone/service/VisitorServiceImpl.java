package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.Visitor;
import com.demo.capstone.capstone.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorServiceImpl implements VisitorService{

    @Autowired
    private VisitorRepository visitorRepository;
    @Override
    public Visitor createVisitor(Visitor visitor) {
        return null;
    }
}
