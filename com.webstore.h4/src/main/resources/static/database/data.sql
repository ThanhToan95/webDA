
create database h4;
use h4;
create table accounts(
username varchar(20) not null primary key,
password varchar(20),
fullname nvarchar(50),
email varchar(50),
phone int,
reset_password_token  varchar(50)
);
create table roles(
id varchar(10) not null primary key,
name varchar(20)
);
create table authorities(
id bigint not null primary key,
role_id varchar(10),FOREIGN KEY (role_id) REFERENCES roles(id),
username varchar(20),
 FOREIGN KEY (username) REFERENCES accounts(username)
);
create table categories(
id varchar(10) not null primary key,
name nvarchar(50),
status varchar(20)
);
create table products(
id varchar(10) not null primary key,
name nvarchar(50),
image varchar(50),
availiable boolean,
create_date datetime,
discount int,
price float,
manufaturer varchar(30),
description nvarchar(255),
category_id varchar(10),FOREIGN KEY (category_id) REFERENCES categories(id)
);
create table orders(
id bigint not null primary key,
create_date datetime,
address nvarchar(150),
phone int,
email varchar(50),
notes nvarchar(255),
username varchar(20),FOREIGN KEY (username) REFERENCES accounts(username)
);
create table order_details(
id bigint not null primary key,
price float,
quantity int,
cod boolean,
bank_transfer boolean,
status boolean,
username varchar(20),FOREIGN KEY (username) REFERENCES accounts(username),
product_id varchar(10),FOREIGN KEY (product_id) REFERENCES products(id),
order_id bigint,FOREIGN KEY (order_id) REFERENCES orders(id)
);
create table favorites(
id bigint not null primary key,
product_name nvarchar(50),
username varchar(20),FOREIGN KEY (username) REFERENCES accounts(username),
product_id varchar(10),FOREIGN KEY (product_id) REFERENCES products(id)
);
create table warranty(
id bigint not null primary key,
create_date datetime,
product_name nvarchar(50),
description nvarchar(255),
status boolean,
username varchar(20),FOREIGN KEY (username) REFERENCES accounts(username),
product_id varchar(10),FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO accounts VALUES ("toan","12345678","Văng thanh toàn","vangthanhtoan1995@gmail.com","0374949491",null);
INSERT INTO accounts VALUES ("tuan","12345678","Trần văn tuấn","tuan@gmail.com","0374949491",null);
INSERT INTO accounts VALUES ("tu","12345678","Trần văn tu","tu@gmail.com","0374949491",null);
INSERT INTO roles VALUES ("1","Admin");
INSERT INTO roles VALUES ("2","Director");
INSERT INTO roles VALUES ("3","User");
INSERT INTO authorities VALUES ("01","1","toan");
INSERT INTO authorities VALUES ("02","2","tu");
INSERT INTO authorities VALUES ("03","3","tuan");
INSERT INTO categories VALUES ("001","Điện thoại",null);
INSERT INTO categories VALUES ("002","Laptop",null);
INSERT INTO categories VALUES ("003","Tablet",null);
INSERT INTO categories VALUES ("004","Âm thanh",null);
INSERT INTO categories VALUES ("005","Phụ kiện",null);
INSERT INTO categories VALUES ("006","Đồng hồ",null);
INSERT INTO products VALUES ("p1","Samsung Galaxy S21 Ultra 5G","sp1.png",true,null,"31","21300000","SamSung",null,"001");
INSERT INTO products VALUES ("p2","Samsung Galaxy S21 Plus 5G","sp2.png",true,null,"32","1750000","SamSung",null,"001");
INSERT INTO products VALUES ("p3","Tai nghe không dây JBL Live Pro+","sp3.png",true,null,"62","1690000","SamSung",null,"004");
INSERT INTO products VALUES ("p4","Sạc nhanh Anker Powerport III Nano 20W A2633","sp4.png",true,null,"28","285000","Apple",null,"005");
INSERT INTO products VALUES ("p5","iPhone 13 Pro Max 256GB I Chính hãng VN/A","sp5.png",true,null,"0","37300000","Apple",null,"001");
INSERT INTO products VALUES ("p6","Apple MacBook Pro 13 Touch Bar M1 256GB 2020","sp6.png",true,null,"0","34300000","Apple",null,"002");
INSERT INTO products VALUES ("p7","Apple Watch Series 7 41mm (GPS)","sp7.png",true,null,"0","17600000","Apple",null,"006");
INSERT INTO products VALUES ("p8","Xiaomi 11T","sp8.png",true,null,"4","10490000","Xiaomi",null,"001");
INSERT INTO products VALUES ("p9","Samsung Galaxy A04 (3GB/32GB)","sp9.png",true,null,"11","3800000","SamSung",null,"001");
INSERT INTO products VALUES ("p10","Samsung Galaxy Z Flip 4 5G (8GB/128GB)","sp10.png",true,null,"9","17000000","SamSung",null,"001");
INSERT INTO products VALUES ("p16","BULOVA MARINE STAR DIAMOND WATCH","sp16.jpg",true,null,"10","21000000","BULOVA",null,"006");
INSERT INTO products VALUES ("p17","SamSung WATCH 22 MM","sp17.jpg",true,null,"5","21000000","SamSung",null,"006");
INSERT INTO products VALUES ("p18","OMEGA SEAMASTER 39MM","sp18.jpg",true,null,"20","211000000","OMEGA",null,"006");
INSERT INTO products VALUES ("p19","OMEGA DE VILLE PRESTIGE WATCH 39.5MM","sp19.jpg",true,null,"15","81000000","OMEGA",null,"006");
INSERT INTO products VALUES ("p20","LONGINES MASTER WATCH 38.5MM","sp20.jpg",true,null,"22","76000000","LONGINES",null,"006");
