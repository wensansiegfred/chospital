package com.camotechq.chospital.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.camotechq.chospital.app.model.Company;

@Repository("companyRepository")
public class CompanyRepositoryImpl implements CompanyRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")	
	public List<Company> getAllCompanies() {
		List<Company> companies = em.createQuery("SELECT c FROM Company c").getResultList();
		return companies;
	}	
	
	public Company getCompanyById(Long id) {
		Company company = em.find(Company.class, id);
		return company;
	}	
	
	public void save(Company company) {
		em.persist(company);
		em.flush();
	}	
	
	public void delete(Company company) {
		em.remove(company);
	}
	
	public void update(Company company) {
		em.merge(company);
	}
	
	//get by name
	public boolean companyNameExist(String name) {
		return em.createQuery("SELECT c FROM Company c where c.name = :name")
						   .setParameter("name", name)
						   .getResultList().size() > 0 ? true : false;
	}
}
