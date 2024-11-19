package com.example.test.dto;

import java.time.LocalDateTime;

import com.example.test.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {

	private int productId;
	private String productName;
	private int productCount;
	private int productPrice;
	private LocalDateTime signupDate;
	private LocalDateTime modifyDate;

	public ProductDTO(ProductEntity entity) {
		this.productId = entity.getProductId();
		this.productName = entity.getProductName();
		this.productCount = entity.getProductCount();
		this.productPrice = entity.getProductPrice();
		this.signupDate = entity.getSignupDate();
		this.modifyDate = entity.getModifyDate();
	}

	public static ProductEntity toEntity(ProductDTO dto) {
		return ProductEntity.builder()
				.productId(dto.getProductId())
				.productName(dto.getProductName())
				.productCount(dto.getProductCount())
				.productPrice(dto.getProductPrice())
				.signupDate(dto.getSignupDate())
				.modifyDate(dto.getModifyDate())
				.build();
	}
}
