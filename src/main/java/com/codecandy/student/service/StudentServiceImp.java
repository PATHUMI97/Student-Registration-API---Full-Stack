package com.codecandy.student.service;

import com.codecandy.student.model.Student;
import com.codecandy.student.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public StudentsRepository studentsRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentsRepository.findAll();
    }
}
