package demo;

import java.util.List;
import java.util.Scanner;

import dao.DemoDao;
import dao.IDemoDao;
import dto.Student;
import service.DemoService;
import service.IDemoService;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IDemoDao dao1 =new DemoDao();
//		
		IDemoService s= new DemoService();
		Scanner sc = new Scanner(System.in);
		String operation="yes",operations = null;
		System.out.println("Welcome to Student Management App");
		do {
			
		System.out.println("Please enter your choice \n 1.Add Student \n 2.Delete Student \n 3.Find All Students \n 4.Find Student \n 5.Change Student Marks  ");
		int choice= sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter your name");
			String name= sc.next();
			System.out.println("enter roll no");
			int rollno= sc.nextInt();
			System.out.println("enter marks");
			double mark=sc.nextDouble();
			 Student st= new Student(name,rollno,mark);
			 Student sm=s.addstudentservice(st);
				System.out.println(sm);
				System.out.println("Do you want to perform futher operation? Yes/No");
				operations=sc.next();
			break;
		case 2:
			System.out.println("enter the name for record to be deleted");
			String dname= sc.next();
			s.deletestudentservice(dname);
			System.out.println("Do you want to perform futher operation? Yes/No");
			operations=sc.next();
			break;
			
		case 3:
			System.out.println("printing details");
			s.findallstudentservice();
			System.out.println("Do you want to perform futher operation? Yes/No");
			operations=sc.next();
			break;
		case 4:
			System.out.println("Enter the name of student");
			String fname=sc.next();
			
			Student std=s.findByName(fname);
			System.out.println(std);
			System.out.println("Do you want to perform futher operation? Yes/No");
			operations=sc.next();
			break;
		case 5:
			System.out.println("Enter the name of student");
			String cname=sc.next();
			System.out.println("Enter the marks");
			double marks=sc.nextDouble();
			Student stds=s.changeMarks(cname, marks);
			System.out.println(stds);
			System.out.println("Do you want to perform futher operation? Yes/No");
			operations=sc.next();
			break;
			

		default:
			break;
		}
		
		}while(operation.equalsIgnoreCase(operations));
		
		

	}

}
