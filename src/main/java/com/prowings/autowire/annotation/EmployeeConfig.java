package com.prowings.autowire.annotation;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean(name = "emp3", autowire = Autowire.BY_TYPE/* , autowireCandidate = false */)
	public Employee getEmployee1() {
		Employee e1 = new Employee();
		e1.setId(3);
		e1.setName("Rajesh");
		return e1;
	}

	@Bean
	public Department getDepartment1() {
		Department dept = new Department();
		dept.setDeptId(1);
		dept.setName("Dev Department");

		return dept;
	}

}
