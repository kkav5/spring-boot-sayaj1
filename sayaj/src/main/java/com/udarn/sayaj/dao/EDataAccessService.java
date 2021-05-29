package com.udarn.sayaj.dao;

import com.udarn.sayaj.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("postgres")
public class EDataAccessService implements EDao{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertEmployee(int id, Employee employee) {
        return 0;
    }

    @Override
    public List<Employee> selectAllEmployees() {
        String sql = "SELECT id, f_name, l_name, address, phone FROM employee";
         return jdbcTemplate.query(sql,((resultSet, i) ->
        {
            return new Employee(resultSet.getInt("id"), resultSet.getString("f_name"), resultSet.getString("l_name"),resultSet.getString("address"), resultSet.getInt("phone"));

        }));
    }

    @Override
    public Employee selectEmployeeById(int id) {
        String sql = "SELECT id, f_name, l_name, address, phone FROM employee WHERE id = ?";
        Employee emp = jdbcTemplate.queryForObject(sql, new Object[]{id}, ((resultSet, i) ->
        {
            return new Employee(resultSet.getInt("id"), resultSet.getString("f_name"), resultSet.getString("l_name"),resultSet.getString("address"), resultSet.getInt("phone"));

        }));
        return emp;
    }
}
