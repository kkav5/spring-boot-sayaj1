package com.udarn.sayaj.dao;

import com.udarn.sayaj.model.Employee;

import java.util.List;
import java.util.UUID;

public interface EDao {

    int insertEmployee(int id, Employee employee);

    default int addEmployee(Employee employee){
        int id = employee.getId();
        return insertEmployee(id, employee);
    }

    List<Employee> selectAllEmployees();

    Employee selectEmployeeById(int id);
}
