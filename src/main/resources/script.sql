drop table if exists `Users`;
drop table if exists `Posts`;


-- CREATE TABLE `Book` (
--                         `book_id`	BigInt	NOT NULL,
--                         `book_title`	VARCHAR(30)	NULL
-- );

CREATE TABLE `Users` (
                        `users_id`	BIGINT	NOT NULL PRIMARY KEY ,
                        `users_email`	VARCHAR(20)	NULL unique,
                        `users_password`	VARCHAR(20)	NULL,
                        `users_name`	VARCHAR(30)	NULL
);
--
-- CREATE TABLE `Review` (
--                           `book_id`	BigInt	NOT NULL,
--                           `user_id`	BIGINT	NOT NULL,
--                           `review_comment`	VARCHAR(100)	NULL
-- );

CREATE TABLE `Posts` (
                        `posts_id`	BIGINT	NOT NULL PRIMARY KEY ,
                        `posts_book_title`	VARCHAR(30)	NULL,
                        `posts_content`	VARCHAR(1000)	NULL,
                        `posts_created_at`	DATETIME	NULL,
                        `users_id`	BIGINT	NOT NULL
);