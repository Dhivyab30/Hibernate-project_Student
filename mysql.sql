create database student_db;
use student_db;
create table student(id int primary key auto_increment, name varchar(50), age int, grade varchar(10));
select * from student;