package com.udarn.sayaj.service;

import com.udarn.sayaj.dao.EDao;
import com.udarn.sayaj.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EService {

    private final EDao eDao;

    @Autowired
    public EService(@Qualifier("postgres") EDao eDao){
        this.eDao = eDao;
    }

    public int addEmployee(Employee e){
        return eDao.addEmployee(e);
    }

    public List<Employee> getAllEmployees(){
        return eDao.selectAllEmployees();
    }

    public Employee getEmployeeById(int id){
        return eDao.selectEmployeeById(id);
    }
}
