package com.gdu.prj03.service;

import java.util.List;

import com.gdu.prj03.dto.BoardDto;

//       @Controller  @Service  @Repository
//view - controller - service - dao 

public interface BoardService {
  List<BoardDto> getBoardList();
  BoardDto getBoardByNo(int boardNo);

}
