package com.mujahid.employee_crud_api.dao;

import com.mujahid.employee_crud_api.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

    //define a field for entity manger object
    private EntityManager entityManager;

    //inject the entity manger object to EmployeeDAOImplementation class using constructor injection
    @Autowired
    public EmployeeDAOImplementation(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //implement find all employees method
    @Override
    public List<Employee> findAll() {

        //creat a query
        TypedQuery<Employee> query = entityManager.createQuery(
                "from Employee ", Employee.class);

        //get the result of the query into a list
        List<Employee> employees = query.getResultList();

        //return the result list
        return employees;
    }

    //implement find an employee by its id
    @Override
    public Employee findById(int id) {
        //get and return the employee
        return entityManager.find(Employee.class, id);
    }

    //implement save a new employee of update an exciting one
    @Override
    public Employee save(Employee employee) {

        //save the employee
        Employee dbEmployee = entityManager.merge(employee);

        //return the new database version after merging it
        return dbEmployee;
    }

    //implement delete an employee
    @Override
    public void deleteById(int id) {

        //find the employee by its id
        Employee employee = entityManager.find(Employee.class, id);

        //remove the employee form the database if it exists
        if(employee != null){
            entityManager.remove(employee);
        }
    }
}
