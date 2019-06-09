package com.gov.usa.ssn.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gov.usa.ssn.dao.SsnProviderDao;
import com.gov.usa.ssn.entity.SsnProviderEntity;
import com.gov.usa.ssn.model.SsnProviderModel;

@Service("ssnService")
public class SsnProviderServiceImpl implements SsnProviderService {

	@Autowired(required = true)
	private SsnProviderDao providerDao;

	@Override
	public String saveSsnNo(SsnProviderModel spm) {
		SsnProviderEntity entity = null;
		Integer result = null;
		entity = new SsnProviderEntity();
		BeanUtils.copyProperties(spm, entity);
		result = providerDao.save(entity).getSsnId();
		if (result != null)
			return "SSN Registration Done";
		else
			return "Failed";

	}

	@Override
	public SsnProviderModel findBySsnAndDob(Integer ssn, String dob) {
		SsnProviderModel model = null;

		// Getting data from DB
		SsnProviderEntity entity = providerDao.findBySsnIdAndDob(ssn, dob);

		if (entity != null) {
			// Copying Entity data to model
			model = new SsnProviderModel();
			BeanUtils.copyProperties(entity, model);
		}
		return model;
	}

}
