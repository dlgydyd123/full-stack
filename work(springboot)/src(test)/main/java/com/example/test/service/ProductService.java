package com.example.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.test.dto.ProductDTO;
import com.example.test.entity.ProductEntity;
import com.example.test.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	

	private final ProductRepository repository;
	

	public List<ProductDTO> findAll() {
		List<ProductEntity> list = repository.findAll();
		List<ProductDTO> dtos = list.stream().map(ProductDTO::new).collect(Collectors.toList());
		return dtos;
	}

	public List<ProductDTO> create(ProductDTO dto) {
		ProductEntity entity = ProductDTO.toEntity(dto);
		repository.save(entity);
		return findAll(); 
	}
	
	
}
