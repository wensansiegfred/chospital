package com.camotechq.chospital.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camotechq.chospital.app.model.Company;
import com.camotechq.chospital.app.repository.CompanyRepository;

@Service("companyService")
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Transactional
	public List<Company> getAllCompanies() {
		return companyRepository.getAllCompanies();
	}
	
	@Transactional
	public void saveCompany(Company company) {
		companyRepository.save(company);
	}
	
	@Transactional
	public boolean companyNameExist(String name) {
		return companyRepository.companyNameExist(name);
	}
}
