create schema quintoreto;
Use quintoreto;
create table proveedor(
	prov_id int primary key not null,
    prov_nom char(20) not null,
    prov_dir varchar(45) not null,
    prov_tel char(20) not null
);

create table Clientes(
	clien_alias char(20) primary key not null,
    clien_nom char(20) not null,
    clien_ape char(20) not null,
    clien_email varchar(45) not null,
    clien_cel char(10) not null,
    clien_contras int not null,
    clien_fnac date not null
);

create table fabricante(
	fabric_nom char(20) primary key not null
);

create table bicicletas(
	bici_fabric_nom char(20) not null,
	bici_precio int not null,
	bici_anno_constr int not null,
    foreign key (bici_fabric_nom) references fabricante (fabric_nom)
);

create table motocicleta(
	moto_fabric_nom char(20) not null,
	moto_precio int not null,
    moto_aut_bateria int not null,
    moto_prov_id int not null,
	foreign key (moto_fabric_nom) references fabricante (fabric_nom),
    foreign key (moto_prov_id) references proveedor (prov_id)
);

create table Intencion_Compra(
	comp_clien_alias char(20) not null,
	comp_fabric_nom char(20) not null,
	comp_fecha_hora timestamp,
    foreign key (comp_clien_alias) references clientes (clien_alias),
    foreign key (comp_fabric_nom) references fabricante (fabric_nom)
);