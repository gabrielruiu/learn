CREATE TABLE patient (
  id INT NOT NULL AUTO_INCREMENT,
  created_date DATETIME NOT NULL,
  last_changed_date DATETIME NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  birth_date DATETIME NOT NULL,
  gender VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);