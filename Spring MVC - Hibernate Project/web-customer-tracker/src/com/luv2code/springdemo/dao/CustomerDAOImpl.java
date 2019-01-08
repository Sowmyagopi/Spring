package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		// get the hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query... by sort by last name.. 
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		// get the list of customers by executing the query
		List<Customer> customers = theQuery.getResultList();
		
		// return the list of customers
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/update the customer to the database
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		
		// get the current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// get the customer for theId
		Customer theCustomer = currentSession.get(Customer.class,theId);
		
		// return the customer details
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {

		// get the current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete the customer
		Query theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();
	
	}
	
}
