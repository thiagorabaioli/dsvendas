package com.tfrabaioli.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tfrabaioli.dsvendas.dto.SellerDTO;

import com.tfrabaioli.dsvendas.services.SellerServeice;

@RestController
@RequestMapping(value="/sellers")
public class SellerController {
	
	@Autowired
	private SellerServeice service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}

}
