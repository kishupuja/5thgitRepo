package com.gov.usa.ssn.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gov.usa.ssn.entity.SsnProviderEntity;

@Repository("SsnProviderDao")
public interface SsnProviderDao extends JpaRepository<SsnProviderEntity, Serializable> {

	@Query(name = "from SsnProviderEntity where ssnId=:ssn and dob=:dob")
	public SsnProviderEntity findBySsnIdAndDob(Integer ssn, String dob);
}
