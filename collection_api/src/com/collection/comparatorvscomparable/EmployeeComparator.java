package com.collection.comparatorvscomparable;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		int empId1 = emp1.getEmpId();
		int empId2 = emp2.getEmpId();
		if(empId1<empId2)
			return -1;
		else if(empId1>empId2)
			return +1;
		else 
			return 0;
	}
	
	
}
