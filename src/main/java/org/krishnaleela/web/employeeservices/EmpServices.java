package org.krishnaleela.web.employeeservices;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;

@Path("employeeServices/")
public class EmpServices {

	public EmployeeList getJsonList() {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(1, "Deepika", "987654321", "deep@gmail.com");
		list.add(e1);
		Employee e2 = new Employee(1, "Krishna", "9875687345", "krishna@gmail.com");
		list.add(e2);
		return new EmployeeList(list);

	}

}
