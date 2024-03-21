package com.gdu.prj07;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.gdu.prj07.service.ContactService;

/* 1. JUnit4 를 이용한다. */
@RunWith(SpringJUnit4ClassRunner.class)

/*
 * 2. ContactDaoImpl 클래스의 bean 생성 방법을 작성한다.
 *  1) <bean>      locations="file:src/main/webapp/WEB-INF/spring/root-context.xml"
 *  2) @Bean       classes=AppConfig.class
 *  3) @Component  locations="file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
 */


// ContactService 타입의 CotactServiceImpl bean 이 등록된 파일
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

// WebApplicationContext 타입의 bean 을 Spring Container 에 만든다. 
@WebAppConfiguration

public class ContectMocktest {
  
  @Autowired  //위에서 만든 빈을 아래 변수에 의존성주입함
  private WebApplicationContext webApplicationContext;
  
  // 테스트 수행을 위한 MockMvc 객체 선언
  private MockMvc mockMvc;
  
  // MockMvc 객체 생성 (테스트 수행 이전에 생성한다.)
  @Before
  public void setUp() {
    mockMvc = MockMvcBuilders
                 .webAppContextSetup(webApplicationContext)
                 .build();  // 일종의 가상의 웹서버
  }
  
  
  
}