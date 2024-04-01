package com.gdu.myapp.mapper;

import java.util.Map;

import com.gdu.myapp.dto.LeaveUserDto;
import com.gdu.myapp.dto.UserDto;

// XML과 interface가 직접 소통하는 mybatis 방식.
// 인터페이스 메소드 이름과 xml의 쿼리id를 맞춘다.
// xml의 namespace를 인터페이스의 이름으로 맞춤.
// rootcontext에 가서 mybatis-spring:scan 설정을 맞춘다

public interface UserMapper {
  UserDto getUserByMap(Map<String, Object> map);
  int insertAccessHistory(Map<String, Object> map);
  LeaveUserDto getLeaveUserByMap(Map<String, Object> map); 
  int insertUser(UserDto user);
}