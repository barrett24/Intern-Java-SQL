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

SELECT * FROM EMPLOYEE;

SELECT	EMAIL,
		INSTR(EMAIL, 'c', -1, 2) AS 위치
FROM EMPLOYEE;

SELECT	EMAIL,
		INSTR(EMAIL, 'c', INSTR(EMAIL, '.')-1) AS 위치
FROM	EMPLOYEE;

SELECT	EMAIL AS 원본데이터,
		LENGTH(EMAIL) AS 원본길이,
		RPAD(EMAIL, 20, '.') AS 적용결과,
		LENGTH(LPAD(EMAIL, 20, '.')) AS 결과길이
FROM	EMPLOYEE;

SELECT LTRIM('...tech') FROM DUAL;
SELECT LTRIM('   tech', '.') FROM DUAL;
SELECT LTRIM('000123', '123') FROM DUAL;
SELECT LTRIM('123123Tech123', '123') FROM DUAL;

SELECT TRIM('   tech   ') FROM DUAL;
SELECT TRIM('a' FROM 'aatechaaa') FROM DUAL;
SELECT TRIM(LEADING '0' FROM '00123') FROM DUAL;
SELECT TRIM(TRAILING '1' FROM 'Tech1') FROM DUAL;
SELECT TRIM(BOTH '1' FROM '1Tech111') FROM DUAL;

SELECT SUBSTR('THIS IS A TEST', 6, 2) FROM DUAL;
SELECT SUBSTR('THIS IS A TEST', 6) FROM DUAL;
SELECT SUBSTR('THIS IS A TEST', -3, 3) FROM DUAL;

SELECT ROUND(125.315, 1) FROM DUAL;
SELECT ROUND(125.315, -1) FROM DUAL;

SELECT TRUNC(125.315, 1) FROM DUAL;

SELECT	EMP_NAME,
		HIRE_DATE,
		ADD_MONTHS(HIRE_DATE, 240) -- 2년
FROM	EMPLOYEE;

SELECT	EMP_NAME, 
		HIRE_DATE, 
		DEPT_ID, 
		ROUND(MONTHS_BETWEEN(SYSDATE, HIRE_DATE) / 12) AS 근속년수,
		JOB_ID AS 직급,
		DEPT_ID AS 부서
FROM	EMPLOYEE
WHERE	MONTHS_BETWEEN(SYSDATE, HIRE_DATE) >= 240;




