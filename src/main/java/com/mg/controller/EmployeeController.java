package com.mg.controller;

import com.mg.entity.Employee;
import com.mg.entity.impl.IEmployee;
import com.mg.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "read", method = RequestMethod.GET)
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public void updateEmployee( @RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
    }

}
