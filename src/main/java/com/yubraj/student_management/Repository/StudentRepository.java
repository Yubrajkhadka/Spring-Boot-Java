package com.yubraj.student_management.Repository;
import com.yubraj.student_management.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel,Long> {

}
