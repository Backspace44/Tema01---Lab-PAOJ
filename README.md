# Tema01---Lab-PAOJ
The full solution to the tasks listed in the first assignment of the Java Laboratory.

# Topic 1 - Advanced Object-Oriented Programming in Java

## 1. Calculating statistics using primitives and wrappers
   
### Specific requirements:

- The application will receive from the command line (args) at least three arguments: two integers and one real number.
- Use primitive types (int, double) for calculations and wrappers (e.g. Integer, Double) to demonstrate conversion between types.
- Calculate:
 - Sum of three numbers.
 - Arithmetic mean.
 - Product of numbers.
- Implement control statements (if-else and switch) to handle error situations such as division by zero or invalid inputs.
- Display results in a clear format, e.g.: 
 - "Sum: X, Mean: Y, Product: Z"

## 2. Manipulating an array of numbers and using methods in the Arrays class

### Specific requirements:

- Create a class that reads from the user a list of at least 5 integer numbers separated by space.
- Store these numbers in an array of type int[].
- Use wrapper classes or conversions to demonstrate switching between types.
- Use the Arrays.sort() method to sort the array and Arrays.binarySearch() to search for a specific element (e.g., the first number entered).
- Display the original and sorted arrays, demonstrating the array modification by reference.

## 3. OOP hierarchy for vehicles (abstraction, inheritance and polymorphism)
   
### Specific requirements:

- Create an abstract class Vehicle that includes:
 - Common attributes, e.g. make, model, anManufacture.
 - An abstract method description() that returns a string with the vehicle description.
- Create at least two derived classes, e.g. Car and Motorcycle, which extend Vehicle and implement the description() method, adding details specific to each type (e.g. transmission type for Car, power class for Motorcycle).
- In the main method, create a list (or array) of objects of type Vehicle and demonstrate upcasting (storing derived objects in references of type Vehicle).
- Call the description() method for each object, highlighting polymorphism.

## 4. Implementing a Singleton to manage logs

### Specific requirements:

- Create a Logger class implemented as a Singleton (make sure there is only one instance).
- Add static methods such as logInfo(String message), logWarning(String message) and logError(String message) to log messages to the console, prefixed with the message type and logging time.
- In the main method, call these methods and demonstrate that all messages are logged by the same instance of the Logger class.

## 5. Overloading, overriding and the concept of shallow vs. deep copy

### Specific requirements:

- Create the Book class with private attributes: title, author and anAppearance.
- Implement several variants of the displayDetails() method (overloading):
 - One that displays the full details of the book.
 - Another that displays only the title and author.
- Override the toString() method to return a representation of the object in the format "Book{title='. ..', author='...', anAppearance=...}".
- Add a clone method that provides both a shallow and deep copy of the Book object.
- Use comments to clearly explain the differences between shallow copy (where object references are copied) and deep copy (where new instances are created for the referenced objects).
- Add a copy constructor.
- Exemplify shallow/deep copy using both methods.

## 6. Access modifiers, aggregation and composition

### Specific requirements:

- Create the Teacher class with private attributes: name and specialization.
- Declare a final attribute (e.g. codeIdentification) to illustrate immutability.
- Provide getter and setter methods (only for those that are not final).
- Create the Course class containing:
 - An object of type Teacher (composition relation: if the Course object disappears, the associated teacher is no longer relevant for that course).
 - An array of student names, illustrating the aggregation relation (students can exist independently of the course).
- Demonstrate in main how to access attributes and how to change the state of objects, respecting encapsulation rules (using private and protected).

## 7. Upcasting, Downcasting and type checking with instanceof

### Specific requirements:

- Create a class hierarchy for representing animals:
 - Base class Animal with a sound() method.
 - Derived classes: Mammal (a intermediate) and concrete classes Dog and Cat that implement the sound() method (e.g. Dog barks, Cat meows).
- In main:
 - Create objects of type Caine and Cat, but store them in variables of type Animal (upcasting).
 - Browse a collection of animals and, using instanceof, check the actual type of each object.
 - If the object is of type Caine, perform downcasting and call a specific method (e.g. bark()), and if it is Cat, call its specific method.

## 8. Immutable class, Comparable and Generics for student management + string handling

### Specific requirements:

- Create the Student class:
 - Private and final attributes: name (String), age (int) and average (double).
 - Constructor that initializes all attributes.
  - Implement the Comparable<Student> interface to order students by mean (descending or ascending, your choice).
 - Override the equals(), hashCode(), and toString() methods of the Object class.
- Create a generic class Group<T extends Student>:
 - Manage an array of students.
  - Provide methods for adding a student, searching for a student by name, and sorting the list using the Arrays.sort() method.
 - Use the String, StringBuffer, and StringBuilder classes:
 - Create a detailed textual report about students, using StringBuilder for efficient concatenation.
 - Use StringBuffer for a synchronized report (if you want to demonstrate the difference, although in the context of a single thread of execution it may be illustrative only).
 - Highlight situations where it is preferable to use each of these classes.
