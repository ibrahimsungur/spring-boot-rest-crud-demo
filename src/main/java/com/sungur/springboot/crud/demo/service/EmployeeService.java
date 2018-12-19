package com.sungur.springboot.crud.demo.service;

import java.util.List;

import com.sungur.springboot.crud.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int theId);

	public void saveEmployee(Employee theEmployee);

	public void deleteEmployee(int theId);
}
