package com.test.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component 		// 스프링이 관리할 객체이다. <context:component-scan>
@Data 		//Restaurant 의 getter/setter/toString/ 생성자 등등 더 자동 생성
public class Restaurant {
	/*	@Setter : 자동으로 setChef()를 컴파일시 생성함.
	 * onMethod_ : 생성되는 setChef()에 @Autowired 어노테이션을 추가.
	 * 			setChef(Chef) 메서드에 매개변수로 있는 Chef를 자동으로 주입해줘~~
	 */
	//방법1. @Autowired
	//@Autowired
	//방법2. @setter(onMethod_=@Autowired)
	@Setter(onMethod_=@Autowired)
	//방법3. xml에서 <bean>으로 이클래스 생성할때, <property>태그로 set메서드 호출하여
	//		채워주는 형태로 작성
	
	
	private Chef chef;

	// Restaurant rt = new Restaurant();   --> 스프링이 객체생성하도록...
 	//rt.setChef스프링이 객체생성해둔 Chef객체를 자동으로 매개변수값으로 채우기
	
	
}
