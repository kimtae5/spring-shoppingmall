package com.test.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.TestDTO;

@Controller
@RequestMapping("/day03/")

public class TestCotroller2 {

	@GetMapping("test01")
	public void test01(String a) {
		System.out.println("/day03/test01 호출");
		System.out.println(a);
		
	}
	
	@GetMapping("form")
	public void form() {
		System.out.println("폼 요청!!!");
	}
	//폼엑서 submit눌러서 요청되는 pro요청 매핑
	@GetMapping("pro")
	//매객변수 나열해서 하나씩 따로 받기
	//public void pro(String id, String pw) {		//  이렇게 자동 으로 형변환
	//2 DTO안에 자동으로 바인딩해서 받기 : 이때 바인딩되는 객체안에는 setter 존재해야 함
	//public void pro(TestDTO dto, String id, int pw) {		//  이렇게 자동 으로 형변환 set메서드로 채워준다.

	public void pro(TestDTO dto, HttpServletRequest request, HttpServletResponse response, HttpSession session) {		//  이렇게 자동 으로 형변환 set메서드로 채워준다.
		System.out.println("pro 요청!!");
		System.out.println(dto);
		System.out.println("request : " + request);
		System.out.println("request : " + request.getRequestURI());
		System.out.println("response : " + response);
		System.out.println("session : " + session);
		
		
		
		
		
		/*								// 캡슐화
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		*/
		//int pwnum = Integer.parseInt(pw); 이렇게 안하고
		
		//TestDTO dto = new TestDTO();
		
		
	}
	
	
	//http://localhost:8080/day03/ex01?name=abc@age=10
	
	//@RequestParam ("파라미터명")
	//		:요청할때 넘어온 파라미터를 명시적으로 매개변수앞에 붙혀서
	//			해당 파라미터는 이 매개변수에 담아여 된다라고 알려주는것
	//			어노테이션을 붙히면 매개변수이름은 파라미터 이름과 달라도 괜찮다.
	
	@GetMapping("ex01")
	public void ex01(@RequestParam("name") String myName,
					 @RequestParam("age") int myAge) {
		System.out.println("ex01 요청");
		System.out.println("name : " + myName);
		System.out.println("age : " + myAge);
		
	}
	
	//http://localhost:8080/day03/ex02?arr=a&arr=b&arr=c
	@GetMapping("ex02")
	public void ex02(@RequestParam("arr") ArrayList<String> arr) {
		System.out.println("ex02 요청");
		System.out.println(arr);
		
	}
	
	@GetMapping("ex99")
	public void ex02(String[] arr) {    //배열은 requstparam 생략 가능
		System.out.println("ex02 요청");
		System.out.println(arr);
		for(String s : arr) {
			System.out.println(s);
		}
		
	}

	//뷰에 데이터 보내기
	@GetMapping("ex03")
	public void ex03(HttpServletRequest request, Model model) {
		System.out.println("ex03요청");
		
		//request 
		//request.setAttribute("name", "피카츄");
		//request.setAttribute("name2", "꼬북이");
		
		//model 객체에 속성 추가
		model.addAttribute("name","터미네이터");
		model.addAttribute("name2","T1000");
		
	}
	
	
	
	
	
	
	
	
}
