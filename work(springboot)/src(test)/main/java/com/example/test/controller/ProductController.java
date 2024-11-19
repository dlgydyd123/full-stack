package com.example.test.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.dto.ProductDTO;
import com.example.test.dto.ResponseDTO;
import com.example.test.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {

	private final ProductService service;

	@GetMapping
	public ResponseEntity<?> productList() {
		List<ProductDTO> dtos = service.findAll();
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto) {
		List<ProductDTO> dtos = service.create(dto);
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
}
