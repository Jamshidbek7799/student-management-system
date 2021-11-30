package my.crud.sms;

import my.crud.sms.entity.Student;
import my.crud.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }


    @Autowired
    private StudentRepository student_repository;



    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student(
//                "Jamshid",
//                "Yuldashev",
//                "jamshidyuldashev@gmail.com",
//                "+99899 564 77 99" );
//        student_repository.save(student1);
//
//        Student student2 = new Student(
//                "Jalol",
//                "Yuldashev",
//                "jalolyuldashev@gmail.com",
//                "+99899 564 44 22" );
//        student_repository.save(student2);
//
//        Student student3 = new Student(
//                "Bobur",
//                "Yuldashev",
//                "boburyuldashev@gmail.com",
//                "+99893 578 37 72" );
//        student_repository.save(student3);
//
//        Student student4 = new Student(
//                "Allabergan",
//                "Yuldashev",
//                "allaberganyuldashev@gmail.com",
//                "+99899 967 97 21" );
//        student_repository.save(student4);




    }
}
