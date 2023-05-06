INSERT INTO Roles (id, name) VALUES (2, 'ROLE_USER');
insert into roles (id, name) VALUES (1,'ROLE_RH');
insert into user (id, email, name, password, prenom, username) VALUES (3,'test@test.com','test','12345','test' ,'test');
insert into user (id, email, name, password, prenom, username) VALUES (2,'user@user.com','user','12345','user' ,'user');


insert into  user_roles (user_id, roles_id) VALUES (2,2);
insert into  user_roles (user_id, roles_id) VALUES (3,2);
insert into  user_roles (user_id, roles_id) VALUES (1,1);



