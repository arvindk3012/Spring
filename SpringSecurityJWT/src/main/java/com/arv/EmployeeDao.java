package com.arv;

import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {
	
	public Employee getData() {
		
		Employee e=new Employee();
		e.setId(101);
		e.setName("Arvind");
		e.setAddress("BTM Layout");
		
		return e;
	}

}
