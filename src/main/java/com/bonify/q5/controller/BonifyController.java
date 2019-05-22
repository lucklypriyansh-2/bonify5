package com.bonify.q5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bonify.q5.model.BankIdentifierModel;
import com.bonify.q5.service.BankIdentifierService;

@RequestMapping("/api/")
@RestController
public class BonifyController {

	@Autowired
	private BankIdentifierService bankIdentifierService;

	@GetMapping("csv")
	public void readAllRecordsFromCsv(@RequestParam("filepath") String filepath) {
		bankIdentifierService.readcsvFromPath(filepath);
	}

	@GetMapping("csv/loadfromPath/{bankidentifier}")
	public BankIdentifierModel readDBData(@PathVariable("bankidentifier") Long bankIdentifier) {
		return bankIdentifierService.readDBData(bankIdentifier);
	}

}
