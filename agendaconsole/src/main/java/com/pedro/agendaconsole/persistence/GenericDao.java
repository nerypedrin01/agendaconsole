package com.pedro.agendaconsole.persistence;

import javax.persistence.EntityManagerFactory;

import com.pedro.agendaconsole.util.Conf;

public class GenericDao<T> {

	private Class<T> clazz;
	
	private EntityManagerFactory em = Conf.getEmFactory();
	
	public GenericDao(Class<T> clazz) {
		
		this.clazz = clazz;
	}
}
