create database java_demo;
use java_demo;
create table Users(username varchar(20), password varchar(20), fullname varchar(20), email varchar(20));
select * from Users;


-- it will delete the columns of Table Users and not the entire structure
truncate table Users;
-- entire table will be deleted and needs to be created again in order to insert values.
drop table Users;