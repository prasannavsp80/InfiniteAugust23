package com.java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class EmployBean
 */
@Stateless
@Remote(EmployBeanRemote.class)
public class EmployBean implements EmployBeanRemote {

	 @PersistenceContext(unitName = "EmpEjbMgmtPU")
	 private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public EmployBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addEmploy(Employ Employ) {
		entityManager.persist(Employ);
		return "Employ Record Inserted...";
	}

	@Override
	public List<Employ> showEmploy() {
		System.out.println("Entit Manager is  " +entityManager);
		Query query = entityManager.createQuery("SELECT e FROM Employ e");
		System.out.println(query.getResultList());
		System.out.println(query.getResultList().size());
	    return (List<Employ>) query.getResultList();
	}

	@Override
	public Employ searchEmploy(int id) {
		Employ Employ = entityManager.find(Employ.class, id);
		return Employ;
	}

	@Override
	public String deleteEmploy(int id) {
		Employ EmployFound = searchEmploy(id);
		if (EmployFound!=null) {
			entityManager.remove(EmployFound);
			return "Record Deleted...";
		} 
		return "Not Found";
	}

	@Override
	public String updateEmploy(Employ EmployNew) {
		Employ EmployFound = searchEmploy(EmployNew.getEmpno());
		if (EmployFound!=null) {
			entityManager.merge(EmployNew);
			return "Employ Record Updated...";
		}
		return "Not Found...";
	}

}
