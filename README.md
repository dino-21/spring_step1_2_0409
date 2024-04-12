STEP2_스프링프로젝트_영속_서비스_프레젠테이션계층

---

![22](https://github.com/dino-21/step2_spring_data_service_pt/assets/80396471/56ec4208-64bb-47d6-8bfa-59f6eb683bae)

![15](https://github.com/dino-21/step2_spring_data_service_pt/assets/80396471/45468d20-bc70-43f8-926b-fe2f8c545b4f)

![5](https://github.com/dino-21/step2_spring_data_service_pt/assets/80396471/cdbb5a2e-67c2-4aa9-a792-c94e20434c92)


1. oracle에서 테이블 생성 더미 테이블 추가
--------------   영속 계층   --------------------
영속 계층 작업 준비
- VO(value Object) 클래스의 생성
- Mybatis의 Mapper 인터페이스의 작성 XML 처리
- Mapper 인터페이스의 테스트

2. BoardVO.java 만들기

3. root-context.xml  코드 확인
<!-- org.zerock.mapper 패키지 내의 MyBatis 매퍼 인터페이스를 자동으로 스캔하는 설정 -->
<mybatis-spring:scan base-package="org.zerock.mapper" />

4. BoardMapper.java 파일 만들기(Mapper 인터페이스 만들기)

5. BoardMapperTests.java 파일만들기  맵퍼인터페이스에서 우클릭 테스트파일만들기

6. BoardMapperTests.java 파일에서 
   testGetList() 만들고 확인하기

7. Mapper XML파일 만들준비 
   폴더 따로따로 만들기
src/main/resources 패키지 아래로 폴더 따로따로 만들기 – org/zerock/mapper

8. BoardMapper.xml   select문 작성 

9. BoardMapper.java   SQL 삭제 확인
   public List<BoardVO> getList();

10.  영속 영역의 CRUD 구현

BoardMapper.java    인터페이스
BoardMapper.xml    맵핑 파일
BoardMapperTests.java   테스트 파일

결과 확인하기

--------------   비즈니스 (서비스) 계층   --------------------

11. 비지니스 계층
org/zerock/service 패키지 아래
BoardService.java 인터페이스와 
인터페이스를 구현한
BoardServiceImpl.java 클래스 만듬

12. BoardService.java  인터페이스 
BoardServiceImpl.java  구현파일

13.  root-context.xml
<!-- org.zerock.service 패키지의 컴포넌트를 스캔하는 설정 -->
<context:component-scan base-package="org.zerock.service" />


14.  비즈니스 계층의 구현과 테스트
테스트 클래스 작성
BoardService.java에서 우클릭
New > JUnit Test Case 하면 아래쪽에 테스트 클래스만들어짐


15.
BoardServiceTests.java에서 코드 작성 후
 BoardService 객체가 제대로 주입이 가능한지 
확인하는 작업

16. 등록 insert 작업의 구현과 테스트
BoardServiceImpl.java 코드 수정
BoardServiceTests.java 코드 추가
확인


17. 목록 list 작업의 구현과 테스트

18. 조회 select 작업 구현과 테스트

19. 삭제 / 수정 구현과 테스트



--------------   프리젠테이션 계층   --------------------

20.  프리젠테이션(웹) 계층의 CRUD 구현
테이블로 정리한 후 코드로 작성


21.  목록에 대한 처리와 테스트 - BoardController


22. list.jsp list출력

23. MockMvc  가짜 mvc 만들기 
목록에 대한 처리와 테스트   
BoardControllerTests.java


24.  등록처리와 테스트   controller 

25. MockMvc  등록처리와 테스트  


26.  조회처리와 테스트   controller 

27. MockMvc  조회처리와 테스트  



28.  수정처리와 테스트   controller 

29. MockMvc  수정처리와 테스트  



30.  삭제처리와 테스트   controller 
31. MockMvc  삭제처리와 테스트  








