package com.bonify.q5.service;

import com.bonify.q5.model.BankIdentifierModel;

public interface BankIdentifierService {

	/**
	 * @param filepath 
	 * @return
	 */
	void readcsvFromPath(String filepath);

	BankIdentifierModel readDBData(Long BankIdentifierId);
}
