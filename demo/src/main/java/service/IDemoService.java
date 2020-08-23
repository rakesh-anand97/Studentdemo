package service;

import java.util.List;

import dto.Student;

public interface IDemoService {
	
	void findallstudentservice();
	Student addstudentservice(Student object);
	void deletestudentservice(String name );
	Student findByName(String fname);
	Student changeMarks(String cname, double marks);
}
