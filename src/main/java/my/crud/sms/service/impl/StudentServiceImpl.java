package my.crud.sms.service.impl;

import my.crud.sms.entity.Student;
import my.crud.sms.repository.StudentRepository;
import my.crud.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository student_repository;

    public StudentServiceImpl(StudentRepository student_repository) {
        this.student_repository = student_repository;
    }




    @Override
    public List<Student> getAllStudents() {
        return student_repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return student_repository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return student_repository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return student_repository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        student_repository.deleteById(id);
    }
}
