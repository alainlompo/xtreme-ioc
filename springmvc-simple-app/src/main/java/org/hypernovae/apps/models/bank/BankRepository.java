package org.hypernovae.apps.models.bank;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * An illustration of a repository that handle the persistence
 * and retrieval of a particular type of entity
 * @author LOMPO
 *
 */
@Repository
@Transactional(readOnly = true)
public class BankRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Bank save(Bank bank) {
		entityManager.persist(bank);
		return bank;
	}
	
	public Bank findByDesignation(String designation) {
		try {
			return entityManager.createQuery("Select b from Bank b where b.designation = :designation", Bank.class)
		
				.setParameter("designation", designation)
				.getSingleResult();
		} catch (PersistenceException pE) {
			return null;
		}
	}

}
