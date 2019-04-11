package com.fujitsu.services;


import java.util.List;

import com.fujitsu.beans.Customer;
import com.fujitsu.exception.ServiceException;

public interface CustomerService  {
	
	List<Customer> findAllCustomer() throws ServiceException;
	Customer findById(int customer_Id)throws ServiceException;
	
	void add(Customer customer_Id)throws ServiceException;
	void update(Customer customer_Id)throws ServiceException;
	void remove(Customer customer_Id)throws ServiceException;
	
	List<Customer> sortByCustomer_Id() throws ServiceException;
	List<Customer> sortByCustomer_Name() throws ServiceException;
	List<Customer> sortByCountry_Code() throws ServiceException;
	List<Customer> sortByPhone_No() throws ServiceException;
	List<Customer> sortByEmail_Id() throws ServiceException;
	List<Customer> sortByAddress() throws ServiceException;
	List<Customer> sortByCity() throws ServiceException;
	List<Customer> sortByState() throws ServiceException;
	List<Customer> sortByCountry() throws ServiceException;
	List<Customer> sortByZip() throws ServiceException;
	List<Customer> sortByAge() throws ServiceException;
	List<Customer> sortByGender() throws ServiceException;
	List<Customer> sortById_Type() throws ServiceException;
	List<Customer> sortById_No() throws ServiceException;
	List<Customer> sortByNationality() throws ServiceException;
	List<Customer> sortByUserId() throws ServiceException;
	
	
}
