create table jins_member(
	name varchar2(10 char) not null,
	email varchar2(30 char) primary key not null,
	pw varchar2(30 char) not null
);
drop table jins_member cascade constraint purge;
select * from jins_member;
----------------------------------------------------
select * from jins_member where email='jins@jinslover.com';