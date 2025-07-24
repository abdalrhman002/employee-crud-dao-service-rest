package com.mujahid.employee_crud_api.dao;

import com.mujahid.employee_crud_api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);

}
