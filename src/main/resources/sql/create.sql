DROP DATABASE movie_catalog;

CREATE DATABASE movie_catalog
WITH OWNER = demo
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;

DROP TABLE IF EXISTS demo_users;
DROP TABLE IF EXISTS demo_movies;
DROP TABLE IF EXISTS demo_actors;


CREATE TABLE IF NOT EXISTS demo_users (
  id SERIAL UNIQUE NOT NULL,
  user_name VARCHAR(100),
  user_email VARCHAR(100) UNIQUE,
  user_password VARCHAR(70),
  user_first_name VARCHAR(100),
  user_last_name VARCHAR(100),
  PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS demo_movies (
  id SERIAL UNIQUE NOT NULL,
  movie_title VARCHAR(100),
  movie_release_date DATE,
  movie_rating REAL,
  movie_imdb_link VARCHAR(100),
  PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS demo_actors (
  id SERIAL UNIQUE NOT NULL,
  actor_name VARCHAR(100),
  actor_dob DATE,
  actor_bio TEXT,
  PRIMARY KEY(id)
);


CREATE TABLE IF NOT EXISTS dream_movies_actors (
  id SERIAL UNIQUE NOT NULL,
  id_movie INTEGER REFERENCES demo_movies(id),
  id_actor INTEGER REFERENCES demo_actors(id),
  PRIMARY KEY(id)
);

