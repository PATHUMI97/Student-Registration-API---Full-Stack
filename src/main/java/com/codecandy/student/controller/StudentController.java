package com.codecandy.student.controller;

import com.codecandy.student.model.Student;
import com.codecandy.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "done";
    }

    @GetMapping("/getAll")
    public List<Student> getAStudents(){
        return studentService.getAllStudents();
    }
}
