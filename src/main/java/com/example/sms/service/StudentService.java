package com.example.sms.service;

import com.example.sms.model.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student updatedStudent);
    void deleteStudent(Long id);
}
