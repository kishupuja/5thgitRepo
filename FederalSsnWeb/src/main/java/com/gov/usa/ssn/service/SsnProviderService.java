package com.gov.usa.ssn.service;

import com.gov.usa.ssn.model.SsnProviderModel;

public interface SsnProviderService {

	public String saveSsnNo(SsnProviderModel spm);

	public SsnProviderModel findBySsnAndDob(Integer ssn, String dob);
}
