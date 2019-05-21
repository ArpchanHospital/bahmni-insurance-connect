package org.bahmni.insurance.dao;

import java.util.List;

import org.bahmni.insurance.model.FhirResourceModel;
import org.springframework.dao.DataAccessException;


public interface IFhirResourceDaoService {
    List<FhirResourceModel> findAll();
	int insertFhirResource() throws DataAccessException;
	List<String> getClaimId();
}
