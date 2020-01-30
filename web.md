### 웹의 이해
```
1.브라우저는 서버와 http 프로토콜을 통해 통신한다
2. Server .. Container .. WAS/Tomcat  
	- Tomcat(아파치) 내부에는 실행환경이 설정된다 (JVM)  
		- 자바 코드는 이곳에 올라가게된다  
		- 내부에는 JSP와 Survlet 언어를 활용하여 구성된다  + java  
			- JSP는 (HTML + JAVA), HTML형태 (뼈대가 HTML)  
			- Survlet은 (JAVA + HTML), 클래스 형태 (뼈대가 자바)  

3. 위에서 구현된 서버는 jdbc를 통해 DB와 연동된다

- 서버 차원에선 FrameWork를 활용해서 구현이 보편적
- 서버 포함 안쪽 = BackEnd  
```
```
- FrontEnd는 브라우저 차원 html, css, js
- 모바일, 태블릿 환경에서 안드로이드 활용할 것
- 네이티브 또는 web 형태를 선택해서 구현
- 반응형 웹을 구현해야 한다 (부트스트랩)
```
- 백엔드 구축 -> 프레임워크
- 백엔드 구축을 위해서는 우선 톰캣이 필요

- webapp 폴더에는 jsp, html, script, image등이 들어간다 
- lib에는 사용할 라이브러리를 넣는 곳
- web.xml은 배치관리자, 프로젝트의 설정을 담고있는 파일
- 자바 리소스의 src에 있는 자바 파일들은 컴파일 되어 webapp내부에 저장, 지금 이클립스는 bulid에 저장, 설정하여 변경함
- utf-8 사용할 것!!

Markup Language
- 바디와 태그로 이루어진 언어

http://www.naver.com/80/index.jsp - 이런식으로 
http://localhost:8088/incWEB/greeting.jsp
localhost = 127.0.0.1
사용 포트가 80이면 생략해도 된다
http://localhost:8088/incWEB/greeting.do [?key=value&key=value] : 쿼리스트링(get 방식)
http://localhost:8088/incWEB/greeting.do : post 방식


#### Servlet의 5가지 매소드
```
- init() - 라이프사이클 관여
- service() - 라이프사이클 관여
- destroy() - 라이프사이클 관여
	- 상속받는 Generic Servlet
		- 상속받는 Http Servlet
```
- 하나의 request에만 반응이 가능하다
response.setContentType("text/html;charset=utf-8");
디폴트로 do인 경우엔 doGet이 호출된다

#### 제어의 역행
- 서블릿에 대한 것을 컨테이너가 관리한다

#### MVC
```
- 뷰의 역할은 JSP가 하고
- 서블릿은 컨트롤러의 역할을 하게 된다
	- request response를 해야하므로
- .do 파일에서 response를 redirect를 하여 jsp를 통해 사용자에게 보여준다
- 여러개의 패턴이 조합된 하나의 패턴 (아키텍체로 보기도 한다)
- 서블릿 : 컨트롤러, jsp : 뷰 역할이 보편적이다  
	- @WebServlet("greeting.do") : 사용자의 request URL이 고정되어짐  
	- insert, update, select 등 사용자의 요청에 각각 대응하는 Servlet이 필요하게 된다  
		- 하지만 여러개의 컨트롤러가 나온다면 좋지않다  
		- 여러 요구에 대응할 수 있는 하나의 컨트롤러를 만들자!  
		-  @WebServlet("greeting.do") 같은 와일드카드 매핑을 통해 하나의 Servlet이 모든 리퀘스를 받을 수 있다  
			- Facade Pattern : 뒷단의 각 컨트롤러로 인스턴스를 넘겨주는 패턴
			- 일반 .java에 대한 라이프사이클에는 컨테이너가 관여하지 않는다
			- 이는 사용자의 리퀘스트에 대해 무분별한 객체 생성을 할 수 있다 -> 싱글턴 패턴의 등장
```

- Request .. 프론트 컨트롤러 .. 컨트롤러 .. service .. dao 형태에서 service와 dao 쪽을 Model로 생각한다  
- 컨트롤러는 프론트 컨트롤러로 View(.jsp)를 넘겨준다  
	- 넘겨진 뷰는 프론트컨트롤러를 거쳐 프론트로 간다  
	- Front Controller Pattern
- 컨트롤러는 서비스를 가지고 서비스는 DAO를 가진다  
- 서비스, DAO는 인터페이스를 만들어 구문에 대한 표준을 잡는다  
	- Command Pattern  
- 이를 편하게 해주는 것이 프레임웤이다
- DAO Pattern, 위임 패턴
- service : 비즈니스 로직 처리
- 컨트롤러 : 파라미터를 가져오는 역할, 유효성 체크
	- 뷰를 찾는 작업, 뷰에 데이터를 심어주는 작업
	- 업무당 컨트롤러가 있을것
	- 컨트롤러는 여러개 있을것이지만 싱클턴에 의해 컨트롤러는 한번만 올라가서 
	- 인터페이스를 생성해서 오버라이딩을 하는 형태, 생성된 객체를 넘겨주는 형태 (Factory를 만들고 각각의 컨트롤러 객체를 만들어 저장 : 싱글턴)
		- 팩토리는 싱글턴


- insert의 경우 jstl, el을 사용
- MVC 패턴에서 같은 요청과 응답이지만, Redirect의 경우 요청, jsp응답, jsp요청, 응답 형태로 jsp를 주고받는 과정이 추가된다
	- redirect -> .jsp로 뜸
	- forward 방식은 요청에 대하여 jsp를 통해 바로 응답
	- forward 방식이 데이터 공유가 더 편함
- HTML에서 Result :: ${msg} 식인 경우 redirect 방식은 msg 변수를 가져오지 못함
	- 포워드방식은 데이터를 가져온다

#### 주의  
- form은 post방식으로 한다 입력을 숨긴다
- CRUD

#### 첨언
- 인터페이스를 통해 구현하는 방식으로 여러개의 DAO 여러개의 서비스들을 관리한다
- 하나 이상의 파라미터가 있으면 객체로
- DTO,     VO : 백에서 날라옴
- DAO와 DB와의 커넥션
https://lemontia.tistory.com/591


#### DAO
- 마이바티스같은 프레임워크 주로 사용
- java.sql.* --> driver.jar
	- JDBC를 통해 각 벤더사의 드라이버 필요없이 데이터베이스에 연결할 수 있다
```
단계 (모든 과정은 예외를 내포하고 있다 -> 예외처리 중요) try catch finally try catch
1. Driver Loading
2. Connection
3. Statement (SQL을 담는다)
4. Execute  
	- DML 리턴 int  
	- SELECT 리턴 Result Set (가상의 테이블)  
5. ResultSet 핸들링
6. Close();
커넥션 이후의 과정에는 지역변수를 활용하고 버려진다 (오버헤드를 줄이기 위함)
```














































