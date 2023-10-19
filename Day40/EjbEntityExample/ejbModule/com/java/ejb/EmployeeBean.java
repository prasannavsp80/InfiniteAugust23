package com.java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class EmployeeBean
 */
@Stateless
@Remote(EmployeeBeanRemote.class)
public class EmployeeBean implements EmployeeBeanRemote {

	 @PersistenceContext(unitName = "EmpMgmtPU")
	 private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public EmployeeBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addEmployee(Employee employee) {
		entityManager.persist(employee);
		return "Employ Record Inserted...";
	}

	@Override
	public List<Employee> showEmployee() {
		System.out.println("Entit Manager is  " +entityManager);
		Query query = entityManager.createQuery("SELECT e FROM Employee e");
	    return (List<Employee>) query.getResultList();
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public String deleteEmployee(int id) {
		Employee employeeFound = searchEmployee(id);
		if (employeeFound!=null) {
			entityManager.remove(employeeFound);
			return "Record Deleted...";
		} 
		return "Not Found";
	}

	@Override
	public String updateEmployee(Employee employeeNew) {
		Employee employeeFound = searchEmployee(employeeNew.getId());
		if (employeeFound!=null) {
			entityManager.merge(employeeNew);
			return "Employee Record Updated...";
		}
		return "Not Found...";
	}

}
