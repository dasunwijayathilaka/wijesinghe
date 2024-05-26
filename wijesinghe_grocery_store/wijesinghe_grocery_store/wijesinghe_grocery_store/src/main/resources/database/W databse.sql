-- Create database
CREATE DATABASE WijesingheGrocery;


-- Use the database
USE WijesingheGrocery;


-- Create table for Users
CREATE TABLE Users (
    U_ID VARCHAR(50) PRIMARY KEY,
    U_name VARCHAR(50) NOT NULL,
    U_Password VARCHAR(100) NOT NULL,
    Role VARCHAR(50) NOT NULL,
    U_Email VARCHAR(100) UNIQUE,
    U_Address VARCHAR(255),
    U_Contact_Number VARCHAR(20)
);



-- Insert sample values into Users table
INSERT INTO Users (U_ID, U_name, U_Password, Role, U_Email, U_Address, U_Contact_Number) 
VALUES 
    ('U001','JohnDoe', 'password123', 'Customer', 'john.doe@example.com', '123 Main St, Anytown', '123-456-7890'),
    ('U002','JaneSmith', 'password456', 'Admin', 'jane.smith@example.com', '456 Elm St, Anytown', '987-654-3210');
    ('U003','AliceJones', 'qwerty', 'Customer', 'alice.jones@example.com', '789 Oak St, Anytown', NULL),
    ('U004','BobBrown', 'browny', 'Customer', 'bob.brown@example.com', NULL, NULL);




-- Create table for Customers
CREATE TABLE Customers (
    C_ID  VARCHAR(50) PRIMARY KEY ,
    C_Name VARCHAR(50) NOT NULL,
    C_Address VARCHAR(55),
    C_Email VARCHAR(50) UNIQUE,
    C_Contact_Number VARCHAR(20),
    L_Points INT(30)
);


-- Insert sample values into Customers table
INSERT INTO Customers ( C_ID ,C_Name, C_Address, C_Email, C_Contact_Number, L_Points) 
VALUES 
    ('C001','John Doe', '123 Main St, Anytown', 'john.doe@example.com', '123-456-7890', 50),
    ('C002','Jane Smith', '456 Elm St, Anytown', 'jane.smith@example.com', '987-654-3210', 100);
    ('C003''Alice Jones', '789 Oak St, Anytown', 'alice.jones@example.com', NULL, 25),
    ('C004''Bob Brown', NULL, 'bob.brown@example.com', NULL, 75);



-- Create table for Payments
CREATE TABLE Payments (
    P_ID VARCHAR(50) PRIMARY KEY ,
    P_Type VARCHAR(50) NOT NULL,
    P_Amount DECIMAL(10, 2) NOT NULL,
    Transaction_Date DATE NOT NULL,
    Transaction_Time TIME NOT NULL,
    Card_Type VARCHAR(50),
    Billing_Address VARCHAR(255)
);


-- Insert sample values into Payments table
INSERT INTO Payments ( P_ID , P_Type, P_Amount, Transaction_Date, Transaction_Time, Card_Type, Billing_Address) 
VALUES 
    ('P001','Credit Card', 50.00, '2024-04-09', '12:30:00', 'Visa', '123 Main St, Anytown'),
    ('P002','Cash', 75.50, '2024-04-09', '14:15:00', NULL, NULL);
   
 ('Debit Card', 100.25, '2024-04-09', '16:45:00', 'Mastercard', '456 Elm St, Anytown'),
    ('Credit Card', 30.75, '2024-04-09', '18:20:00', 'American Express', '789 Oak St, Anytown');



-- Create table for Discounts
CREATE TABLE Discounts (
    D_ID VARCHAR(50) PRIMARY KEY ,
    D_Name VARCHAR(100) NOT NULL,
    D_Amount DECIMAL(10, 2) NOT NULL,
    V_Period VARCHAR(50),
    Grocery_Categories VARCHAR(255),
    D_Start_Date DATE NOT NULL,
    D_End_Date DATE NOT NULL
);


-- Insert sample values into Discounts table
INSERT INTO Discounts ( D_ID , D_Name,  D_Amount, V_Period, Grocery_Categories, D_Start_Date, D_End_Date) 
VALUES 
    ('D001','Spring Sale',  10.00, 'Weekly', 'Fruits, Vegetables', '2024-04-01', '2024-04-07'),
    ('D002','Weekend Special', 25.00, 'One-time', 'All', '2024-04-06', '2024-04-07');
  
  ('Back to School',  15.00, 'Monthly', 'School Supplies', '2024-08-01', '2024-08-31'),
    ('Holiday Discount',  50.00, 'One-time', 'All', '2024-12-24', '2024-12-25');





-- Create table for Stores
CREATE TABLE Stores (
    St_ID VARCHAR(50) PRIMARY KEY ,
    St_Name VARCHAR(100) NOT NULL,
    Floor_Plan VARCHAR(255),
    Description TEXT,
    Location VARCHAR(100),
    Qty_On_Hand INT(50)
);



-- Insert sample values into Stores table
INSERT INTO Stores ( St_ID, St_Name, Floor_Plan, Description, Location, Qty_On_Hand) 
VALUES 
    ('St001','SuperMart', 'FloorPlan_SuperMart.jpg', 'Large supermarket offering a wide range of products.', '123 Main St, Anytown', 500),
    ('St002','FreshGro', 'FloorPlan_FreshGro.png', 'Specializes in fresh produce and organic groceries.', '456 Elm St, Anytown', 300);
    

('ConvenienceCorner', NULL, 'Small convenience store offering everyday essentials.', '789 Oak St, Anytown', 150),
    ('Gourmet Delights', 'FloorPlan_GourmetDelights.pdf', 'Upscale store offering gourmet foods and specialty items.', '321 Pine St, Anytown', 200);






-- Create table for Suppliers
CREATE TABLE Suppliers (
    S_ID VARCHAR(10) PRIMARY KEY ,
    S_Name VARCHAR(100) NOT NULL,
    S_Address VARCHAR(255),
    S_Email VARCHAR(100) UNIQUE,
    S_Contact_Number VARCHAR(20),
    Delivery_Schedule VARCHAR(100)
);


-- Insert sample values into Suppliers table
INSERT INTO Suppliers ( S_ID, S_Name, S_Address, S_Email, S_Contact_Number, Delivery_Schedule) 
VALUES 
    ('S001','Fresh Produce Co.', '123 Market St, Anytown', 'info@freshproduce.com', '123-456-7890', 'Monday, Wednesday, Friday'),
    ('S002','Dairy Delights Ltd.', '456 Dairy Ln, Anytown', 'info@dairydelights.com', NULL, 'Tuesday, Thursday');
   
 ('Bakery Supplies Inc.', '789 Baker St, Anytown', 'info@bakerysupplies.com', '987-654-3210', 'Monday to Friday'),
    ('Meat Masters LLC', '321 Butcher Ave, Anytown', 'info@meatmasters.com', '555-555-5555', 'Monday, Wednesday, Friday');






-- Create table for Orders


CREATE TABLE Orders (
     O_ID VARCHAR(10) PRIMARY KEY ,
     U_ID VARCHAR(50) ,
	C_ID  VARCHAR(50) ,
 	D_ID VARCHAR(50),
   	P_ID VARCHAR(50),
    	L_Points_Earned INT(30),
  	O_Time TIME NOT NULL,
   	 O_Date DATE NOT NULL,
   	 Total_Amount DECIMAL(10, 2),
   	 Status VARCHAR(50),
    
FOREIGN KEY (U_ID) REFERENCES Users(U_ID),
    FOREIGN KEY (C_ID) REFERENCES Customers(C_ID),
    FOREIGN KEY (D_ID) REFERENCES Discounts(D_ID),
    FOREIGN KEY (P_ID) REFERENCES Payments(P_ID)
);







-- Create table for Items


CREATE TABLE Items (
    I_ID VARCHAR(50) PRIMARY KEY ,
    I_Name VARCHAR(100) NOT NULL,
    Brands VARCHAR(100),
    Qty INT (50),
    Description TEXT,
    Weight DECIMAL(10, 2),
    St_ID VARCHAR(50),
    FOREIGN KEY (St_ID) REFERENCES Stores(St_ID)
);

