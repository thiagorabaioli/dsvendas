package com.tfrabaioli.dsvendas.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tfrabaioli.dsvendas.dto.SellerDTO;
import com.tfrabaioli.dsvendas.entities.Seller;
import com.tfrabaioli.dsvendas.repositories.SellerRepository;

@Service
public class SellerServeice {
	
	@Autowired
	private SellerRepository sellerRepo;
	
	
	public List<SellerDTO> findAll(){
		
		List<Seller> result = sellerRepo.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());	
	}
	

}
