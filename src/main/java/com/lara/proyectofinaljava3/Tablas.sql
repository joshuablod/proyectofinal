create table Empleado (idEmpleado integer primary key auto_increment,
                        nombre varchar(50),
                        edad integer,
                        puesto varchar(30),
                        sueldo float);

create table Nomina (idNomina integer primary key auto_increment,
                        idEmpleado integer,
                        salario float,
                        foreign key (idEmpleado) references Empleado (idEmpleado));

create table Asistencia (idAsistencia integer primary key auto_increment,
                        idEmpleado integer,
                        fecha date,
                        asiste varchar(5),
                        foreign key (idEmpleado) references Empleado (idEmpleado));

select * from Empleado;