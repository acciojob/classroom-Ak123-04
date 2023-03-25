package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class StudentRepository {

    HashMap<String,Student>studentDB=new HashMap<>();
    HashMap<String,Teacher>teacherDB=new HashMap<>();
    HashMap<String,List<String>>Student_TeacherDB=new HashMap<>();


    public void addStudent(Student student){
        String name=student.getName();
        studentDB.put(name,student);
    }

    public void addTeacher(Teacher teacher){
        String name=teacher.getName();
        teacherDB.put(name,teacher);
    }

    public void addStudentTeacherPair(String student,String teacher){

        if(Student_TeacherDB.containsKey(teacher)){
            List<String>StudentList=Student_TeacherDB.get(teacher);
            StudentList.add(student);
            Student_TeacherDB.put(teacher,StudentList);
        }
        else{
            List<String>StudentList=new ArrayList<>();
            StudentList.add(student);
            Student_TeacherDB.put(teacher,StudentList);
        }
    }
    public Student getStudentByName(String name){
        return studentDB.get(name);
    }
    public Teacher getTeacherByName(String name){
        return teacherDB.get(name);
    }
    public List<String> getAllStudents(){
        List<String>studentList=new LinkedList<>();
        for(String s:studentDB.keySet()){
            studentList.add(s);
        }
        return studentList;
    }
    public List<String> getAllTeacher(){
        List<String>teacherList=new LinkedList<>();
        teacherList.addAll(teacherDB.keySet());
        return teacherList;
    }
    public List<String> getStudentByTeacherName(String name){
        return Student_TeacherDB.get(name);
    }
    public void deleteTeacherByName(String name){
        List<String>studentList=Student_TeacherDB.get(name);
        for(String s:studentList){
            studentDB.remove(s);
        }
        teacherDB.remove(name);
        Student_TeacherDB.remove(name);
    }
    public void deleteAllTeachers(){
        teacherDB.clear();
        Student_TeacherDB.clear();
    }

}
