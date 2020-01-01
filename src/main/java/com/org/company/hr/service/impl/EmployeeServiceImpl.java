package com.org.company.hr.service.impl;

import com.org.company.hr.domain.Employee;
import com.org.company.hr.repository.EmployeeRepository;
import com.org.company.hr.service.IEmployeeService;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.ofNullable;

/**
 * Created by Amber on 01-01-2020.
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService
{
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = repository.findAll();
        return employees;
    }

    @Override
    public Employee save(Employee employee)
    {
        Employee emp=null;
        if(null != employee)
        {
            emp = repository.save(employee);
        }
        return emp;
    }

    @Override
    public Employee update(Employee employee) throws Exception {
        Employee existingEmployeeData = findEmployeeById(employee.getId());

        if(null!=existingEmployeeData)
        {
            updateNewEmployeeData(existingEmployeeData,employee);
            existingEmployeeData = save(existingEmployeeData);
            return existingEmployeeData;
        }
        else
        {
            throw new Exception("Record not found for given employee ID");
        }
    }

    @Override
    public Employee findEmployeeById(Long employeeId)
    {
        return repository.findById(employeeId).orElse(null);
    }

    @Override
    public void deleteById(Long employeeId)
    {
        repository.deleteById(employeeId);
    }

    private void updateNewEmployeeData(Employee existingEmployeeData,Employee employee)
    {
        if(null!=employee.getName())
        {
            existingEmployeeData.setName(employee.getName());
        }
        if(null!=employee.getSalary())
        {
            existingEmployeeData.setSalary(employee.getSalary());
        }
    }
}
