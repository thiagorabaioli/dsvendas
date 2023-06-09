package com.tfrabaioli.dsvendas.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tfrabaioli.dsvendas.dto.SaleDTO;
import com.tfrabaioli.dsvendas.entities.Sale;
import com.tfrabaioli.dsvendas.repositories.SaleRepository;

@Service
public class SaleServeice {
	
	@Autowired
	private SaleRepository saleRepo;;
	
	
	public Page<SaleDTO> findAll(Pageable pageable){
		
		Page<Sale> result = saleRepo.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	

}
