CREATE SEQUENCE speaker_sequence start with 1 increment by 1;
INSERT INTO Speaker(id, email, name) VALUES (nextval('speaker_sequence'), 'leo@email.com', 'Leonardo Almeida');
INSERT INTO Speaker(id, email, name) VALUES (nextval('speaker_sequence'), 'elder@email.com', 'Elder Moraes');

CREATE SEQUENCE formulario_sequence start with 1 increment by 1;
INSERT INTO Formulario(id, title, resumeTalk, authorName, authorEmail, speakerId) VALUES (nextval('formulario_sequence'), 'OpenShift Sandbox', 'Um resumo', 'Leonardo Almeida', 'leo@email.com', 1);
INSERT INTO Formulario(id, title, resumeTalk, authorName, authorEmail, speakerId) VALUES (nextval('formulario_sequence'), 'Java Threads', 'Um resumo', 'Elder Moraes', 'elder@email.com', 2);