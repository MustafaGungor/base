package com.mg.service.impl;

import com.mg.dao.EmployeeDao;
import com.mg.entity.BaseEntity;
import com.mg.entity.Employee;
import com.mg.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void getId(Integer id) {

    }

    @Override
    public Employee createEmployee(Employee employee) {
        employeeDao.create(employee);
        return employee;
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeDao.delete(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllList();
    }

    @Override
    public BaseEntity add(BaseEntity baseEntity) {
        return null;
    }

    @Override
    public BaseEntity update(BaseEntity baseEntity) {
        return null;
    }

    @Override
    public BaseEntity delete(BaseEntity baseEntity) {
        return null;
    }

    @Override
    public BaseEntity deleteById(int id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public BaseEntity findById(int id) {
        return null;
    }

    @Override
    public List findBySearch(String name) {
        return null;
    }

    @Override
    public List find(Object o) {
        return null;
    }
}
