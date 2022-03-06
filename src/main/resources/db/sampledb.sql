create table test(
    testid number(20) PRIMARY KEY,
    testTitle varchar2(200),
    testContent varchar2(300),
    testName varchar2(50),
    testDate date DEFAULT sysdate,
    fileName varchar2(50)
);



insert into test(testid,testTitle,testContent,testName)
values(1,'testTitle','testContent','admin');

select * from test;

commit;