
SELECT USER_ID, USER_NAME, REG_DT, GENDER, AGE, PASSWORD
FROM member



-- C->INSERT
-- INSERT INTO [테이블명] (컬럼명..) VALUES (값들);

INSERT INTO member 
(USER_ID, USER_NAME, REG_DT, GENDER, AGE, PASSWORD)
VALUES
('test44', '박규태', NOW(), 'M', 30, '4444');


-- U:UPDATE
/*
UPDATE [테이블명]
SET
	컬럼명 = 값,
	컬럼명2 = 값2
WHERE 조건
;
*/

UPDATE member
SET
	AGE = 24
WHERE USER_ID = 'test2'
;

-- D:DELETE
/*
DELETE FROM [테이블명] 
WHERE 조건;
*/

DELETE FROM member
WHERE USER_ID = 'test44'
;
