package service;

import java.util.List;

import dao.DemoDao;
import dao.IDemoDao;
import dto.Student;

public class DemoService implements IDemoService{

	IDemoDao dao = new DemoDao();
	Student s;
	public void findallstudentservice() {
		// TODO Auto-generated method stub
//		System.out.println("service up");
		 dao.findallstudent();
		
	}
	
	public Student addstudentservice(Student object) {
		
			return dao.addstudentservice(object);
	}

	public void deletestudentservice(String name) {
		 dao.deletestudentservice(name);
		
	}

	@Override
	public Student findByName(String fname) {
		
		return dao.findByName(fname);
	}

	@Override
	public Student changeMarks(String cname, double marks) {
		// TODO Auto-generated method stub
		return dao.changeMarks(cname, marks);
	}

}
