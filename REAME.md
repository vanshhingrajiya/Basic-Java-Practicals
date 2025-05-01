#Experiment titels
<br>
Experiment 1
<br>
2.	Write a Program that displays Welcome to Java, Learning Java Now and Programming is fun.
<br>
3.	Write a program that solves the following equation and displays the value x and y:
<br>
a. 3.4x+50.2y=44.5 , 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation ax+by=e, x=ed-bf/ad-bc,	cx+dy=f, y=af-ec/ad-bc)
<br>
4.	Write a program that reads a number in meters, converts it to feet, and displays the result.
<br>
<br>
Experiment 3
<br>
1.  Write a Java application which takes several command line arguments, which are supposed to be names of students and prints output as given below: (Suppose we enter 3 names then output should be as follows):<br>
Number of arguments = 3<br>
1: First Student Name is =Tom<br>
2: Second Student Name is =Dick<br>
3: Third Student Name is =Harry<br>
(Hint: An array may be used for converting from numeric values from 1 to 20 into String.)
<br>
2.  Design a class named Rectangle to represent a rectangle. The class contains: Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
A no-arg constructor that creates a default rectangle.
A constructor that creates a rectangle with the specified width and height.
A method named getArea() that returns the area of this rectangle.
A method named getPerimeter() that returns the perimeter.
Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
<br>
3.  	Define a class called Cartesian Point, which has two instance variables, x and y. Provide the methods get X() and get Y() to return the values of the x and y values respectively, a method called move() which would take two integers as parameters and change the values of x and y respectively, a method called display() which would display the current values of x and y. Now overload the method move() to work with single parameter, which would set both x and y to the same values,provide constructors with two parameters and overload to work with one parameter as well. Now define a class called Test Cartesian Point, with the main method to test the various methods in the Cartesian Point class.
<br>
4.  	Create a class Employee which has two private data members name and salary and it has two public member functions named as getData() and putData() where getData() gets name and salary from the user putData() displays name and salary for any user.
<br>
5.  	Define a class Time with hours and minutes astwo data members, add necessary member functions to initialize and display data of class. Do not use constructors in a class. Define a member function sum () which adds two Time objects. (Use the statements like T3.sum (T1, T2)).
<br>
6.  	Define Class named Point which represents 2-D Point, i.e P (x, y).  Define Defaultconstructor to initialize both data member value 5, Parameterized constructor to initialize member according to value supplied by user and Copy Constructor. Define Necessary Function and Write a program to test class Point.
<br>
7.  	Create a class Account. It has three data member account id, name and balance. Define function to assign value and display value. Define function that search account number given by the user. If account number exists, print detail of that account. Write a program using array of object. Declare at least 5 account and print details.
<br><br>
Experiment 4
<br>
1.  	A set of 5 words (strings) will be taken as command line arguments. Write a program to reverse each word and check whether it is palindrome or not using method.
<br>
2.  	Define the class BankAccount to represent an account we open with bank. Define the subclasses SavingAccount and FixedDepositAccount. Implement the operations like openAccount(), deposit(), checkBalance(), withdraw() and calInterest() for these classes.
<br>
3.  	Write a program that finds area of any shape by overloading area () method for Square, Rectangle, Triangle and Square.
<br>
4.  	Write a program that finds Volume of any shape by overloading volume () method for Cube, Rectangular Cube and Sphere.
<br>
5.  	Write a Program to maintain employee’s information. Program should illustrate Inheritance concept. (Use your imagination to create class or subclass used for employee).
<br> 
6.  	Create a base class Shape. Use this class to store two double type values that could be used to compute area of any shape. Derive two specific classes called Triangle and Rectangle from the base shape. Add to the base a member function getdata() to initialize base class data member and another member function display_area() to compute and display the area of figures. (Use Method Overriding).
<br><br>
Experiment 5
<br>
1.	Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, Circle. Define one method area() in the abstract class and override this area() in these three subclasses to calculate for specific object, i.e., area() of Triangle subclass should calculate area of triangle etc. Same for Rectangle and Circle.
<br>
2.	Write a program that demonstrates the instance of operator. Declare interfaces I1 and I2. Interface I3 extends both of these interfaces. Also declare interface I4. Class X implements I3. Class W extends X and implements I4. Create an object of class W. Use the instance of operator to test if that object implements each of the interfaces and is of type X.
<br>
3.	Write a java program to implement an interface called Exam with a method Pass (int mark) that returns a boolean. Write another interface called Classify with a method Division (int average) which returns a String. Write a class called Result which implements both Exam and Classify. The Pass method should return true if the mark is greater than or equal to 50 else false. The Division method must return "First" when the parameter average is 60 or more, "Second" when average is 50 or more but below 60, "No division" when average is less than 50.
<br><br>
Experiment 6
<br>
1.	Write a program in Java to develop user defined exception for “Divide by Zero” error.
<br>
2.	Write a program in Java to demonstrate throw, throws, finally, multiple try block and multiple catch exception.
<br>
3.	Write a small application in Java to develop Banking Application in which user deposits the amount Rs 1000.00 and then start withdrawing ofRs 400.00, Rs 300.00 and it throws exception "Not Sufficient Fund" when user withdraws Rs 500 thereafter.
<br>
4.	Write an application that contains a method named average () has one argument that is an array of strings. It converts these to double values and returns their average. The method generates a NullPointerException,if an array elements is null or a NumberFormatException, if an element is incorrectly formatted. Include throws statement in method declaration.
<br>
5.	Write an application that generates custom exception if first argument from command line argument is 0.
<br>
6.	A marklist containing reg.no and marks for a subject is given.if the marks are 0,user-defined IllegalMarkException is thrown out and handled with the message "Illegal Mark". For all valid marks, the candidate will be declared as "PASS" if the marks are equal to or greater than 40, otherwise it will be declared as "FAIL".Write a class called IllegalMarkException.
<br>
7.	Assume that there are two packages, student and exam. A student package contains Student class and the exam package contains Result class. Write a program that generates mark sheet for students.
<br>
8.	Define a class A in package a pack. In class A, three variables are defined of access modifiers protected, private and public. Define class B in package bpack which extends A and write display method which accesses variables of class A. Define class C in package cpack which has one method display() in that create one object of class A and display its variables. Define class ProtectedDemo in package dpack in which write main() method. Create objects of class B and C and class display method for both these objects.
<br><br>
Experiment 7
<br>
1.	Write a program that removes all the occurrences of a specified string from a text file. For example, invoking java Practical7_1 John filename removes the string John from the specified file. Your program should read the string as an input.
<br>
2.	Write a program that will count the number of characters, words, and lines in a file. Words are separated by whitespace characters. The file name should be passed as a command-line argument.
<br>
3.	Write a program to create a file named Practical7.txt if it does not exist. Write 100 integers created randomly into the file. Integers are separated by spaces in the file. Read the data back from the file and display the data in increasing order.
<br><br>
Experiment 10
<br>
1.	Write a recursive method that converts a decimal number into a binary number as a string. The method header is: public static String dec2Bin(int value)
<br>
Write a test program that prompts the user to enter a decimal number and displays its binary equivalent.
2.	Write the following method that returns a new ArrayList. The new list contains the non-duplicate elements from the original list.
public static <E>ArrayList<E>removeDuplicates(ArrayList<E> list)
<br>
3.	Implement the following method using binary search.
public static <E extends Comparable<E>>
intbinarySearch(E list, E key)
<br><br>
Experiment 11
<br>
2.	Create two priority queues, {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"}, and find their union, difference, and intersection.
<br>
3.	Store pairs of 10 states and its capital in a map. Your program should prompt the user to enter a state and should display the capital for the state.
<br><br>
Experiment 12
<br>
1.	Write a program to create a thread extending Thread class and demonstrate the use of slip() method.
<br>
2.	Write a program to create a thread implementing Runnable interface and demonstrate the use of join() method.
<br>
3.  Write a program that launches 10 threads. Each thread adds 1 to a variable sum that initially is 0. Define an Integer wrapper object to hold sum. Run the program with and without synchronization to see its effect.