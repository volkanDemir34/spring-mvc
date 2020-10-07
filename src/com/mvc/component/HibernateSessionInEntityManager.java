package com.mvc.component;

import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.context.spi.CurrentSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.springframework.orm.jpa.EntityManagerHolder;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class HibernateSessionInEntityManager implements CurrentSessionContext {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HibernateSessionInEntityManager() {
	}

	public HibernateSessionInEntityManager(SessionFactory sessionFactory) {
	}

	public HibernateSessionInEntityManager(SessionFactoryImplementor factory) {
	}
	

	@Override
	public Session currentSession() throws HibernateException {
		Map<Object, Object> resourceMap = TransactionSynchronizationManager.getResourceMap();
		 for(Object v:resourceMap.values()) {
			 if(v instanceof EntityManagerHolder){
	                return (Session) ((EntityManagerHolder)v).getEntityManager();
	            }
		 }
		 return null;
	}

}
