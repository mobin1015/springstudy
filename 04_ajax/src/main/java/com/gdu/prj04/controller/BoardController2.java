package com.gdu.prj04.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdu.prj04.dto.BoardDto;
import com.gdu.prj04.service.BoardService;

import lombok.RequiredArgsConstructor;


@RequestMapping("/ajax2")  // /ajax1 로 시작하는 모든 요청을 담당하는 컨트롤러
@RequiredArgsConstructor
@RestController // 모든 메소드는 @ResponseBody annotation 을 가지게 된다.
public class BoardController2 {

  
  private final BoardService boardService;
  
  
  @GetMapping(value="/list.do", produces=MediaType.APPLICATION_JSON_VALUE )  // produces : 응답 데이터 타입 (Content-Type)
  public List<BoardDto> list() {  // jackson 라이브러리가 List<BoardDto> 를 JSON 데이터로 변환한다.
    return boardService.getBoardList();
  }
  

  
  @GetMapping(value="/detail.do", produces=MediaType.APPLICATION_JSON_VALUE)
  public BoardDto detail(BoardDto board) {
    return boardService.getBoardByNo(board.getBoardNo());
  } 
  
  
}