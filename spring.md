#### 방법
- STS 툴을 이용하는 방법  
    - 현업에서 주로 사용
- 라이브러리를 받아 사용하는 방법

#### Spring과 MyBatis의 연결
- Spring  
    - IOC (Inversion of Control) 기능 
        - DL  
        - DI (Dependancy Injection), 의존관계 주입 -> xml 파일 건드림
            -> 의존하는 클래스에 대한 인스턴스를 직접 생성하지 않고, 컨테이너로부터 생성된 빈을 setter또는 생성자를 통해 외부로부터 주입받는 것
            - Setter Injection
            - Property Injection  
    - AOP  
    - ** Interceptor  
- Mybatis  
    - ORM  

- Spring 설정에서는 .xml파일을 사용
    - web  
        - filter  
    - root-context  
    - servlet-context  
- MyBatix 설정 .xml 파일
    - ~config.xml
    - ~DQM.xml

#### 동작 원리
- 컨테이너에 맞게 스프링을 설정하면 컨테이너 위에 스피링 컨테이너가 올라간다.
    - 스프링 컨테이너에 의해서 인스턴스들이 활동하고 알맞는 컨트롤러를 사용할 수 있다
- 어노테이션을 이용하여 코드상에서 의존관계 등을 잡아줄 수 있다
    - @Component
        - @Controller
        - @Service
        - @Repository : DAO
    - @Autowired 보단 @Resource -> 여러 지원을 받을 수 있는 코드를 제공
- 싱글턴 패턴으로 인하여 각각의 인스턴스는 한번만 생성되어 활용된다
- POJO 
- pom.xml : 메이븐을 관리하는 xml파일
- css js 이미지 파일 등은 webapp 내부의 resources 폴더에 들어갈 것


