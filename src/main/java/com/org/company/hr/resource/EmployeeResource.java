package com.org.company.hr.resource;

import com.org.company.hr.domain.Employee;
import com.org.company.hr.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeResource
{
    @Autowired
    private EmployeeRepository repository;

    @RequestMapping("all")
    public List<Employee> getAllEmployee()
    {
        return repository.findAll();
    }
}
