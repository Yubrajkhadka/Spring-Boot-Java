package com.yubraj.student_management.Service;

import com.yubraj.student_management.Model.StudentModel;
import com.yubraj.student_management.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public List<StudentModel> getallStudents() {
        return studentRepository.findAll();
    }

    public StudentModel getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found!"));
    }

    public StudentModel saveStudent(StudentModel student) {
        return studentRepository.save(student);
    }

    public StudentModel updateStudent(Long id, StudentModel updatedStudent) {
        StudentModel student = getStudentById(id);
        student.setFirstname(updatedStudent.getFirstname());
        student.setLastname(updatedStudent.getLastname());
        student.setAge(updatedStudent.getAge());
        student.setAddress(updatedStudent.getAddress());
        student.setEmail(updatedStudent.getEmail());
        student.setCourse(updatedStudent.getCourse());
        return studentRepository.save(student);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
