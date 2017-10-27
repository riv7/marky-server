# grades
INSERT into Grade (name) VALUES ('Klasse 7a');
INSERT into Grade (name) VALUES ('Klasse 8b');
INSERT into Grade (name) VALUES ('Klasse 10a');
INSERT into Grade (name) VALUES ('Klasse 10c');

# category
INSERT into Category (name, color, sortingrank, faktor) VALUES ('schriftlich', 'danger', 'A', 6);
SET @category1ID = LAST_INSERT_ID();
INSERT into Category (name, color, sortingrank, faktor) VALUES ('test', 'warning', 'A', 6);
SET @category2ID = LAST_INSERT_ID();
INSERT into Category (name, color, sortingrank, faktor) VALUES ('mündlich', 'info', 'B', 7);
SET @category3ID = LAST_INSERT_ID();

# Subject
INSERT into Subject (name, scope) VALUES ('Mathe', '7a');
SET @subject1ID = LAST_INSERT_ID();
INSERT into Subject (name, scope) VALUES ('Physik', '8b');
SET @subject2ID = LAST_INSERT_ID();
INSERT into Subject (name, scope) VALUES ('Religion', '10');
SET @subject3ID = LAST_INSERT_ID();

# student
INSERT into Student (name, grade_id) SELECT 'Nico Rosberg', id FROM Grade where name = 'Klasse 7a';
SET @student1ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Lewis Hamilton', id FROM Grade where name = 'Klasse 7a';
SET @student2ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Sebastian Vettel', id FROM Grade where name = 'Klasse 7a';
SET @student3ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Kimi Räikkönen', id FROM Grade where name = 'Klasse 7a';
SET @student4ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Dani Ricciardo', id FROM Grade where name = 'Klasse 7a';
SET @student5ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Max Verstappen', id FROM Grade where name = 'Klasse 7a';
SET @student6ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Nico Hülkenberg', id FROM Grade where name = 'Klasse 7a';
SET @student7ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Joylon Palmer', id FROM Grade where name = 'Klasse 7a';
SET @student8ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Sergio Perez', id FROM Grade where name = 'Klasse 7a';
SET @student9ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Esteban Ocon', id FROM Grade where name = 'Klasse 7a';
SET @student10ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Fernando Alonso', id FROM Grade where name = 'Klasse 7a';
SET @student11ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Stoofel van Doorn', id FROM Grade where name = 'Klasse 7a';
SET @student12ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Felipe Massa', id FROM Grade where name = 'Klasse 8b';
SET @student13ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Lance Stroll', id FROM Grade where name = 'Klasse 8b';
SET @student14ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Pascal Wehrlein', id FROM Grade where name = 'Klasse 8b';
SET @student15ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Marcus Ericsson', id FROM Grade where name = 'Klasse 8b';
SET @student16ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Romain Grosjean', id FROM Grade where name = 'Klasse 10a';
SET @student17ID = LAST_INSERT_ID();
INSERT into Student (name, grade_id) SELECT 'Carlos Sainz Jr.', id FROM Grade where name = 'Klasse 10c';
SET @student18ID = LAST_INSERT_ID();

#Subject 2 Students
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student1ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student2ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student3ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student4ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student5ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student6ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student7ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student8ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student9ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student10ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student11ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student12ID, @subject1ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student13ID, @subject2ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student14ID, @subject2ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student15ID, @subject2ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student16ID, @subject2ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student17ID, @subject3ID);
INSERT INTO Student_Subject (students_id, subjects_id) VALUES (@student18ID, @subject3ID);

#test
INSERT INTO Test (name, written, category_id, subject_id) VALUES ('Mündlich', '2017-01-01 00:00:00', @category3ID, @subject1ID);
SET @test3ID = LAST_INSERT_ID();
INSERT INTO Test (name, written, category_id, subject_id) VALUES ('KA2', '2016-08-01 00:00:00', @category1ID, @subject1ID);
SET @test2ID = LAST_INSERT_ID();
INSERT INTO Test (name, written, category_id, subject_id) VALUES ('KA1', '2016-01-01 00:00:00', @category1ID, @subject1ID);
SET @test1ID = LAST_INSERT_ID();
INSERT INTO Test (name, written, category_id, subject_id) VALUES ('KA3', '2017-07-07 00:00:00', @category1ID, @subject1ID);
SET @test4ID = LAST_INSERT_ID();
INSERT INTO Test (name, written, category_id, subject_id) VALUES ('Mündl.', '2017-05-05 00:00:00', @category3ID, @subject2ID);
SET @test5ID = LAST_INSERT_ID();
INSERT INTO Test (name, written, category_id, subject_id) VALUES ('KA1', '2017-07-05 00:00:00', @category1ID, @subject2ID);
SET @test6ID = LAST_INSERT_ID();
INSERT INTO Test (name, written, category_id, subject_id) VALUES ('Mündl.', '2017-05-05 00:00:00', @category2ID, @subject3ID);
SET @test7ID = LAST_INSERT_ID();

#marks
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.0, @student1ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (1.5, @student2ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.0, @student3ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.5, @student4ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.5, @student5ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (5.0, @student6ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (1.5, @student7ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.5, @student8ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.0, @student9ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (6.0, @student10ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (6.0, @student11ID, @test3ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (6.0, @student12ID, @test3ID);

INSERT INTO Mark (mark, student_id, test_id) VALUES (3.0, @student1ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.5, @student2ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.5, @student3ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.5, @student4ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.5, @student5ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (5.5, @student6ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (1.5, @student7ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (1.5, @student8ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (5.0, @student9ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.0, @student10ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.0, @student11ID, @test2ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.0, @student12ID, @test2ID);

INSERT INTO Mark (mark, student_id, test_id) VALUES (1.0, @student1ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.5, @student2ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (5.5, @student3ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (1.5, @student4ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.0, @student5ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.5, @student6ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (1.0, @student7ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (1.5, @student8ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.0, @student9ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.0, @student10ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.0, @student11ID, @test1ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.0, @student12ID, @test1ID);

INSERT INTO Mark (mark, student_id, test_id) VALUES (2.0, @student1ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.5, @student2ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.5, @student3ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (1.5, @student4ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.0, @student5ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.5, @student6ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.0, @student7ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.5, @student8ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.0, @student9ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.0, @student10ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.0, @student11ID, @test4ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.0, @student12ID, @test4ID);

INSERT INTO Mark (mark, student_id, test_id) VALUES (2.0, @student13ID, @test5ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.5, @student14ID, @test5ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.5, @student15ID, @test5ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.5, @student16ID, @test5ID);

INSERT INTO Mark (mark, student_id, test_id) VALUES (1.0, @student13ID, @test6ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (4.5, @student14ID, @test6ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (3.5, @student15ID, @test6ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (5.5, @student16ID, @test6ID);

INSERT INTO Mark (mark, student_id, test_id) VALUES (4.5, @student17ID, @test7ID);
INSERT INTO Mark (mark, student_id, test_id) VALUES (2.5, @student18ID, @test7ID);
