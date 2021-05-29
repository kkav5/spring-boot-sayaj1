package com.udarn.sayaj.api;

import com.udarn.sayaj.model.Employee;
import com.udarn.sayaj.service.EService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/employee")
@RestController
public class EController {

    private final EService eService;

    @Autowired
    public EController(EService eService){
        this.eService = eService;
    }

    @PostMapping
    public void addEmployee(@NonNull @RequestBody Employee employee ){
        eService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return eService.getAllEmployees();
    }

    @GetMapping(path= "{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return eService.getEmployeeById(id);
    }
}
