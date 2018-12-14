package com.mg.service;

import com.mg.entity.Employee;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
public interface EmployeeService extends BaseService {

    void getId(Integer id);

    Employee createEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Integer id);

    List<Employee> getAllEmployee();
}
