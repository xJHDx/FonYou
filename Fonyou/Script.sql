DROP SCHEMA IF EXISTS `mydb` ;

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

DROP TABLE IF EXISTS `mydb`.`Question` ;
CREATE TABLE Question (
	id BIGINT auto_increment NOT NULL,
	title  VARCHAR(50) NOT NULL,
	answers VARCHAR(50) NOT NULL,
	PRIMARY KEY (`id`)
)

DROP TABLE IF EXISTS `mydb`.`student` ;
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`(
	`id` bigint(20) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL,
	`years` bigint(20) NOT NULL,
	`city` varchar(50) NOT NULL,
	`cityDate` DATE NOT NULL,	
	PRIMARY KEY (`id`)
)

ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;