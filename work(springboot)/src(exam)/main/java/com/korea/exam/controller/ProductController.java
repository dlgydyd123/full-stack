package com.korea.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.korea.exam.dto.ProductDTO;
import com.korea.exam.entity.ProductEntity;
import com.korea.exam.service.ProductService;



@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	
		@PostMapping
		public ResponseEntity<?> create(@RequestBody ProductDTO dto){
			ProductEntity entity = ProductDTO.toEntity(dto);
			List<ProductDTO> products = service.create(entity);
			return ResponseEntity.ok().body(products);
			
		}
		
		@GetMapping
		public ResponseEntity<?> readAll(){
			List<ProductDTO> products = service.readAll();
			return ResponseEntity.ok().body(products);
		}
		
		
		@GetMapping("/{id}")
		public ResponseEntity<?> getUserByEmail(@PathVariable Long id){
			ProductDTO products = service.readById(id);
			return ResponseEntity.ok(products);
		}
		
		@PutMapping
		public ResponseEntity<?> update(@RequestBody ProductDTO dto){
			ProductEntity entity = ProductDTO.toEntity(dto);
			ProductDTO products = service.update(entity);
			return ResponseEntity.ok().body(products);
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete(@PathVariable Long id){
			
			boolean isDelete = service.delete(id);
			if(isDelete) {
				return ResponseEntity.ok().body("삭제완료");
			}
			return ResponseEntity.status(404).body("삭제실패");
			
		}
}
