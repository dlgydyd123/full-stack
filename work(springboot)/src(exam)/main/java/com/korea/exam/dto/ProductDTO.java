package com.korea.exam.dto;

import com.korea.exam.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

	private Long id;
	private String name;
	private Double price;
	private Integer stock;
	
	public ProductDTO(ProductEntity productEntity) {
		this.id=productEntity.getId();
		this.name=productEntity.getName();
		this.price=productEntity.getPrice();
		this.stock=productEntity.getStock();
	}
	
	public static ProductEntity toEntity(ProductDTO dto) {
		return ProductEntity.builder()
		 				.id(dto.getId())
		 				.name(dto.getName())
		 				.price(dto.getPrice())
		 				.stock(dto.getStock())
		 				.build();
	}
}
