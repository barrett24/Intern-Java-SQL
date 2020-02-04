SELECT	*
FROM	EMPLOYEES;
----------------------------------------------------------
SELECT	*
FROM EMPLOYEE;
----------------------------------------------------------
SELECT	  EMP_ID
		, EMP_NAME
		, SALARY
FROM	EMPLOYEE;
-- WHERE	
----------------------------------------------------------
SELECT 	EMP_NAME,
		SALARY*12,
		( SALARY + (SALARY * BONUS_PCT)) *12
FROM EMPLOYEE;
----------------------------------------------------------
SELECT	   EMP_ID AS "empid"
		,  EMP_NAME AS 이름
		,  SALARY AS "급여(원)"
FROM	EMPLOYEE;

SELECT	EMP_NAME
		SALARY AS 급여(원) --오류
FROM	EMPLOYEE;

SELECT	EMP_NAME,
		SALARY AS 1달급여 -- 오류
FROM	EMPLOYEE;
----------------------------------------------------------
SELECT	EMP_ID,
		EMP_NAME,
		'재직' AS 근무여부
FROM	EMPLOYEE;
----------------------------------------------------------
SELECT DISTINCT	DEPT_ID
FROM	EMPLOYEE;

SELECT DISTINCT JOB_ID, DEPT_ID
FROM	EMPLOYEE;
----------------------------------------------------------
SELECT	EMP_NAME AS 이름,
		DEPT_ID AS 부서
FROM	EMPLOYEE
WHERE	DEPT_ID = '90';
----------------------------------------------------------
SELECT	EMP_NAME AS 이름,
		SALARY AS 급여
FROM	EMPLOYEE
WHERE	SALARY > 4000000;
----------------------------------------------------------
SELECT	EMP_NAME AS 이름,
		DEPT_ID AS 부서,
		SALARY AS 급여
FROM	EMPLOYEE
WHERE	DEPT_ID = '90'
AND		SALARY > 2000000;
----------------------------------------------------------
SELECT	EMP_NAME AS 이름,
		DEPT_ID AS 부서,
		SALARY AS 급여
FROM	EMPLOYEE
WHERE	DEPT_ID = '90'
OR		DEPT_ID = '20';
----------------------------------------------------------
SELECT	EMP_ID||EMP_NAME||SALARY
FROM	EMPLOYEE;

SELECT	EMP_NAME||'의 월급은'||SALARY||'원 입니다.' AS "개인 월급" -- 이쁜 칼럼명을 위해 별칭이 필요하다
FROM	EMPLOYEE;
----------------------------------------------------------
SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
WHERE	SALARY BETWEEN 3500000 AND 5500000;

SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
WHERE	SALARY >= 3500000
AND		SALARY <= 5500000;
----------------------------------------------------------
SELECT	EMP_NAME, SALARY
FROM	EMPLOYEE
WHERE	EMP_NAME LIKE '김%';
----------------------------------------------------------
SELECT	EMP_NAME, PHONE
FROM	EMPLOYEE
WHERE	PHONE LIKE '___9_______'; -- 자릿수를 꼭 맞춰야 할 때
SELECT	EMP_NAME, PHONE
FROM	EMPLOYEE
WHERE	PHONE LIKE '___9%';
----------------------------------------------------------
SELECT	EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '___ \_%' ESCAPE '\';

SELECT	EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '___ #_%' ESCAPE '#';
----------------------------------------------------------
SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
WHERE	EMP_NAME NOT LIKE '김%';
----------------------------------------------------------
SELECT	EMP_NAME, MGR_ID, DEPT_ID
FROM	EMPLOYEE
WHERE	MGR_ID IS NULL
AND		DEPT_IS IS NULL;

SELECT	EMP_NAME, DEPT_ID, BONUS_PCT
FROM	EMPLOYEE
WHERE	DEPT_ID IS NULL
AND		BONUS_PCT IS NOT NULL;
----------------------------------------------------------
SELECT	EMP_NAME, DEPT_ID, SALARY
FROM	EMPLOYEE
WHERE 	DEPT_ID INT('60, '90);

SELECT	EMP_NAME, DEPT_ID, SALARY
FROM	EMPLOYEE
WHERE	DEPT_ID = '60'
OR		DEPT_ID = '90';
----------------------------------------------------------
SELECT	EMP_NAME, SALARY, DEPT_ID
FROM	EMPLOYEE
WHERE	( DEPT_ID = '20'
OR		DEPT_ID = '90' ) ---- 괄호로 연산자 우선순위를 적용할 수 있다 (or라인이 먼저 적용된다)
AND		SALARY > 3000000;

SELECT	EMP_NAME, SALARY, DEPT_ID
FROM	EMPLOYEE
WHERE	DEPT_ID = '20'
OR		DEPT_ID = '90'
AND		SALARY > 3000000;
----------------------------------------------------------
SELECT 	LENGTH(CHARTYPE),
		LENGTH(VARCHARTYPE) -- 문자열의 갯수 반환
FROM	COLUMN_LENGTH;
SELECT * FROM COLUMN_LENGTH;
----------------------------------------------------------
SELECT * FROM EMPLOYEE;

SELECT	EMAIL,
		INSTR(EMAIL, 'c', -1, 2) AS 위치
FROM EMPLOYEE;

SELECT	EMAIL,
		INSTR(EMAIL, 'c', INSTR(EMAIL, '.')-1) AS 위치
FROM	EMPLOYEE;
----------------------------------------------------------
SELECT	EMAIL AS 원본데이터,
		LENGTH(EMAIL) AS 원본길이,
		RPAD(EMAIL, 20, '.') AS 적용결과,
		LENGTH(LPAD(EMAIL, 20, '.')) AS 결과길이
FROM	EMPLOYEE;
----------------------------------------------------------
SELECT LTRIM('...tech') FROM DUAL;
SELECT LTRIM('   tech', '.') FROM DUAL;
SELECT LTRIM('000123', '123') FROM DUAL;
SELECT LTRIM('123123Tech123', '123') FROM DUAL;
----------------------------------------------------------
SELECT TRIM('   tech   ') FROM DUAL;
SELECT TRIM('a' FROM 'aatechaaa') FROM DUAL;
SELECT TRIM(LEADING '0' FROM '00123') FROM DUAL;
SELECT TRIM(TRAILING '1' FROM 'Tech1') FROM DUAL;
SELECT TRIM(BOTH '1' FROM '1Tech111') FROM DUAL;
----------------------------------------------------------
SELECT SUBSTR('THIS IS A TEST', 6, 2) FROM DUAL;
SELECT SUBSTR('THIS IS A TEST', 6) FROM DUAL;
SELECT SUBSTR('THIS IS A TEST', -3, 3) FROM DUAL;
----------------------------------------------------------
SELECT ROUND(125.315, 1) FROM DUAL;
SELECT ROUND(125.315, -1) FROM DUAL;
----------------------------------------------------------
SELECT TRUNC(125.315, 1) FROM DUAL;
----------------------------------------------------------
SELECT	EMP_NAME,
		HIRE_DATE,
		ADD_MONTHS(HIRE_DATE, 240) -- 2년
FROM	EMPLOYEE;
----------------------------------------------------------
SELECT	EMP_NAME, 
		HIRE_DATE, 
		DEPT_ID, 
		ROUND(MONTHS_BETWEEN(SYSDATE, HIRE_DATE) / 12) AS 근속년수,
		JOB_ID AS 직급,
		DEPT_ID AS 부서
FROM	EMPLOYEE
WHERE	MONTHS_BETWEEN(SYSDATE, HIRE_DATE) >= 240;
----------------------------------------------------------
SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
WHERE EMP_ID = 100; -- 묵시적 형변환 (100이 바뀌는게 아니라 컴파일러가 칼럼의 값을 바꿈)
					-- 묵시적 형변환은 시스템 성능저하를 초래하기도 하므로 지양할 것
SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
WHERE	EMP_ID = TO_CHAR(100); -- 명시적 형변환

SELECT TO_CHAR(1234, '999999') FROM DUAL;	-- 9는 자릿수 지정
SELECT TO_CHAR(1234, '09999') FROM DUAL;	-- 남은 자리를 0으로
SELECT TO_CHAR(1234, 'L99999') FROM DUAL;	-- L 또는 $는 통화기호 표시
SELECT TO_CHAR(1234, '99,999') FROM DUAL;	-- . 또는 ,는 지정한 위치에 . 또는 , 표시
SELECT TO_CHAR(1234, '09,999') FROM DUAL;
SELECT TO_CHAR(1234, '9.9EEEE') FROM DUAL;	-- 과학 지수 표기법
SELECT TO_CHAR(1234, '999') FROM DUAL;		-- 자릿수가 적으면 에러

SELECT TO_CHAR(SYSDATE, 'PM HH24:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'AM HH:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'MON DY, YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-fmMM-DD DAY') FROM DUAL;	-- FM은 좌우 공백제거
SELECT TO_CHAR(SYSDATE, 'YYYY-MMfmDD DAY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'Year, Q') FROM DUAL;

SELECT	EMP_NAME AS 이름,
		TO_CHAR(HIRE_DATE, 'YYYY-MM-DD') AS 입사일
FROM 	EMPLOYEE
WHERE	JOB_ID = 'J7';	-- 문자열은 대소문자를 구분한다는 점에 주의할것

SELECT	EMP_NAME AS 이름,
		TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"') AS 입사일
FROM EMPLOYEE
WHERE JOB_ID = 'J7';

SELECT	EMP_NAME AS 이름,
		SUBSTR(HIRE_DATE, 1,2)||'년 '||		-- DATE형식에서 년의 위치 다시 공부하기
		SUBSTR(HIRE_DATE, 4,2)||'월 '||
		SUBSTR(HIRE_DATE, 7,2)||'일 ' AS 입사일
FROM EMPLOYEE
WHERE JOB_ID = 'J7';

SELECT	EMP_NAME, HIRE_DATE
FROM	EMPLOYEE
WHERE	HIRE_DATE = '04/04/30';

SELECT	EMP_NAME
FROM	EMPLOYEE
WHERE	HIRE_DATE = '90/04/01';
----------------------------------------------------------
SELECT	TO_DATE('20100101', 'YYYYMMDD') FROM DUAL;
SELECT	TO_DATE('20100101', 'YYY, MON') FROM DUAL;

SELECT	TO_CHAR(TO_DATE('20100101', 'YYYYMMDD'), 'YYYY, MON')
FROM	DUAL;

SELECT	TO_DATE('041030 143000', 'YYMMDD HH24MISS') FROM DUAL;
SELECT	TO_CHAR(TO_DATE('980630', 'YYMMDD'), 'YYYY.MM.DD') FROM DUAL;	-- 2098
SELECT	TO_CHAR(TO_DATE('980630', 'RRMMDD'), 'YYYY.MM.DD') FROM DUAL;	-- 1998

SELECT	EMP_NAME,
		EMP_NO,
		SUBSTR(EMP_NO, 1,6) AS 앞부분,
		SUBSTR(EMP_NO, 8)	AS 뒷부분,
		TO_NUMBER(SUBSTR(EMP_NO,1,6)) + TO_NUMBER(SUBSTR(EMP_NO,8)) AS 결과
FROM	EMPLOYEE
WHERE	EMP_ID = '101';
----------------------------------------------------------
SELECT	RMP_NAME, SALARY, NVL(BONUS_PCT, 0)
FROM	EMPLOYEE
WHERE	SALARY > 3500000;

SELECT	EMP_NAME,
		(SALARY*12)+((SALARY*12)*BONUS_PCT)
FROM	EMPLOYEE
WHERE	SALARY > 3500000

SELECT	EMP_NAME,
		(SALARY*12)+((SALARY*12)*NVL(BONUS_PCT, 0))
FROM	EMPLOYEE
WHERE	SALARY > 3500000

SELECT * FROM EMPLOYEE;

SELECT	EMP_NAME,
		EMP_NO,
		SALARY,
		DECODE(SUBSTR(EMP_NO, 8, 1),
			1, '남자',
			3, '남자',
			'여자') AS 성별
FROM	EMPLOYEE
WHERE	JOB_ID = 'J7';

SELECT	EMP_NAME,
		EMP_NO,
		SALARY,
		DECODE(SUBSTR(EMP_NO, 8, 1),	-- 필터링이 아닌 논리적 제한을 주는것
			'2', '여자',
			'1', '남자',
			'3', '남자',
			'4', '여자') AS 성별
FROM	EMPLOYEE
WHERE	SUBSTR(EMP_NO, 8, 1) = '2'
OR		SUBSTR(EMP_NO, 8, 1) = '4';

SELECT	EMP_ID,
		EMP_NAME,
		MGR_ID,
		DECODE(MGR_ID, NULL, '직원', 
				'관리자') AS 직원구분
FROM	EMPLOYEE
WHERE	JOB_ID = 'J4';

SELECT	EMP_ID,
		EMP_NAME,
		MGR_ID,
		NVL2(MGR_ID,'직원', '관리자') AS 직원구분
FROM	EMPLOYEE
WHERE	JOB_ID = 'J4';

SELECT	EMP_NAME AS 이름,
		JOB_ID AS 직급,
		SALARY AS 급여,
		DECODE(JOB_ID, 'J7', SALARY * 1.2, 'J6', SALARY*1.15, 'J5', SALARY * 1.05, SALARY) AS 인상급여
FROM	EMPLOYEE;

SELECT	EMP_NAME AS 이름,
		JOB_ID AS 직급,
		SALARY AS 급여,
		CASE JOB_ID 
			WHEN 'J7' THEN SALARY * 1.2
			WHEN 'J6' THEN SALARY * 1.15
			WHEN 'J5' THEN SALARY * 1.05
			ELSE SALARY
			END AS 인상급여
FROM 	EMPLOYEE;

SELECT	EMP_NAME AS 이름,
		JOB_ID AS 직급,
		SALARY AS 급여,
		CASE WHEN JOB_ID = 'J7' THEN SALARY * 1.2
			WHEN JOB_ID = 'J6' THEN SALARY * 1.15
			WHEN JOB_ID = 'J5' THEN SALARY * 1.05
			ELSE SALARY
			END AS 인상급여
FROM 	EMPLOYEE;

--직원들의 급여등급 확인 300이하 초급 400이하 중급 400 이상 고급
-- 이름 급여 급여등급 출력

SELECT	EMP_NAME AS 이름,
		SALARY AS 급여,
		CASE WHEN SALARY <= '3000000' THEN '초급'
			WHEN SALARY <= '4000000' THEN '중급'
			ELSE '고급'
		END AS 급여등급
FROM	EMPLOYEE;


-- 사원 테이블에서 사원의 이름, 메일, 메일 아이디만 조회
SELECT	EMP_NAME AS 이름,
		EMAIL AS 메일,
		SUBSTR(EMAIL, 1, INSTR(EMAIL, '@')-1) AS 메일아이디
FROM	EMPLOYEE;

----------------------------------------------------------
----------------------------------------------------------
SELECT	SUM(SALARY)
FROM	EMPLOYEE;

SELECT	DEPT_ID AS 부서
		ROUND(AVG(SALARY), -4) AS 평균급여
FROM	EMPLOYEE
GROUP BY 	DEPT_ID
ORDER BY 1;

SELECT DECODE(SUBSTR(EMP_NO, 8, 1),
			'1', '남', '3', '남', '여') AS 성별,
		ROUND(AVG(SALARY), -4) AS 평균급여
FROM	EMPLOYEE
GROUP BY DECODE(SUBSTR(EMP_NO, 8, 1), '1', '남', '3', '남', '여') -- 기준으로 하위그룹을 만드는것
ORDER BY 2;

SELECT	EMP_NAME, DEPT_ID, COUNT(*)
FROM	EMPLOYEE
GROUP BY	ROLLUP(EMP_NAME, DEPT_ID);

SELECT * FROM TB_GRADE;


SELECT	DEPT_ID,
		SUM(SALARY)
FROM	EMPLOYEE
GROUP BY	DEPT_ID
HAVING		SUM(SALARY) = ( SELECT	MAX(SUM(SALARY))
							FROM	EMPLOYEE
							GROUP BY	DEPT_ID);


--------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------
SELECT * FROM SAL_GRADE;
SELECT * FROM DEPARTMENT;
--------------------------------------------------------------------------------------------
SELECT	EMP_NAME, DEPT_NAME			-- 오라클 스타일
FROM	EMPLOYEE E,
		DEPARTMENT D
WHERE	E.DEPT_ID = D.DEPT_ID(+); -- (+)가 붙은 반대쪽 테이블의 모든것을 출력하는 것 <아우터조인>

SELECT	EMP_NAME, DEPT_NAME			-- ANSI 표준
FROM	EMPLOYEE E
FULL JOIN	DEPARTMENT D USING(DEPT_ID);	-- 공유하는 키의 칼럼명이 같은경우 USING
--------------------------------------------------------------------------------------------
SELECT	EMP_NAME,
		SALARY,
		SLEVEL
FROM	EMPLOYEE E,
		SAL_GRADE S
WHERE	E.SALARY BETWEEN S.LOWEST AND S.HIGHEST;

SELECT	EMP_NAME,
		SALARY,
		SLEVEL
FROM	EMPLOYEE E
JOIN	SAL_GRADE S ON(E.SALARY BETWEEN S.LOWEST AND S.HIGHEST);
--------------------------------------------------------------------------------------------
SELECT	DEPT_NAME,
		LOC_DESCRIBE
FROM	DEPARTMENT
JOIN	LOCATION ON (LOC_ID = LOCATION_ID); -- 키를 공유하지만, 이름이 다른 경우 ON사용
		
--------------------------------------------------------------------------------------------
SELECT	E.EMP_NAME AS 직원,
		M.EMP_NAME AS 관리자
FROM	EMPLOYEE E
JOIN	EMPLOYEE M ON (E.MGR_ID = M.EMP_ID)	-- 관리자가 없는 사원은 누락됨
ORDER BY 1;

SELECT	E.EMP_NAME AS 직원,
		M.EMP_NAME AS 관리자
FROM	EMPLOYEE E
LEFT JOIN	EMPLOYEE M ON (E.MGR_ID = M.EMP_ID)	-- 관리자가 없어도 출력
ORDER BY 1;

SELECT	E.EMP_NAME AS 직원,
		M.EMP_NAME AS 관리자2,
		S.EMP_NAME AS 임원
FROM	EMPLOYEE E
JOIN	EMPLOYEE M ON (E.MGR_ID = M.EMP_ID)		-- 늘어난 테이블 만큼 조인하면 된다
JOIN	EMPLOYEE S ON (M.MGR_ID = S.EMP_ID)		-- 관리자의 관리자를 출력
ORDER BY 1;

--------------------------------------------------------------------------------------------
SELECT	E.EMP_NAME,
		E.SALARY,
		J.JOB_TITLE,
		D.DEPT_NAME,
		S.SLEVEL,
		L.LOC_DESCRIBE,
		C.COUNTRY_NAME
FROM	EMPLOYEE E
JOIN	JOB J USING (JOB_ID)
JOIN	DEPARTMENT D USING (DEPT_ID)
JOIN	SAL_GRADE S ON (E.SALARY BETWEEN S.LOWEST AND S.HIGHEST)
JOIN	LOCATION L ON (D.LOC_ID = L.LOCATION_ID)
JOIN	COUNTRY C USING (COUNTRY_ID)
WHERE	JOB_TITLE = '대리'
AND 	LOC_DESCRIBE LIKE '아시아%';

--SET------------------------------------------------------------------------------------------
SELECT	EMP_ID,
		ROLE_NAME
FROM	EMPLOYEE_ROLE
MINUS
SELECT	EMP_ID,
		ROLE_NAME
FROM	ROLE_HISTORY;

SELECT	EMP_ID,
		ROLE_NAME
FROM	EMPLOYEE_ROLE
UNION
SELECT	EMP_ID,
		ROLE_NAME
FROM	ROLE_HISTORY;

SELECT	EMP_ID,
		ROLE_NAME
FROM	EMPLOYEE_ROLE
UNION ALL
SELECT	EMP_ID,
		ROLE_NAME
FROM	ROLE_HISTORY;

SELECT	EMP_ID,
		ROLE_NAME
FROM	EMPLOYEE_ROLE
INTERSECT
SELECT	EMP_ID,
		ROLE_NAME
FROM	ROLE_HISTORY;

SELECT	EMP_NAME,
		JOB_TITLE 직급
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	JOB_TITLE IN ('대리', '사원')
ORDER BY 2,1;

SELECT	EMP_NAME, '사원' 직급		-- 위 쿼리를 UNION화 한것
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	JOB_TITLE = '사원'
UNION
SELECT	EMP_NAME, '대리'
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	JOB_TITLE = '대리'
ORDER BY 2,1;


----서브쿼리----------------------------------------------------------------------------------------
SELECT	EMP_NAME,
		JOB_ID,
		SALARY
FROM	EMPLOYEE
WHERE	JOB_ID = (  SELECT JOB_ID
					FROM	EMPLOYEE
					WHERE	EMP_NAME = '나승원')
AND		SALARY > (  SELECT	SALARY
					FROM EMPLOYEE
					WHERE	EMP_NAME = '나승원');

SELECT	EMP_NAME,
		JOB_ID,
		SALARY
FROM	EMPLOYEE
WHERE	SALARY = (  SELECT	MIN(SALARY)
					FROM 	EMPLOYEE);

SELECT		DEPT_NAME,
			SUM(SALARY),
FROM		EMPLOYEE
LEFT JOIN	DEPATMENT USING (DEPT_ID)
GROUP BY	DEPT_ID, DEPT_NAME
HAVING		SUM(SALARY) = ( SELECT	 MAX(SUM(SALARY))
							FROM	 EMPLOYEE
							GROUP BY DEPT_ID);
							
SELECT	EMP_ID,
		EMP_NAME
FROM	EMPLOYEE
WHERE	SALARY = (  SELECT	MIN(SALARY)
					FROM	EMPLOYEE
					GROUP BY DEPT_ID);

SELECT	EMP_ID,
		EMP_NAME
FROM	EMPLOYEE
WHERE	(SALARY, DEPT_ID) IN (  SELECT	MIN(SALARY),
										DEPT_ID			-- 최소급여만 받으면 안되고, 누군지도 같이 보내야한다
								FROM	EMPLOYEE
								GROUP BY DEPT_ID);		-- 다중: 괄호와 IN
--------------------------------------------------------------------------------------------
SELECT	EMP_ID,
		EMP_NAME,
		'관리자' AS 구분
FROM	EMPLOYEE
WHERE	EMP_ID IN (SELECT MGR_ID FROM EMPLOYEE)
UNION
SELECT	EMP_ID,
		EMP_NAME,
		'직원'
FROM	EMPLOYEE
WHERE	EMP_ID NOT IN ( SELECT MGR_ID FROM   EMPLOYEE
						WHERE  MGR_ID IS NOT NULL)
ORDER BY 3,1;

--ANY, ALL------------------------------------------------------------------------------------------
SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	JOB_TITLE = '대리'
AND		SALARY > ANY
					(   SELECT 	SALARY
						FROM 	EMPLOYEE
						JOIN	JOB USING (JOB_ID)
						WHERE	JOB_TITLE = '과장');

SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	JOB_TITLE = '대리'
AND		SALARY < ANY
					(   SELECT 	SALARY
						FROM 	EMPLOYEE
						JOIN	JOB USING (JOB_ID)
						WHERE	JOB_TITLE = '과장');

SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	JOB_TITLE = '대리'
AND		SALARY > ALL
					(   SELECT 	SALARY
						FROM 	EMPLOYEE
						JOIN	JOB USING (JOB_ID)
						WHERE	JOB_TITLE = '과장');
						
SELECT	EMP_NAME,
		SALARY
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	JOB_TITLE = '대리'
AND		SALARY < ALL
					(   SELECT 	SALARY
						FROM 	EMPLOYEE
						JOIN	JOB USING (JOB_ID)
						WHERE	JOB_TITLE = '과장');
--------------------------------------------------------------------------------------------
--- 직급별 평균급여를 조회하라
SELECT	EMP_NAME,
		JOB_TITLE,
		SALARY
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	(JOB_ID, SALARY) IN (   SELECT	JOB_ID,
										TRUNC(AVG(SALARY), -5)
								FROM	EMPLOYEE
								GROUP BY JOB_ID);

								
SELECT	E.EMP_NAME,
		J.JOB_TITLE,
		SALARY
FROM	(	SELECT	JOB_ID,
					TRUNC(AVG(SALARY), -5) JOBAVG
			FROM	EMPLOYEE
			GROUP BY JOB_ID) V
JOIN	EMPLOYEE E ON (E.SALARY = V.JOBAVG AND E.JOB_ID = V.JOB_ID)
JOIN	JOB J ON (J.JOB_ID = E.JOB_ID);


--------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------

--------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------

CREATE TABLE INTERN_USER_TBL(
	ID		VARCHAR2(50) PRIMARY KEY,
	PWD		VARCHAR2(20) NOT NULL,
	NAME	VARCHAR2(50) NOT NULL,
	POINT	NUMBER		 CHECK( POINT > 1000),
	DEPT	VARCHAR2(50) CHECK( DEPT IN('AI', 'INSA', 'SB', 'EMART'))
);

INSERT INTO INTERN_USER_TBL
VALUES ('jslim', 'jslim', '임정섭', 2000, 'SB');

SELECT * FROM INTERN_USER_TBL;

INSERT INTO INTERN_USER_TBL
VALUES ('sy', 'sy', '최시영', 2000, 'AI');



