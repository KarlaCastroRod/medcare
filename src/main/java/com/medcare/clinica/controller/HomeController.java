package com.medcare.clinica.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medcare.clinica.dto.ProdutoDTO;

public class HomeController {
	@RestController
	@RequestMapping("/produtos")
	public class ProdutoController {

	    @GetMapping("/teste")
	    public ResponseEntity<ProdutoDTO> testeDTO() {
	 
	        ProdutoDTO dto = new ProdutoDTO();
	        dto.setNome("Paracetamol");
	        dto.setPreco(new BigDecimal("10.90"));
	        
	        return ResponseEntity.ok(dto);
	    }
	}
}
