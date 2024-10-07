package com.korea.exam.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.exam.dto.ProductDTO;
import com.korea.exam.entity.ProductEntity;
import com.korea.exam.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<ProductDTO> create(ProductEntity productEntity){
		repository.save(productEntity);
		return repository.findAll().stream().map(ProductDTO :: new).collect(Collectors.toList());
	}
	
	public List<ProductDTO> readAll(){
		repository.findAll();
		return repository.findAll().stream().map(ProductDTO::new).collect(Collectors.toList());
	}
	
	public ProductDTO readById(Long id) {
		 Optional<ProductEntity> original = repository.findById(id);
		 ProductEntity product = original.get();
		 return new ProductDTO(product);
	}
	
	public ProductDTO update(ProductEntity productEntity) {
		Optional<ProductEntity> original = repository.findById(productEntity.getId());
		
		if(original.isPresent()){
			ProductEntity product = original.get();
			product.setName(productEntity.getName());
			product.setPrice(productEntity.getPrice());
		
			repository.save(product);
			
			return new ProductDTO(product);
		}
		return null;
	}
	
	public boolean delete(Long id) {
		Optional<ProductEntity> original = repository.findById(id);
		
		if(original.isPresent()) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
}
