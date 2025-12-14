package in.sp.resource;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class Spring_Config {
	
	@Bean
	
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		 
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/student_db");
		dataSource.setUsername("root");
		dataSource.setPassword("12212729Rk@");
		
		return dataSource;
		
	}
	
	@Bean
	public JdbcTemplate myjdbcTemplate() {
		
		JdbcTemplate  jj = new JdbcTemplate();
		
		jj.setDataSource(myDataSource());
		
		
		return jj;
	}
	

}
