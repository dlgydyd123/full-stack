package com.korea.user.dto;

import com.korea.user.model.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

	private int id;
	private String name;
	private String email;

	//Entity -> DTO
	//final을 붙이게 되면 상수가 되고 한번 값을 넣으면 변경이 불가능하다.
	//생성자 내에서 한 번만 설정되고 이후 변경할 수 없다.
	//생성자 내에서 entity에 다른 값을 할당할 수 없다.  
	public UserDTO(UserEntity entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
	}

	//DTO -> Entity
	public static UserEntity toEntity(UserDTO dto) {
		return UserEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.email(dto.getEmail())
				.build();
	}
}
