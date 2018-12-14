package com.mg.dao;

import com.mg.dao.impl.IBaseDao;
import com.mg.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@Transactional
@Repository
public class EmployeeDao implements IBaseDao<Employee> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Employee getId(int id) {
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        entityManager.persist(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee employee1 = getId(employee.getId());
        employee1.setName(employee.getName());
        employee1.setSurname(employee.getSurname());
        employee1.setSalary(employee.getSalary());
        entityManager.flush();
        return employee1;
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(id);
    }

    @Override
    public List<Employee> getAllList() {
        String hql = "FROM Employee ";
        return entityManager.createQuery(hql).getResultList();
    }
}
