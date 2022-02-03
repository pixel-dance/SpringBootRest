INSERT INTO PERSON(name, age, email) VALUES ('Adam', 35, 'Adam@mail.ru');
INSERT INTO PERSON(name, age, email) VALUES ('Pol', 30, 'Pol@mail.ru');
INSERT INTO PERSON(name, age, email) VALUES ('Bob', 31, 'Bob@mail.ru');

INSERT INTO SCHEDULE(timetable, date_work) VALUES (1, '2021-11-15');
INSERT INTO SCHEDULE(timetable, date_work) VALUES (2, '2021-11-15');
INSERT INTO SCHEDULE(timetable, date_work) VALUES (3, '2021-11-15');

INSERT INTO PERSON_OF_SCHEDULE(schedule, person) VALUES (2, 1);
INSERT INTO PERSON_OF_SCHEDULE(schedule, person) VALUES (3, 2);
INSERT INTO PERSON_OF_SCHEDULE(schedule, person) VALUES (1, 3);
