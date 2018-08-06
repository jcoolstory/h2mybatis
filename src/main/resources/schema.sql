CREATE TABLE member(
  no INT PRIMARY KEY AUTO_INCREMENT ,
  id VARCHAR (20) not null UNIQUE ,
  name VARCHAR (20) not null,
  password VARCHAR (20) not null,
  regDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  lastLogin TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
  role INT DEFAULT 0
);

CREATE TABLE Board(
  no INT PRIMARY KEY AUTO_INCREMENT,
  author VARCHAR (20) not null,
  title VARCHAR (100) not null,
  content VARCHAR (4000) not null,
  createDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
);

CREATE TABLE member_role (
  no INT PRIMARY KEY AUTO_INCREMENT,
  type INT Default 0,
  name VARCHAR (20),
  level INT DEFAULT 0
)