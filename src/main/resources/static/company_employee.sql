ALTER TABLE company.employee ADD PRIMARY KEY (id);
ALTER TABLE employee MODIFY COLUMN id INT auto_increment;
ALTER TABLE employee AUTO_INCREMENT = 112;
create table employee
(
	id int not null auto_increment
		primary key,
	name varchar(100) null,
	salary int(10) null
);


INSERT INTO company.employee (id, name, salary) VALUES (102, 'Amit', 50000);
INSERT INTO company.employee (id, name, salary) VALUES (101, 'Deepak', 45000);
INSERT INTO company.employee (id, name, salary) VALUES (103, 'Amber', 40000);
INSERT INTO company.employee (id, name, salary) VALUES (105, 'emp2', 20000);
INSERT INTO company.employee (id, name, salary) VALUES (106, 'emp1', 2000);
INSERT INTO company.employee (id, name, salary) VALUES (107, 'emp3', 1000);
INSERT INTO company.employee (id, name, salary) VALUES (108, 'emp4', 10000);
INSERT INTO company.employee (id, name, salary) VALUES (109, 'emp5', 20000);