/*
CREATE DATABASE `secureprograming`;

CREATE TABLE `user`(
id int AUTO_INCREMENT NOT NULL,
name varchar(255) NOT NULL,
lastname varchar(255) NOT NULL,
email varchar(255) NOT NULL UNIQUE,
password varchar(255) NOT NULL,
repassword varchar(255) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE `admin`(
id int AUTO_INCREMENT NOT NULL,
name varchar(255) NOT NULL,
lastname varchar(255) NOT NULL,
email varchar(255) NOT NULL UNIQUE,
password varchar(255) NOT NULL,
repassword varchar(255) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO `admin`(`id`, `name`, `lastname`, `email`, `password`, `repassword`) VALUES (1, 'Dawid', 'Trojanowski', 'admin@gmail.com', 'c9bec8c464d5a762d8cefa81997ffe968f7ffb5c', 'c9bec8c464d5a762d8cefa81997ffe968f7ffb5c');

CREATE TABLE `movies`(
id int AUTO_INCREMENT NOT NULL,
title varchar(255) NOT NULL,
type varchar(255) NOT NULL,
length int NOT NULL,
rating int NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO `movies`(`id`, `title`, `type`, `length`, `rating`) 
VALUES (1, 'Flash', 'SciFi', '45', '10'), 
(2, 'I Am Number four', 'SciFi', '110', '10'),
(3, 'Real Steel', 'SciFi', '128', '8'),
(4, 'Inception', 'SciFi', '150', '9'),
(5, 'World War Z', 'SciFi', '119', '10'),
(6, 'Fast Five', 'Action', '130', '7'),
(7, 'The Gunger Games', 'Action', '142', '7'),
(8, 'Fast and Furious 6', 'Action', '131', '9'),
(9, '21 Jump Street', 'Action', '110', '10'),
(10, 'Lucy', 'Action', '90', '10'),
(11, 'Project X', 'Comedy', '87', '6'),
(12, 'Friends with Benefits', 'Comedy', '110', '8'),
(13, 'TED', 'Comedy', '106', '10'),
(14, 'The Wolf of Wall Street', 'Comedy', '180', '7'),
(15, 'Life as we know it', 'Comedy', '114', '8');

*/