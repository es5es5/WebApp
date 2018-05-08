create table jins_member(
	jins_name varchar2(5 char) not null,
	jins_pw varchar2(20 char) not null,
	jins_pw varchar2(20 char) not null
)

create table ihwac2_sns(
	is_no number(5) primary key,			-- 글 번호
	is_owner varchar2(10 char) not null,	-- 글쓴이 id
	is_txt varchar2(350 char) not null,
	is_date date not null,
	is_color number(1) not null
);