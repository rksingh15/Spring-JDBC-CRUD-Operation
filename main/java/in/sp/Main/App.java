package in.sp.Main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;
import in.sp.beans.Student;
import in.sp.mappers.Student_rowMapper;
import in.sp.resource.Spring_Config;

public class App {

	public static void main(String[] args) {

		ApplicationContext contex = new AnnotationConfigApplicationContext(Spring_Config.class);

		JdbcTemplate jj = contex.getBean(JdbcTemplate.class);
		
//		String name1 = "Rtitk";
//		String email = "ritiksinghkushwha06@gmail.com";
//		String gender = "Male";
//
//
//		String insert_q = "INSERT INTO student(name, email, gender) VALUES (?,?,?)";
//
//		int count = jj.update(insert_q, name1, email, gender);
//
//		if(count > 0) {
//		    System.out.println("Insert Successfully");
//		} else {
//		    System.out.println("Insert Failed");
//		}
		
		
//	for delete data----------------------------------------------------	
//		


		
//		String gender = "Male";
//		String delete_q=" DELETE from  student WHERE gender=?  ";
//		int count = jj.update(delete_q,gender);
//		if(count > 0) {
//		    System.out.println("deletion Successfully");
//		} else {
//		    System.out.println("deletion Failed");
//		}
		
//-------------- Select data ------------------------------
		
		// Student , Student_rowMapper  banya hai ;
		String Select_q = "SELECT * FROM student";
		
				List<Student> stud= jj.query(Select_q, new Student_rowMapper());
				
				for(Student ss : stud)
				{
					System.out.println("Name : "+ ss. getName());
					System.out.println("Email : "+ ss. getEmail());
					System.out.println("Gender : "+ ss. getGender());
					
					System.out.println("---------+------------------------+-----------------+--");

		
				}
				
	

	}

}