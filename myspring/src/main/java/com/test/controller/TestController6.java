package com.test.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.mapper.TestMapper;
import com.test.model.TestDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/day06/")
@Log4j
public class TestController6 {
	@Autowired
	private TestMapper testMapper;
	
	
	//폼화면 요청
	@GetMapping("form")
	public void form() {
		System.out.println("form요청!!");
	}
	
	
	
	
	
	/*
	//http://localhost:8080/day06/pro?id=java&pw=1234&age=10
	@RequestMapping(value = "pro", params = {"id=java","pw", "!age"})
	//id 파라미터는 java값으로 와야 요청성공 파라미터의 유효성 검사가능pw파라미터가 넘어오면 ok 값은 상관안함
	public String pro(String id, String pw) {
		return "day06/pro";
	}
	
	@RequestMapping("pro")
	public String pro(@RequestParam(value = "id", required = true)String id,
			@RequestParam(value = "pw", required = true) String pw) {
		System.out.println(id);
		System.out.println(pw);
		return "day06/pro";
	}

	//폼에서 넘어온 데이터 처리요청
	@PostMapping("pro")
	public void pro(TestDTO dto) {
		System.out.println("pro 요청!!");
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getAge());
		//DB저장
		testMapper.insertMember(dto);
		
	}
	*/
	@GetMapping("test")
	public void test() {
		//int count = testMapper.membercount();
		//System.out.println("count :" + count);
	
		//int maxage =testMapper.maxAge();
		//System.out.println("maxage : " + maxage);
		
		//List<TestDTO> list = testMapper.selectAll();
		//System.out.println(list);
		//list.forEach(dto -> System.out.println(dto));
		
		//TestDTO dto = testMapper.selectOne("spring03");
		//System.out.println(dto);
		
		
		//Timestamp reg = testMapper.getReg("spring02");
		//System.out.println(reg);
		
		//testMapper.updateMember("123", "5565",22);
		
		//동적쿼리
		//int count = testMapper.selectIf();
		//System.out.println(count);
		/*
		TestDTO dto = new TestDTO();
		//dto.setId("spring07");
		// id,pw 일치하는지 확인
		dto.setPw("758");
		int count = testMapper.selectIf2(dto);
		System.out.println("count : " + count);
		if(count >0) {
			System.out.println("로그인성공");
		}else {
			System.out.println("비밀번호를 잘못 입력하셨습니다.");
		}
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(700);
		
		List<TestDTO> resultList = testMapper.selectIn(list);
		System.out.println(resultList);
		resultList.forEach(dto -> System.out.println(dto));
		*/
		
		/*
		//selectKey
		TestDTO dto = new TestDTO();
		dto.setId("spring09");
		dto.setPw("01010");
		testMapper.insertSK(dto);
		System.out.println("dto : " + dto);
		*/
		
		// like// id에 s라는 문자가 포함된 정보 모두 추출
		/* 
		List<TestDTO> list = testMapper.selectLike("s");
		System.out.println(list);
		list.forEach(dto -> System.out.println(dto));
		*/
		
		//컬럼명(검색기준) 과 키워드 두개를 보내서 일치하는것 찾기
		HashMap map = new HashMap();
		map.put("column", "pw");  		//select박스로 사용자가 선택한 검색 기준
		map.put("keyword", "0");		//검색 키워드 작성한것
		List<TestDTO> list = testMapper.selectLike(map);
		System.out.println(list);
		list.forEach(dto -> System.out.println(dto));
		
		
		
		
		
		
	}
		
	
	
	
	
	
}
