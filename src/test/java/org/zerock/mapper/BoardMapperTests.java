package org.zerock.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	
	@Autowired
	private BoardMapper mapper;
	
	
	@Test
	public void testGetList() {
	   mapper.getList().forEach(board->log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		board.setWriter("newbie");
		mapper.insert(board);
		log.info(board);
	}
	
   @Test
   public void testInsertSelectKey() {
	   BoardVO board = new BoardVO();
	   board.setTitle("새로 작성하는 글123");
	   board.setContent("새로 작성하는 내용123");
       board.setWriter("newbie");
       mapper.insertSelectKey(board);
       log.info(board);
   }
   
   @Test
   public void testRead() {
	   BoardVO board = mapper.read(5L);
	   log.info(board);
   }

   
   @Test
   public void testDelete() {
	   log.info("delete num :" + mapper.delete(5L));
   }
   
   @Test
   public void testUpdate() {
	   BoardVO board = new BoardVO();
	   
	   board.setBno(3L);
	   board.setTitle("수정된제목");
	   board.setContent("수정된내용");
	   board.setWriter("user00");
	   int count = mapper.update(board);
	   log.info("update" + count);
   }
}








