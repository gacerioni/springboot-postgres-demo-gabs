package com.gabsthecreator.springbootdemogabs.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

        if (studentOptional.isPresent()) {
            throw new IllegalStateException("Email is already taken!");
        }

        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);

        if (!exists) {
            throw new IllegalStateException("Student with ID " + studentId + " does not exist!");
        }
        studentRepository.deleteById(studentId);
    }

    public Optional<Student> getStudent(Long studentId) {
        return studentRepository.findById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {

        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with ID " + studentId + " does not exist!");
        }
        Student student = studentRepository.findById(studentId).orElseThrow();
        System.out.println("Student to be updated was found!");
        System.out.println(student);

        System.out.println(name);

        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            System.out.println("Condition satisfied!");
            System.out.println("Old Name: " + student.getName());
            System.out.println("New Name: " + name);
            student.setName(name);
        }
        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {

            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
            if (studentOptional.isPresent()) {
                throw new IllegalStateException("This email " + email + " is already taken!");
            }

            student.setEmail(email);
        }


    }


    //@Transactional
    //public void updateStudent(){}
}
