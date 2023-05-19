INSERT INTO  Cliente (id, Nombre, Apellido, Telefono, Email, createat) values ('1','Nicolas','Lara','98009999','nicolas_lara10@outlook.es','02-11-2021');
INSERT INTO  Cliente (id, Nombre, Apellido, Telefono, Email, createat) values ('2','Marco','God','34444444','marco@hotmail.com','02-11-2021');
INSERT INTO  Cliente (id, Nombre, Apellido, Telefono, Email, createat) values ('3','Roberto','Ashe','444444444','roberto@outlook.es','02-11-2021');

INSERT INTO Usuario (id, username, password, activada, nombre, apellido, email) VALUES ('1','nicolas','$2a$10$N8P5hwF5sDP0RQlPASTxVu0FAdNCOkA2bPxOK6t19FwIvUWxOZozW',1, 'Nicolas', 'Lara', 'nicolas_lara10@outlook.es');
INSERT INTO Usuario (id, username, password, activada, nombre, apellido, email) VALUES ('2','admin','$2a$10$/YfiZ6TcdeXTMgd1G40o2u07DS8iwUh/7r30XkUdhqKNGCsgFtkVi',1, 'Fabricio', 'Copano', 'copano_lara10@outlook.es');

INSERT INTO Role (id, nombre) VALUES ('1','ROLE_USER');
INSERT INTO Role (id, nombre) VALUES ('2','ROLE_ADMIN');

INSERT INTO Usuario_Roles (usuario_id, roles_id) VALUES ('1','1');
INSERT INTO Usuario_Roles (usuario_id, roles_id) VALUES ('2','2');
INSERT INTO Usuario_Roles (usuario_id, roles_id) VALUES ('2','1');


INSERT INTO Productos (id, nombre, precio, create_at) VALUES ('1','Palta Hass',2000, '13-11-2021');
INSERT INTO Productos (id, nombre, precio, create_at) VALUES ('2','Tomate',2340, '13-11-2021');
INSERT INTO Productos (id, nombre, precio, create_at) VALUES ('3','Lechuga',1600, '13-11-2021');
INSERT INTO Productos (id, nombre, precio, create_at) VALUES ('4','Platano',4000, '13-11-2021');
INSERT INTO Productos (id, nombre, precio, create_at) VALUES ('5','Manzana',2030, '13-11-2021');


INSERT INTO Pedido (id, descripcion, observacion, cliente_id, create_at) VALUES ('1','Almacen Don Pepe', 'Especificacion del pedido', '1', '13-11-2021');
INSERT INTO Pedido_Items (id, kilogramos, pedido_id, producto_id) VALUES ('1', 1 ,'1','1');
INSERT INTO Pedido_Items (id, kilogramos, pedido_id, producto_id) VALUES ('2', 2 ,'1','4');
INSERT INTO Pedido_Items (id, kilogramos, pedido_id, producto_id) VALUES ('3', 1 ,'1','5');
INSERT INTO Pedido_Items (id, kilogramos, pedido_id, producto_id) VALUES ('4', 1 ,'1','3');

INSERT INTO Pedido (id, descripcion, observacion, cliente_id, create_at) VALUES ('2','Almacen Don Marcelo', 'del pedido', '1', '13-11-2021');
INSERT INTO Pedido_Items (id, kilogramos, pedido_id, producto_id) VALUES ('5', 3 ,'2','3');
