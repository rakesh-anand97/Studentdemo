package dao;

import java.util.List;

import dto.Student;

public interface IDemoDao {
   void findallstudent(); 
   Student addstudentservice(Student s);
   void deletestudentservice(String name);
   Student findByName(String fname);
   Student changeMarks(String cname,double marks);
   }
