package com.tfrabaioli.dsvendas.repositories;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tfrabaioli.dsvendas.dto.SalesSuccessDTO;
import com.tfrabaioli.dsvendas.dto.SalesSumDTO;
import com.tfrabaioli.dsvendas.entities.Sale;


@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	//busca agrupada
	@Query("SELECT new com.tfrabaioli.dsvendas.dto.SalesSumDTO(obj.seller,SUM(obj.amount) ) "
			+ "FROM Sale AS obj GROUP BY obj.seller ")
	List<SalesSumDTO> amountGroupBySeller();
	
	
	@Query("SELECT new com.tfrabaioli.dsvendas.dto.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller ")
	List<SalesSuccessDTO> successGroupBySeller();

}
