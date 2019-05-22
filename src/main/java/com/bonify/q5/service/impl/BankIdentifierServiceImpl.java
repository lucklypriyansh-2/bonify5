package com.bonify.q5.service.impl;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bonify.q5.dao.BankIdentifierDao;
import com.bonify.q5.exception.DataNotFoundException;
import com.bonify.q5.exception.FileReadingException;
import com.bonify.q5.model.BankIdentifierModel;
import com.bonify.q5.service.BankIdentifierService;

/**
 * 
 * @author p0n004h
 *
 */
@Component
public class BankIdentifierServiceImpl implements BankIdentifierService {

	@Autowired
	BankIdentifierDao bankIdentifierDao;

	@Override
	public void readcsvFromPath(String filePath) {
		try {
			readandsavefromcsv(filePath);

		} catch (IOException e) {
			e.printStackTrace();
			throw new FileReadingException(
					"error in parsing the file Exception [" + e.getMessage() + "]");
		}

	}

	/**
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	private void readandsavefromcsv(String filePath) throws IOException {
		CSVParser parser;
		Reader    reader = Files.newBufferedReader(Paths.get(filePath));
		parser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader());
		for (CSVRecord record : parser) {
			saveEachRow(record);
		}
		parser.close();
	}

	/**
	 * 
	 * @param record
	 */
	private void saveEachRow(CSVRecord record) {
		BankIdentifierModel bim = new BankIdentifierModel();
		bim.setBankName(record.get("Name"));
		bim.setBankIdentifier(Long.parseLong(record.get("bank_Identifier")));
		bankIdentifierDao.save(bim);
	}

	@Override
	public BankIdentifierModel readDBData(Long BankIdentifierId) {
		Optional<BankIdentifierModel> bList = bankIdentifierDao.findById(BankIdentifierId);

		if (bList.isPresent()) {

			return bList.get();
		} else {
			throw new DataNotFoundException(
					"For bank identifier " + BankIdentifierId + "no data is present");
		}

	}


}
