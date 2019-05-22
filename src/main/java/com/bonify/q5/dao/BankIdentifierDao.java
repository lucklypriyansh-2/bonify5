package com.bonify.q5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bonify.q5.model.BankIdentifierModel;

@Repository
public interface BankIdentifierDao extends JpaRepository<BankIdentifierModel, Long>{

	
	
}
