package com.driver;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
@Autowired

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
         return studentRepository.getAllStudents();
    }
    public void deleteTeacherByName(String name){
        studentRepository.deleteTeacherByName(name);
    }
    public void deleteAllTeachers(){
        studentRepository.deleteAllTeachers();
    }
}
