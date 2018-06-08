create table jins_member(
	name varchar2(10 char) not null,
	email varchar2(30 char) primary key not null,
	pw varchar2(30 char) not null
);
drop table jins_member cascade constraint purge;
select * from jins_member;
----------------------------------------------------
create table jins_album(
	album_no number(5) primary key,
	album_img varchar2(200 char) not null,
	album_date date not null,
	album_txt1 varchar2(300 char),
	album_txt2 varchar2(300 char)
);
create sequence jins_album_seq;
SELECT * FROM jins_album;
insert into jins_album values(jins_album_seq.nextval, '12.jpg', sysdate, 'text1', 'text2');
drop table jins_album cascade constraint purge;
----------------------------------------------------
select * from jins_member where email='jins@jinslover.com';