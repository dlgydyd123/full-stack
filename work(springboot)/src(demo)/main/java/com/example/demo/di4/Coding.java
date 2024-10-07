package com.example.demo.di4;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//코딩을 하려면 컴퓨터가 필요하다.
@Component
@RequiredArgsConstructor //생성자 생성
@Getter
public class Coding {

	//final이나 @NonNull붙히고
	private final Computer computer;

}
