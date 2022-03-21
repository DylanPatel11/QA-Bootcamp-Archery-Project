package com.qa.archery.service;

import java.util.List;

public interface ServiceMethods<T> {
	
	//Create
	T create(T shoot);
	
	//Read All
	List<T> readAll();
	
	//Read by ID
	T readById(long id);
	
	//Update
	T update(long id, T shoot);
	
	//Delete
	boolean delete(long id);

}
