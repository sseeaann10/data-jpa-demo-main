-- School

INSERT INTO school (name) VALUES ('Webtech');
INSERT INTO school (name) VALUES ('ESCEN');
INSERT INTO school (name) VALUES ('Atlas');

-- Student Group

INSERT INTO student_group (school_id, name) VALUES (1, '3A');

-- Student

INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Florian', 'florian@jetdev.fr', 'Lemaire', 23);
INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Sean', 'sean@next-u.fr', 'Sean', 21);
INSERT INTO student (student_group_id, first_name, mail, name, age) VALUES (1, 'Ivan', 'ivan@next-u.fr', 'Ivan', 20);


-- Professor
INSERT INTO professor (name, first_name, mail, subject, school_id) VALUES ('Jad', 'Jad', 'jad@next-u.fr', 'Python', 1);
INSERT INTO professor (name, first_name, mail, subject, school_id) VALUES ('Axel', 'Axel', 'axel@next-u.fr', 'Java', 2);
INSERT INTO professor (name, first_name, mail, subject, school_id) VALUES ('Marwan', 'Marwan', 'marwan@next-u.fr ', 'Java', 3);


-- Course
INSERT INTO course (name, duration, student_group_id, professor_id) VALUES ('comment', 60, 1, 1);
INSERT INTO course (name, duration, student_group_id, professor_id) VALUES ('bien', 90, 1, 2);
INSERT INTO course (name, duration, student_group_id, professor_id) VALUES ('coder', 45, 1, 3);