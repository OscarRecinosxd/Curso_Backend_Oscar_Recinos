/* Populate tables */
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Janie', 'Roe', 'janie.roe@gmail.com', '2017-08-21', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('John', 'Smith', 'john.smith@gmail.com', '2017-08-22', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Joe', 'Bloggs', 'joe.bloggs@gmail.com', '2017-08-23', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('John', 'Stiles', 'john.stiles@gmail.com', '2017-08-24', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Richard', 'Roe', 'stiles.roe@gmail.com', '2017-08-25', '');

/* Populate tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 400, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W320B', 800, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple iPod shuffle', 150000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook Z110', 600, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 250, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta Aro 26', 125, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica Comoda 5 Cajones', 300, NOW());

/* Creamos algunas facturas */
INSERT INTO facturas (username, email, direccion, cliente_id, create_at) VALUES('oRecinos125','oscarrecinos728@gmail.com','Colonia fatima', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (username, email, direccion, cliente_id, create_at) VALUES('Cader035','caderMaicol@gmail.com','Colonia fatima', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);