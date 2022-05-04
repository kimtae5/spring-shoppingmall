package com.test.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component 	//스프링이 관리해야할 객체다. : component-scan
@Data  //Lombok의 setter/getter, 생성자등등 자동으로 생성해주는 어노테이션
public class Chef {
	
	
}
// http://localhost:8080/controller