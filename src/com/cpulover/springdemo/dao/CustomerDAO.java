package com.cpulover.springdemo.dao;

import java.util.List;

import com.cpulover.springdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
}