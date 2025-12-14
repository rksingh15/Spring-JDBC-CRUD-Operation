package in.sp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;

public class Student_rowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs , int rowNum) throws SQLException{
		
		Student std = new Student();
		
		std.setName(rs.getString("name"));
		std.setEmail(rs.getString("email"));
		std.setGender(rs.getString("gender"));

		
		return std;
	}
}
