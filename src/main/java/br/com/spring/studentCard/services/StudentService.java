// package br.com.spring.studentCard.services;

// import org.springframework.beans.BeanUtils;
// import org.springframework.stereotype.Service;

// import br.com.spring.studentCard.dto.StudentDto;
// import br.com.spring.studentCard.models.Student;
// import br.com.spring.studentCard.repositories.StudentRepository;

// @Service
// public class StudentService {

//     final StudentRepository studentRepository;

//     public StudentService(StudentRepository studentRepository) {
//         this.studentRepository = studentRepository;
//     }

//     public Student save(StudentDto studentDto)
//     {
//         var student = new Student();

//         BeanUtils.copyProperties(studentDto, student);
//         return studentRepository.save(student);
//     }
    
// }
