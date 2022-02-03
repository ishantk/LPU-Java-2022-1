package com.auribises.db;

import java.util.ArrayList;

// <T> -> Generics in Java
// T stands for the data type and it can be any name
public interface DAO<T> {

	int insert(T object);
	int update(T object);
	int delete(int id);
	ArrayList<T> query();
	
}

// DAO is a Rule Book for DB Operations