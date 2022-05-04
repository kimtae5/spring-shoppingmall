package com.test.persistence;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.mapper.TimeMapper;
import com.test.model.TestDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class TimeMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	/*
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
	}
	@Test
	public void testGetTime2() {
		log.info("*******************************");
		log.info(timeMapper.getTime2());
		log.info("*******************************");
		log.warn("dkdkdkdk");
	}
	
	@Test
	public void testGetAllId() {
		log.info("********************************************");
		List<String> list = timeMapper.getAllId();
		log.info(list);
		log.info("********************************************");
	}

	@Test
	public void testGetMember() {
		TestDTO dto = timeMapper.getMember("java");
		log.info(dto);
	}
	*/
	
	@Test
	public void testInsertMember() {
		TestDTO dto = new TestDTO();
		dto.setId("spring04");
		dto.setPw("1321");
		dto.setAge(22);
		int result = timeMapper.insertMember(dto);
		log.info("result ************** :" + result);
				
	}
	
		
	
	@Test
	public void testUpdatePassword() {
		TestDTO dto = new TestDTO();
		dto.setId("t55");
		dto.setPw("1122");
		int result1 = timeMapper.modifyPw(dto);
		log.info("reserut1***********" + result1);
	}
	
	/*
	@Test
	public void testDeleteMember() {
		TestDTO dto = new TestDTO();
		dto.setId("java10");
		int result2 = timeMapper.deleteMember(dto);
		log.info("resert2**************" + result1);
		
	}
	
	*/
	
	
	
	
	
	
	
	

}
