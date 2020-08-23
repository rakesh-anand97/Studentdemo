package dao;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dto.Student;

public class DemoDao implements IDemoDao {
	
	Student student;
	List<Student> students= new ArrayList<Student>();
	
	
		
	

	public DemoDao() {
		Student a =new Student("Rakesh",1,90);
		students.add(a);
		Student b =new Student("Amit",2,90);
		students.add(b);
		Student c =new Student("Mohil",3,90);
		students.add(c);
//		System.out.println("Dao up");
	}



	public void findallstudent() {
		
		
		
		
		for(Student s:students) {
			System.out.println(s);
		}
	}



	public Student addstudentservice(Student s) {
		students.add(s);
		System.out.println("students added in list");
		System.out.println(students);
		return s;
	}



	public void deletestudentservice(String name) {
		students.removeIf(object ->object.getName().equalsIgnoreCase(name));
		System.out.println("DELETED");
		System.out.println(students);
		
	}



	@Override
	public Student findByName(String fname) {
		// TODO Auto-generated method stub
		
		Student stud= null;
		Iterator<Student>itr= students.iterator();
		while(itr.hasNext()) {
			Student it=itr.next();
			if(it.getName().equalsIgnoreCase(fname)){
				stud=it;
//			}else {
//				System.out.println("do record found");
//				stud= new Student("null",0,0);
			}
		}
	
		return stud;
	}



	@Override
	public Student changeMarks(String cname, double marks) {
		
		Student stud= null;
		Iterator<Student>itr= students.iterator();
		while(itr.hasNext()) {
			Student it=itr.next();
			if(it.getName().equalsIgnoreCase(cname)){
				it.setMarks(marks);
				stud=it;
//			}else {
//				System.out.println("do record found");
//				stud= new Student("null",0,0);
			}
		}
	
		return stud;
	}	
	}
	
	
	

