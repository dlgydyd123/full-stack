package com.korea.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.persistence.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository repository;

	// 사용자 생성
	// 컨트롤러로부터 이름과 이메일이 담겨있는 Entity를 넘겨받는다.
	// db에 추가를 한 후 , 추가가 잘 됐는지 조회를 한 데이터를 컨트롤러로 넘겨야 한다.
	public List<UserDTO> create(UserEntity entity) {
		repository.save(entity); // 데이터베이스에 저장
		return repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}

	// 모든 유저 조회
	public List<UserDTO> getAllUsers() {
		repository.findAll();
		return repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}

	// 이메일을 통한 조회
	public UserDTO getUserByEmail(String email) {
		UserEntity entity = repository.findByEmail(email);
		return new UserDTO(entity);
	}

	public List<UserDTO> updateUser(UserEntity entity) {

		Optional<UserEntity> original = repository.findById(entity.getId());

		if (original.isPresent()) {
			UserEntity user = original.get();
			user.setName(entity.getName());
			user.setEmail(entity.getEmail());

			repository.save(user);
		}

		return getAllUsers();
	}

	public boolean deleteUser(Integer id) {

		Optional<UserEntity> original = repository.findById(id);

		if (original.isPresent()) {
			repository.deleteById(id);
			return true;
		} else {
			return false;
		}

	}

}
