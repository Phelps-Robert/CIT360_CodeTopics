CREATE DATABASE hibernate_example -- Creates database.
 
use hibernate_example -- Selects database where table will be created.

-- Creates table
CREATE TABLE employee(
  id 			int(11) 	 PRIMARY KEY
, first_name 	varchar(50)  NOT NULL
, last_name 	varchar(100) NOT NULL); 
