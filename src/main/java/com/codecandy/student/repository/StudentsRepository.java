package com.codecandy.student.repository;

import com.codecandy.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentsRepository extends JpaRepository<Student,Integer> {

}
