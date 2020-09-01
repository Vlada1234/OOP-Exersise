package hotelManagement;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    // Variables 
	private double salary;
	private double salaryEarned;
	private List<Employee> employees;
	private String employeeName;

	// Constructor
	public Employee(String employeeName, double salary) {
		this.employeeName = employeeName;
		this.salary = salary;

	}

	// Getters and Setters

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalaryEarned() {
		return salaryEarned;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Employee> getEmployee() {
		return employees;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	// Functions
	public void recieveSalary(double salary) {
		salaryEarned += salary;
		Hotel.updateTotalMoneySpent(salary);

	}

}

