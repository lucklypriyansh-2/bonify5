package com.bonify.q5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "BankInformation", indexes = {
		@Index(name = "IDX_MYIDX1", columnList = "bankIdentifier") })
public class BankIdentifierModel {

	@Column(name = "bankName")
	private String bankName;

	@Id
	@Column(name = "bankIdentifier")
	private Long bankIdentifier;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Long getBankIdentifier() {
		return bankIdentifier;
	}

	public void setBankIdentifier(Long bankIdentifier) {
		this.bankIdentifier = bankIdentifier;
	}

}
