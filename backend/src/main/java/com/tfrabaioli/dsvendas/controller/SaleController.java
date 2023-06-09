package com.tfrabaioli.dsvendas.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tfrabaioli.dsvendas.dto.SaleDTO;

import com.tfrabaioli.dsvendas.services.SaleServeice;

@RestController
@RequestMapping(value="/sales")
public class SaleController {
	
	@Autowired
	private SaleServeice service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> obj = service.findAll(pageable);
		return ResponseEntity.ok().body(obj);
	}

}
