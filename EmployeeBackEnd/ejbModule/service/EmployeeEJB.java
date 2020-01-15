package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.EmployeeEntity;

/**
 * Session Bean implementation class EmployeeEJB
 */
@Stateless
@LocalBean
public class EmployeeEJB {

	@PersistenceContext
	private EntityManager em;
	
    public EmployeeEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNewEmployee(EmployeeEntity employeeentity) {
    	System.out.println("======= Adding new employee to database ===================");
    	em.persist(employeeentity);
    }
}
