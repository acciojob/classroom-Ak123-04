package com.driver;


import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class StudentService {

    StudentRepository studentRepository =new StudentRepository();

    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher){
        studentRepository.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student,String teacher){
      studentRepository.addStudentTeacherPair(student,teacher);
    }

    public Student getStudentByName(String name){
        return studentRepository.getStudentByName(name);
    }
    public Teacher getTeacherByName(String name){
        return studentRepository.getTeacherByName(name);
    }
    public List<String> getStudentByTeacherName(String name){
        return studentRepository.getStudentByTeacherName(name);
    }
    public List<String> getAllStudents(){
        List<String>list= studentRepository.getAllStudents();
        return list;
    }
    public void deleteTeacherByName(String name){
        studentRepository.deleteTeacherByName(name);
    }
    public void deleteAllTeachers(){
        studentRepository.deleteAllTeachers();
    }
}
