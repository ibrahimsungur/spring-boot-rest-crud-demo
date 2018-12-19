package com.sungur.springboot.crud.demo.dao;

import java.util.List;

import com.sungur.springboot.crud.demo.entity.Employee;



public interface EmployeeDAO {

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int theId);

	public void saveEmployee(Employee theEmployee);

	public void deleteEmployee(int theId);
}
