package com.camotechq.chospital.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camotechq.chospital.app.model.Company;
import com.camotechq.chospital.app.service.CompanyService;
import com.camotechq.chospital.app.util.CMessages;
import com.camotechq.chospital.app.util.JSONResponse;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public JSONResponse getCompany(@PathVariable("id") final Long id) {
		if (id < 1) {
			return new JSONResponse(400, CMessages.MISSING_ID, null);
		} else {
			return new JSONResponse(200, CMessages.SUCCESS, companyService.getAllCompanies());
		}
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public JSONResponse getCompanies() {
		return new JSONResponse(200, CMessages.SUCCESS, companyService.getAllCompanies());
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public JSONResponse postCompany(@Valid final Company company, Errors errors) {
		if (errors.hasErrors()) {
			return new JSONResponse(400, errors.getFieldError().getDefaultMessage(), null);
		} else {
			try {
				companyService.saveCompany(company);
				return new JSONResponse(200, CMessages.SUCCESS, company);
			} catch(Exception e) {
				return new JSONResponse(400, e.getMessage(), null);
			}
		}
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public JSONResponse deleteCompany(@PathVariable("id") final Long id) {
		return new JSONResponse(0, null, null);
	}
}
