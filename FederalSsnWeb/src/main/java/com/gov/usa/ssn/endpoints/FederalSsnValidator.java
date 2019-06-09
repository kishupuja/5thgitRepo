package com.gov.usa.ssn.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.gov.usa.ssn.model.SsnProviderModel;
import com.gov.usa.ssn.service.SsnProviderService;

import gov.usa.ssn.types.IndvDetailRequest;
import gov.usa.ssn.types.IndvDetailResponse;
import gov.usa.ssn.types.IndvDetailType;

@Endpoint
public class FederalSsnValidator {

	@Autowired
	private SsnProviderService ssnService;

	private static final String NAMESPACE_URI = "http://www.usa.gov/ssn/types";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "IndvDetailRequest")
	@ResponsePayload
	public IndvDetailResponse validateSsn(@RequestPayload IndvDetailRequest request) {

		System.out.println("in endpoint method");
		IndvDetailResponse response = new IndvDetailResponse();

		// capturing data from request
		String dob = request.getDob();
		String ssn = request.getSsn();

		// validating given ssn and dob
		SsnProviderModel model = ssnService.findBySsnAndDob(Integer.parseInt(ssn), dob);

		if (model != null) {
			// setting data in binding object
			IndvDetailType type = new IndvDetailType();
			type.setFirstName(model.getFirstName());
			type.setLastName(model.getLastName());
			type.setSsn(ssn);
			type.setDob(dob);
			// adding binding obj to response object
			response.setIndvDetail(type);
		}

		// returning response
		return response;

	}

}
