CREATE TABLE book (
  buyId int NOT NULL ,
  taxNo varchar(32) DEFAULT NULL ,
  bookId int NOT NULL ,
  bookPrice float NOT NULL ,
  bookDiscount float NOT NULL ,
  truePrice float NOT NULL ,
  bookMount int NOT NULL ,
  bookMoney float DEFAULT NULL 
) 

-- ----------------------------

-- ----------------------------
INSERT INTO book VALUES ('1', '宜地税2017010234', '1', '39.50', '1.98', '37.52', '100', '3752.00');
INSERT INTO book VALUES ('1', '宜地税2017010234', '2', '24.00', '1.20', '22.80', '100', '2280.00');
INSERT INTO book  VALUES ('2', '江地税2017030234', '3', '40.00', '0.00', '40.00', '20', '800.00');
INSERT INTO book VALUES ('2', '江地税2017030234', '4', '43.00', '0.00', '43.00', '20', '860.00');
INSERT INTO book VALUES ('2', '江地税2017030234', '5', '52.00', '0.00', '52.00', '20', '1040.00');
INSERT INTO book VALUES ('3', '甘地税2017040826', '6', '99.00', '4.95', '94.05', '30', '2821.50');
INSERT INTO book VALUES ('3', '甘地税2017040826', '7', '68.00', '3.40', '64.60', '30', '1938.00');
INSERT INTO book VALUES ('3', '甘地税2017040826', '8', '99.00', '4.95', '94.05', '30', '2821.50');
INSERT INTO book VALUES ('3', '甘地税2017040826', '11', '11.90', '0.00', '11.90', '30', '357.00');
INSERT INTO book VALUES ('4', '湖地税2017050312', '9', '78.00', '3.90', '74.10', '50', '3705.00');
INSERT INTO book VALUES ('4', '湖地税2017050312', '10', '26.00', '1.30', '24.70', '50', '1235.00');
