package com.collection.comparatorvscomparable;

/**
 * 
 * @author Baikati Pawan
 *
 */
public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;
	private String designation;
	private double salary;

	public Employee(int empId, String name, String designation, double salary) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}

	@Override
	public int compareTo(Employee employee) {
		String name1 = this.name;
		String name2 = employee.name;

		return name1.compareTo(name2);

	}

}
