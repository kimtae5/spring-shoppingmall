package com.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// 컨트롤러 역활을 할 클래스다~ 선언.
@Controller

@RequestMapping("/sample")	// 클래스 레벨에 경로 추가 이클래스 안에
							//메서드들의 경로 전에 모두/sample/경로가 추가됨

public class SampleController {
	//RM에 요청주소만 작성하면 GET 방식, POST방식 모두 받아줌.
	
	@RequestMapping("hello")
	public String hello() {
		System.out.println("hello page 요청됨!!" );
		
		//hello요청에 해당하는 비지니스로직 처리할 객체의 메서드 호출(로직처리 해라~)
		
		//http://localhost:8080/sample/hello
		// return "WEB-INF/views/day02/test.jsp";  원래는 이것 하지만 servlet-context.xml에서  생략가능하게 만들어 줬다.
		return "day02/test"; //보여줘야하는 jsp페이지 리턴
	}
	
	// 요청 방식 지정 가능. value="요청주소", method=요청방식 (임포트 필요)
	/*
	C Create	POST
	R read		GET
	U Update	PUT
	D Delete 	DELETE
	*/
	@RequestMapping(value = "test", method= {RequestMethod.GET, RequestMethod.POST})
	public String test() {
		System.out.println("테스트 요청!!!");
		return "day02/test";
	}
	@GetMapping("test2")	//GET 요청만 받는 어노테이션(스프링4.3버전부터 사용가능)
	public String test2() {
		System.out.println("테스트 요청  22222!!!");
		return "day02/test";
	}
	@PostMapping("test3")
	public String test3() {
		System.out.println("테스트 요청  333333!!");
		return "day02/test";
	}
	//여러경로 한번에 적용 : 중괄호로 묶어서 나열
	@GetMapping({"test4","test5"})
	public String test4() {
		System.out.println("테스트 요청  4444445555!!");
		return "day02/test";
	}
	//
	@GetMapping("sample?")
	public String test6() {
		System.out.println("테스트 요청  666666!!");
		return "day02/test";
	}
	
	
	
	

}
