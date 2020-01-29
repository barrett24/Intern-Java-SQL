------------------------------------------------------------------------------
UPDATE	DEPARTMENT
SET		DEPT_NAME = '전략기획팀'
WHERE	DEPT_ID = '90';

SELECT * FROM DEPARTMENT;
SELECT * FROM EMPLOYEE;
------------------------------------------------------------------------------
UPDATE	EMPLOYEE
SET		(JOB_ID, SALARY) = (SELECT  JOB_ID, SALARY
							FROM	EMPLOYEE
							WHERE	EMP_NAME = '성해교')
WHERE	EMP_NAME = '심하균';
------------------------------------------------------------------------------
UPDATE	EMPLOYEE
SET		MARRIAGE = DEFAULT
WHERE	EMP_ID = '210';
------------------------------------------------------------------------------
UPDATE	EMPLOYEE
SET		BONUS_PCT = '0.3'
WHERE	DEPT_ID = ( SELECT	DEPT_ID
					FROM	DEPARTMENT
					WHERE	DEPT_NAME = '해외영업2팀')
------------------------------------------------------------------------------
UPDATE	EMPLOYEE
SET		DEPT_ID = '65'
WHERE	DEPT_ID IS NULL;
					

---INSERT---------------------------------------------------------------------------
INSERT INTO EMPLOYEE (EMP_ID, EMP_NO, EMP_NAME, PHONE, HIRE_DATE, JOB_ID, SALARY, BONUS_PCT, MARRIAGE)
VALUES ('880','860412-2377610', '한채연', '0193382662', '06/01/07', 'J7', 3000000, 0, 'N');
------------------------------------------------------------------------------
INSERT INTO EMPLOYEE (EMP_ID, EMP_NO, EMP_NAME, SALARY, MARRIAGE)
VALUES				('860', '810429-2165344', '선예진', DEFAULT, DEFAULT);
------------------------------------------------------------------------------
CREATE TABLE EMP
(EMP_ID CHAR(3),
 EMP_NAME VARCHAR2(20),
 DEPT_NAME VARCHAR2(20));

INSERT INTO EMP
( SELECT EMP_ID, EMP_NAME, DEPT_NAME
  FROM	 EMPLOYEE
  LEFT OUTER JOIN DEPARTMENT USING (DEPT_ID) );
  
SELECT * FROM EMP;
------------------------------------------------------------------------------
ALTER TABLE EMPLOYEE DROP CONSTRAINTS FK_MGRID;
ALTER TABLE EMPLOYEE ADD CONSTRAINTS FK_MGRID FOREGIN KEY (MGR_ID)
REFERENCES EMPLOYEE ON DELETE SET NULL;
DELETE FROM EMPLOYEE WHERE EMP_ID = '141';

SELECT * FROM EMPLOYEE;
------------------------------------------------------------------------------
ALTER TABLE EMPLOYEE
DISABLE CONSTRAINTS FK_MGRID;

SAVEPOINT S0;

INSERT INTO DEPARTMENT
VALUES ('40', '기획전략팀', 'A1');

SAVEPOINT S1;

UPDATE EMPLOYEE
SET DEPT_ID = '40'
WHERE DEPT_ID IS NULL;

SAVEPOINT S2;

DELETE FROM EMPLOYEE;

ROLLBACK TO S2;
SELECT COUNT(*)
FROM	EMPLOYEE;

SELECT	COUNT(*)
FROM	EMPLOYEE
WHERE	DEPT_ID = '40';

ROLLBACK TO S1;
SELECT COUNT(*)
FROM	DEPARTMENT
WHERE	DEPT_ID = '40';

SELECT COUNT(*)
FROM	EMPLOYEE
WHERE	DEPT_ID = '40';

ROLLBACK TO S0;
SELECT	COUNT(*)
FROM DEPARTMENT
WHERE	DEPT_ID = '40';
------------------------------------------------------------------------------
------------------------------------------------------------------------------
------------------------------------------------------------------------------

































