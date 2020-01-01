package com.org.company.hr.service;

import com.org.company.hr.domain.Employee;

import java.util.List;

/**
 * Created by Amber on 01-01-2020.
 */
public interface IEmployeeService
{
    List<Employee> getAllEmployee();
    Employee save(Employee employee);
    Employee update(Employee employee) throws Exception;
    Employee findEmployeeById(Long employeeId);
    void deleteById(Long employeeId);
}
