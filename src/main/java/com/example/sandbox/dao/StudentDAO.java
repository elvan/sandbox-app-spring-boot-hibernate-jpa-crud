package com.example.sandbox.dao;

import com.example.sandbox.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

}
