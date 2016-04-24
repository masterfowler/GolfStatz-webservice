
CREATE SCHEMA golfstatz
  AUTHORIZATION postgres;


CREATE TABLE golfstatz.course
(
  id uuid NOT NULL,
  name text,
  par integer,
  CONSTRAINT pk_course PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE golfstatz.course
  OWNER TO postgres;