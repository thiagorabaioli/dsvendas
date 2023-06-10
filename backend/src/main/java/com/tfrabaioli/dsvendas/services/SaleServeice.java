package com.tfrabaioli.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tfrabaioli.dsvendas.dto.SaleDTO;
import com.tfrabaioli.dsvendas.dto.SalesSuccessDTO;
import com.tfrabaioli.dsvendas.dto.SalesSumDTO;
import com.tfrabaioli.dsvendas.entities.Sale;
import com.tfrabaioli.dsvendas.repositories.SaleRepository;
import com.tfrabaioli.dsvendas.repositories.SellerRepository;

@Service
public class SaleServeice {
	
	@Autowired
	private SaleRepository saleRepo;
	
	@Autowired
	private SellerRepository sellerRepo;
	
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepo.findAll();
		Page<Sale> result = saleRepo.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional
	public List<SalesSumDTO> amountGroupBySeller(){
		return saleRepo.amountGroupBySeller();
	}
	
	@Transactional
	public List<SalesSuccessDTO> successGroupBySeller(){
		return saleRepo.successGroupBySeller();
	}
	
	

}
