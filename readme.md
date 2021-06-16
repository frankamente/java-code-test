## Java
This is a skeleton Java / Gradle version of the test
## Test
### Java Program
1. Create a function that accepts an array of numbers and returns a reversed array (e.g. [1,2,3] would be [3,2,1]

2.	Write a function that transforms an array of strings to an upper-case array of strings

3.	Given a sentence create a function that returns the number of unique words (e.g. 'the cat jumped over the mat' would be [{'the': 2}, {'cat': 1}…]

4.	Write a function 'composeu' that takes two unary functions and returns a unary function that calls them both. A unary function has a single argument and a single return value (e.g. f(d) { return d + 1}

5.	Write a function that reads from a file and prints the contents to the console

6.	Give an example of how a function would handle an invalid argument 
### SQL
Any SQL dialect will suffice

1.	Create a query to return the unique rows in a table

Supposing a table with 3 columns, being _column_primary_key_ the one with primary key and column1, column2 the columns which we want to be unique, we use this:

`select column1, column2 from table1 group by column1, column2 having count(column_primary_key) = 1;`

2.	Write a command to insert values into a table

It depends on what we want to insert it. If we only want to insert data in specified columns we can use:

`insert into table1 (column1, column2) values ('Fran', 'fran29400@gmail.com';`

3.	Create a query that joins two tables together. Note, all rows from the first table must be in the result-set (e.g. given customer and order tables, return all customers and any orders for each customer)

`select * from customer
inner join order o on customer.id = o.customer_id;`

### Puzzle
Write a console application that accepts a random sequence of numbers and loops through looking for 2 equal, consecutive numbers. When found write 'Snap' to the console else print out the number (e.g. 1,3,5,5,'Snap').
