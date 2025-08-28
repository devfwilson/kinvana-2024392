drop database if exists kinvana_db;
create database kinvana_db;
use kinvana_db;
 
create table Clientes(
	codigo_cliente integer auto_increment,
    nombre varchar (64),
    apellido varchar (64),
    telefono varchar (16),
    correo varchar (128),
    genero enum ('masculino','femenino','no'),
    edad integer,
    constraint pk_cliente primary key (codigo_cliente)
);
