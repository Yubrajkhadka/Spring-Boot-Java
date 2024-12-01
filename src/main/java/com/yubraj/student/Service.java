package com.yubraj.student;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
