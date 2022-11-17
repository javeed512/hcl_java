
use travel;

create table PASSENGER
 (Passenger_name varchar(20), 
  Category               varchar(20),
   Gender                 varchar(20),
   Boarding_City      varchar(20),
   Destination_City   varchar(20),
  Distance                int,
  Bus_Type             varchar(20)
);


create table PRICE
(
             Bus_Type   varchar(20),
             Distance    int,
              Price      int
          );

insert into passenger values('Sejal','AC','F','Bengaluru','Chennai',350,'Sleeper');
insert into passenger values('Anmol','Non-AC','M','Mumbai','Hyderabad',700,'Sitting');
insert into passenger values('Pallavi','AC','F','panaji','Bengaluru',600,'Sleeper');
insert into passenger values('Khusboo','AC','F','Chennai','Mumbai',1500,'Sleeper');
insert into passenger values('Udit','Non-AC','M','Trivandrum','panaji',1000,'Sleeper');
insert into passenger values('Ankur','AC','M','Nagpur','Hyderabad',500,'Sitting');
insert into passenger values('Hemant','Non-AC','M','panaji','Mumbai',700,'Sleeper');
insert into passenger values('Manish','Non-AC','M','Hyderabad','Bengaluru',500,'Sitting');
insert into passenger values('Piyush','AC','M','Pune','Nagpur',700,'Sitting');

select * from passenger;

insert into price values('Sleeper',350,770);
insert into price values('Sleeper',500,1100);
insert into price values('Sleeper',600,1320);
insert into price values('Sleeper',700,1540);
insert into price values('Sleeper',1000,2200);
insert into price values('Sleeper',1200,2640);
insert into price values('Sleeper',350,434);
insert into price values('Sitting',500,620);
insert into price values('Sitting',500,620);
insert into price values('Sitting',600,744);
insert into price values('Sitting',700,868);
insert into price values('Sitting',1000,1240);
insert into price values('Sitting',1200,1488);
insert into price values('Sitting',1500,1860);

select * from price;