package com.camotechq.chospital.app.repository;

import java.util.List;

import com.camotechq.chospital.app.model.Company;

public interface CompanyRepository {
	List<Company> getAllCompanies();
	Company getCompanyById(Long id);
	void save(Company company);
	void delete(Company company);
	void update(Company company);
	boolean companyNameExist(String name);
}
