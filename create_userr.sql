CREATE TABLE customer(customer_id BIGSERIAL,customer_name varchar(50),identity_number varchar(50),customer_address varchar(50),cusromer_email varchar(50),customer_phone_number varchar(15));
 CREATE TABLE users((> user_id BIGSERIAL,password varchar(50),customer_id varchar(50));
CREATE TABLE city( city_id BIGSERIAL,city_name varchar(50),is_valid varchar(50));