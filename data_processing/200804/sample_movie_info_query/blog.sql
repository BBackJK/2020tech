-- 회원
CREATE TABLE `MEMBER` (
	`USER_ID`   VARCHAR(50)  NOT NULL COMMENT '아이디', -- 아이디
	`USER_NAME` VARCHAR(50)  NULL     COMMENT '이름', -- 이름
	`PASSWORD`  VARCHAR(255) NULL     COMMENT '비밀번호', -- 비밀번호
	`REG_DT`    DATETIME     NULL     COMMENT '회원가입일', -- 회원가입일
	`AGE`       SMALLINT     NULL     COMMENT '나이', -- 나이
	`GENDER`    CHAR(1)      NULL     COMMENT '성별' -- 성별
)
COMMENT '회원';

-- 회원
ALTER TABLE `MEMBER`
	ADD CONSTRAINT `PK_MEMBER` -- 회원 기본키
		PRIMARY KEY (
			`USER_ID` -- 아이디
		);

-- 블로그
CREATE TABLE `BLOG_INFO` (
	`BLOG_ID` VARCHAR(50)   NOT NULL COMMENT '블로그ID', -- 블로그ID
	`USER_ID` VARCHAR(50)   NULL     COMMENT '블로그아이디', -- 블로그아이디
	`INTRO`   VARCHAR(2000) NULL     COMMENT '블로그소개', -- 블로그소개
	`REG_DT`  DATETIME      NULL     COMMENT '블로그개설일' -- 블로그개설일
)
COMMENT '블로그';

-- 블로그
ALTER TABLE `BLOG_INFO`
	ADD CONSTRAINT `PK_BLOG_INFO` -- 블로그 기본키
		PRIMARY KEY (
			`BLOG_ID` -- 블로그ID
		);

-- 블로그아티클
CREATE TABLE `BLOG_ARTICLE` (
	`ARTICLE_ID` INT          NOT NULL COMMENT '아티클ID', -- 아티클ID
	`BLOG_ID`    VARCHAR(50)  NULL     COMMENT '블로그ID', -- 블로그ID
	`TITLE`      VARCHAR(255) NULL     COMMENT '제목', -- 제목
	`CONTENTS`   TEXT         NULL     COMMENT '내용', -- 내용
	`REG_DT`     DATETIME     NULL     COMMENT '작성일', -- 작성일
	`HASH_TAG`   VARCHAR(255) NULL     COMMENT '해시태그' -- 해시태그
)
COMMENT '블로그아티클';

-- 블로그아티클
ALTER TABLE `BLOG_ARTICLE`
	ADD CONSTRAINT `PK_BLOG_ARTICLE` -- 블로그아티클 기본키
		PRIMARY KEY (
			`ARTICLE_ID` -- 아티클ID
		);

ALTER TABLE `BLOG_ARTICLE`
	MODIFY COLUMN `ARTICLE_ID` INT NOT NULL AUTO_INCREMENT COMMENT '아티클ID';

-- 블로그댓글
CREATE TABLE `BLOG_REPLY` (
	`REPLY_ID`   INT           NOT NULL COMMENT '댓글ID', -- 댓글ID
	`ARTICLE_ID` INT           NULL     COMMENT '아티클ID', -- 아티클ID
	`USER_NAME`  VARCHAR(50)   NULL     COMMENT '댓글작성자', -- 댓글작성자
	`COMMENTS`   VARCHAR(2000) NULL     COMMENT '댓글내용', -- 댓글내용
	`REG_DT`     DATETIME      NULL     COMMENT '댓글작성일' -- 댓글작성일
)
COMMENT '블로그댓글';

-- 블로그댓글
ALTER TABLE `BLOG_REPLY`
	ADD CONSTRAINT `PK_BLOG_REPLY` -- 블로그댓글 기본키
		PRIMARY KEY (
			`REPLY_ID` -- 댓글ID
		);

ALTER TABLE `BLOG_REPLY`
	MODIFY COLUMN `REPLY_ID` INT NOT NULL AUTO_INCREMENT COMMENT '댓글ID';

-- 블로그
ALTER TABLE `BLOG_INFO`
	ADD CONSTRAINT `FK_MEMBER_TO_BLOG_INFO` -- 회원 -> 블로그
		FOREIGN KEY (
			`USER_ID` -- 블로그아이디
		)
		REFERENCES `MEMBER` ( -- 회원
			`USER_ID` -- 아이디
		);

-- 블로그아티클
ALTER TABLE `BLOG_ARTICLE`
	ADD CONSTRAINT `FK_BLOG_INFO_TO_BLOG_ARTICLE` -- 블로그 -> 블로그아티클
		FOREIGN KEY (
			`BLOG_ID` -- 블로그ID
		)
		REFERENCES `BLOG_INFO` ( -- 블로그
			`BLOG_ID` -- 블로그ID
		);

-- 블로그댓글
ALTER TABLE `BLOG_REPLY`
	ADD CONSTRAINT `FK_BLOG_ARTICLE_TO_BLOG_REPLY` -- 블로그아티클 -> 블로그댓글
		FOREIGN KEY (
			`ARTICLE_ID` -- 아티클ID
		)
		REFERENCES `BLOG_ARTICLE` ( -- 블로그아티클
			`ARTICLE_ID` -- 아티클ID
		);