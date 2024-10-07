package com.korea.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService service;

//	@PostMapping
//	public ResponseEntity<?> addProduct(@RequestBody ProductDTO dto) {
//		ProductDTO product = service.addProduct(dto);
//		return ResponseEntity.ok().body(product);
//	}

	// 상품추가
	@PostMapping
	public ResponseEntity<?> addProduct() {
		return ResponseEntity.ok().body(service.addProduct());
	}

	// 조회하기
	@GetMapping
	public ResponseEntity<?> getFilteredProducts(
			@RequestParam (value="minPrice", required = false) Double minPrice, 
			@RequestParam (value="name", required = false)String name) {
		List<ProductDTO> product = service.getFliteredProducts(minPrice, name);
		return ResponseEntity.ok().body(product);
	}
	
	//수정하기
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProduct(@PathVariable int id, @RequestBody ProductDTO dto){
		ProductDTO product = service.updateProduct(id, dto);
		if(product !=null) {
			return ResponseEntity.ok().body(product);
		}
		return ResponseEntity.badRequest().body("업데이트가 안됐습니다.");
	}
	
	
	//삭제하기
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable int id){
		boolean product = service.deleteProduct(id);
		if(product) {
			return ResponseEntity.ok().body("삭제성공");
		}
		return ResponseEntity.badRequest().body("삭제실패");
		
	}
}
