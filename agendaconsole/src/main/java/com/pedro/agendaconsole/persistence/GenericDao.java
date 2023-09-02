package com.pedro.agendaconsole.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.pedro.agendaconsole.util.Conf;

public class GenericDao<T> {

	private Class<T> clazz;

	private EntityManagerFactory emFM = Conf.getEmFactory();

	EntityManager em = emFM.createEntityManager();

	
	public GenericDao(Class<T> clazz) {

		this.clazz = clazz;
	}

	public List<T> getListByCondition(String cond) {

		TypedQuery<T> query = em.createQuery("select obj from " + clazz.getName() + " obj where " + cond, clazz);

		return query.getResultList();

	}

	public T create(T t) {

		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();

		return t;
	}

}
