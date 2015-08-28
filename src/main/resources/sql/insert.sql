
-- USERS
INSERT INTO demo_users(
        user_name, user_email, user_password, user_first_name, user_last_name)
VALUES ('user', 'user@domain.com', '12345', 'first-name', 'last-name');


-- MOVIES    
INSERT INTO demo_movies(
        movie_title, movie_release_date, movie_rating, movie_imdb_link)
VALUES ('Ant-Man', '07/17/2015', 7.8, 'http://www.imdb.com/title/tt0478970/');
INSERT INTO demo_movies(
        movie_title, movie_release_date, movie_rating, movie_imdb_link)
VALUES ('Avengers: Age of Ultron', '05/01/2015', 7.8, 'http://www.imdb.com/title/tt2395427/');
INSERT INTO demo_movies(
        movie_title, movie_release_date, movie_rating, movie_imdb_link)
VALUES ('The Diary of a Teenage Girl ', '08/07/2015', 7.0 , 'The Diary of a Teenage Girl ');
INSERT INTO demo_movies(
        movie_title, movie_release_date, movie_rating, movie_imdb_link)
VALUES ('13 Minutes', '04/09/2015', 7.2, 'http://www.imdb.com/title/tt1708135/');
INSERT INTO demo_movies(
        movie_title, movie_release_date, movie_rating, movie_imdb_link)
VALUES ('Ex Machina', '04/24/2015', 7.7, 'http://www.imdb.com/title/tt0470752/');

    
-- ACTORS
INSERT INTO demo_actors(
            actor_name, actor_dob, actor_bio)
    VALUES ('Rebecca Ferguson', '10/19/1983', 'Rebecca Ferguson grew up in the Vasastaden district in central Stockholm. Her mother, Rosemary, is British, and moved to Sweden from England at the age of 25. As a student, she attended the Adolf Fredrik&#39s Music School in Stockholm. She currently lives with her boyfriend and young child in the seaside town of Simrishamn, on the Swedish south coast');
INSERT INTO demo_actors(
            actor_name, actor_dob, actor_bio)
    VALUES ('Tom Hardy', '09/15/1977', 'With his breakthrough performance as Eames in Christopher Nolan&#39s science fiction thriller Inception (2010), English actor Tom Hardy has been brought to the attention of mainstream audiences worldwide. But the versatile actor has been steadily working on both stage and screen since his television debut in the mini-series Band of Brothers (2001).');
INSERT INTO demo_actors(
            actor_name, actor_dob, actor_bio)
    VALUES ('Jennifer Lawrence', '08/15/1990', 'Academy Award-winning actress Jennifer Lawrence is best known for playing Katniss Everdeen in The Hunger Games (2012), Tiffany Maxwell in Silver Linings Playbook (2012), and Rosalyn Rosenfeld in American Hustle (2013). Jennifer Shrader Lawrence was born on August 15, 1990 in Louisville, Kentucky, to Karen (Koch)');

    
-- MOVIES AND ACTORS RELATIONS    
INSERT INTO dream_movies_actors(
        id_movie, id_actor)
VALUES (1, 1);
INSERT INTO dream_movies_actors(
        id_movie, id_actor)
VALUES (2, 2);
INSERT INTO dream_movies_actors(
        id_movie, id_actor)
VALUES (3, 3);
INSERT INTO dream_movies_actors(
        id_movie, id_actor)
VALUES (4, 1);
