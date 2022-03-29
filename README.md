# java-basic-to-master

## what is computation

* problem solving
* knowledge of concepts
* programming skill


concepts : 

* data structures
* iteration and recursion 

* abstraction 
* organize and modularize (readability)

* algorithms (searching and sorting)
* complexity of algoritms


computer -> do calculations, store somewhere(remember)


type of knowledge

declarative knowledge - statements of fact

imperative knowledge - recipe or how-to -> sequence of steps

two types of computers

fixed program -> calculator
store program - machine stores and exucute instructions

turing showed that you can compute anything using 6 primitives
move left, move right, read , write, scan and do nothing.

expressions ->  variable(object) + operation

syntax error -> wrong word
semantic error -> the order of the words





 



## java tutorial

Java is an object-oriented, class-based, concurrent, secured and general-purpose computer-programming language.

Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.

Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak.

Platform: Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform.

Simple.java

### Types of Java Applications

There are mainly 4 types of applications that can be created using Java programming:

Standalone Application - Standalone applications are also known as desktop applications or window-based applications

Web Application - An application that runs on the server side and creates a dynamic page is called a web application. Currently, Servlet, JSP, Struts, Spring, Hibernate, JSF, etc. technologies are used for creating web applications in Java.

Enterprise Application - An application that is distributed in nature, such as banking applications, etc. is called an enterprise application. It has advantages like high-level security, load balancing, and clustering. In Java, EJB is used for creating enterprise applications.

Mobile Application - An application which is created for mobile devices is called a mobile application. Currently, Android and Java ME are used for creating mobile applications.

### Java Platforms / Editions

Java SE (Java Standard Edition)

It is a Java programming platform. It includes Java programming APIs such as java.lang, java.io, java.net, java.util, java.sql, java.math etc. It includes core topics like OOPs, String, Regex, Exception, Inner classes, Multithreading, I/O Stream, Networking, AWT, Swing, Reflection, Collection, etc.

Java EE (Java Enterprise Edition)

It is an enterprise platform that is mainly used to develop web and enterprise applications. It is built on top of the Java SE platform. It includes topics like Servlet, JSP, Web Services, EJB, JPA, etc.

Java ME (Java Micro Edition)

It is a micro platform that is dedicated to mobile applications.

JavaFX

It is used to develop rich internet applications. It uses a lightweight user interface API.

current version - Java SE 18 (to be released by March 2022)

java is 

Simple
Object-Oriented
Portable
Platform independent
Secured
Robust
Architecture neutral
Interpreted
High Performance
Multithreaded
Distributed
Dynamic

Java is best known for its security. With Java, we can develop virus-free systems. Java is secured because:

No explicit pointer

Java Programs run inside a virtual machine sandbox

Classloader: Classloader in Java is a part of the Java Runtime Environment (JRE) which is used to load Java classes into the Java Virtual Machine dynamically. It adds security by separating the package for the classes of the local file system from those that are imported from network sources.

Bytecode Verifier: It checks the code fragments for illegal code that can violate access rights to objects.

Security Manager: It determines what resources a class can access such as reading and writing to the local disk.


Distributed

Java is distributed because it facilitates users to create distributed applications in Java. RMI and EJB are used for creating distributed applications. This feature of Java makes us able to access files by calling the methods from any machine on the internet.

Dynamic

Java is a dynamic language. It supports the dynamic loading of classes. It means classes are loaded on demand. It also supports functions from its native languages, i.e., C and C++.

Java supports dynamic compilation and automatic memory management (garbage collection).

To compile(generate simple.class -> bytecode):
javac Simple.java

To execute:
java Simple

valid java main() method signature

public static void main(String[] args)  
public static void main(String []args)  
public static void main(String args[])  
public static void main(String... args)  
static public void main(String[] args)  
public static final void main(String[] args)  
final public static void main(String[] args)  
final strictfp public static void main(String[] args)  

you can set temporary or permant path in Java

We must understand the differences between JDK, JRE, and JVM before proceeding further to Java.

JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine because it doesn't physically exist. It is a specification that provides a runtime environment in which Java bytecode can be executed. It can also run those programs which are written in other languages and compiled to Java bytecode.

Loads code
Verifies code
Executes code
Provides runtime environment

JRE is an acronym for Java Runtime Environment. It is also written as Java RTE. The Java Runtime Environment is a set of software tools which are used for developing Java applications. It is used to provide the runtime environment. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.

JRE = + JVM + SET OF libraries + other files

JDK is an acronym for Java Development Kit. The Java Development Kit (JDK) is a software development environment which is used to develop Java applications and applets. It physically exists. It contains JRE + development tools.

JDK is an implementation of any one of the below given Java Platforms released by Oracle Corporation:

Standard Edition Java Platform
Enterprise Edition Java Platform
Micro Edition Java Platform

![](2022-03-29-12-17-23.png)

JVM (Java Virtual Machine) is an abstract machine. It is a specification that provides runtime environment in which java bytecode can be executed.


A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.

Variable is a name of memory location. There are three types of variables in java: local, instance and static.

There are two types of data types in Java: primitive and non-primitive.

A variable is the name of a reserved area allocated in memory.

A variable declared inside the body of the method is called local variable.

A local variable cannot be defined with "static" keyword.

variable declared inside the class but outside the body of the method, is called an instance variable.

A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

Variable.java

widening - to increase the width, scope, or extent of widen a road widen an investigation.

widening -> int to float

```java
int a=10;  
float f=a;  
```

Narrowing (Typecasting)

narrowing -> float to int

```java
float f=10.5f;  
//int a=f;//Compile time error  
int a=(int)f;  
```

Primitive data types: The primitive data types include 
boolean, char, byte, short, int, long, float and double.

boolean data type
byte data type
char data type

short data type
int data type
long data type

float data type
double data type


Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

![](2022-03-29-12-34-38.png)


Byte Data Type

1 byte -> 8 bits ->  (max) 127 to -128 (min)

The byte data type is an example of primitive data type. It isan 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127. Its default value is 0.

The byte data type is used to save memory in large arrays where the memory savings is most required. It saves space because a byte is 4 times smaller than an integer. It can also be used in place of "int" data type.

```java
byte a = 10, byte b = -20  
```

The short data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767

The int data type is a 32-bit signed two's complement integer. Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)

The long data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive).

```java
long a = 100000L, long b = -200000L  
```

The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. The float data type should never be used for precise values, such as currency. 

```java
float f1 = 234.5f  
```

The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited. The double data type is generally used for decimal values just like float. The double data type also should never be used for precise values, such as currency.

The char data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).The char data type is used to store characters.

```java
chart letterA = 'a'
```

Java us 2 bytes - It is because java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system. 

Unicode is a universal international standard character encoding that is capable of representing most of the world's written languages.

Before Unicode, there were many language standards:

* ASCII (American Standard Code for Information Interchange) for the United States.
* ISO 8859-1 for Western European Language.
* KOI-8 for Russian.
* GB18030 and BIG-5 for chinese, and so on.



This caused two problems:
* A particular code value corresponds to different letters in the various language standards. (no standard)
* The encodings for languages with large character sets have variable length.Some common characters are encoded as single bytes, other require two or more byte.

lowest value:\u0000
highest value:\uFFFF

Operator in Java is a symbol that is used to perform operations. For example: +, -, *, / etc.

here are many types of operators in Java which are given below:

Unary Operator,
Arithmetic Operator,
Shift Operator,
Relational Operator,
Bitwise Operator,
Logical Operator,
Ternary Operator and
Assignment Operator.

![](2022-03-29-12-42-26.png)


java unary operator

incrementing/decrementing a value by one
negating an expression
inverting the value of a boolean

```java
System.out.println(x++);//10 (11)  
System.out.println(++x);//12  
System.out.println(x--);//12 (11)  
System.out.println(--x);//10  
````

result : 10 12 12 10

```java
int a=10;  
int b=-10;  
boolean c=true;  
boolean d=false;  
System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true  
```

java arithmetic 

```java
System.out.println(a+b);//15  
System.out.println(a-b);//5  
System.out.println(a*b);//50  
System.out.println(a/b);//2  
System.out.println(a%b);//0  
```


The Java left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.

```java
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(10<<3);//10*2^3=10*8=80  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(15<<4);//15*2^4=15*16=240  
```

The Java right shift operator >> is used to move the value of the left operand to 
right by the number of bits specified by the right operand.

```java
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  
```

Java Shift Operator Example: >> vs >>>

```java
//For positive number, >> and >>> works same  
System.out.println(20>>2);  
System.out.println(20>>>2);  
//For negative number, >>> changes parity bit (MSB) to 0  
System.out.println(-20>>2);  
System.out.println(-20>>>2);  
```

Java AND Operator Example: Logical && and Bitwise &

The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.

The bitwise & operator always checks both conditions whether first condition is true or false.

```java
nt a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a<c);//false && true = false  
System.out.println(a<b&a<c);//false & true = false  
```

Java AND Operator Example: Logical && vs Bitwise &

```java
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a++<c);//false && true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<c);//false && true = false  
System.out.println(a);//11 because second condition is checked  
```

Java OR Operator Example: Logical || and Bitwise |

The logical || operator doesn't check the second condition if the first condition is true. It checks the second condition only if the first one is false.

The bitwise | operator always checks both conditions whether first condition is true or false.

```java
int a=10;  
int b=5;  
int c=20;  
System.out.println(a>b||a<c);//true || true = true  
System.out.println(a>b|a<c);//true | true = true  
//|| vs |  
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
```

Java Ternary operator is used as one line replacement for if-then-else statement and used a lot in Java programming. It is the only conditional operator which takes three operands.

Ternary.java


Java assignment operator is one of the most common operators. It is used to assign the value on its right to the operand on its left.

```java
int a=10;  
int b=20;  
a+=4;//a=a+4 (a=10+4)  
b-=4;//b=b-4 (b=20-4)  
a*=2;//9*2  
a/=2;//18/2  
```


Java keywords are also known as reserved words. Keywords are particular words that act as a key to a code. These are predefined words by Java so they cannot be used as a variable or object name or class name.



* abstract: Java abstract keyword is used to declare an abstract class. An abstract class can provide the implementation of the interface. It can have abstract and non-abstract methods.
* boolean: Java boolean keyword is used to declare a variable as a boolean type. It can hold True and False values only.
* break: Java break keyword is used to break the loop or switch statement. It breaks the current flow of the program at specified conditions.
* byte: Java byte keyword is used to declare a variable that can hold 8-bit data values.
* case: Java case keyword is used with the switch statements to mark blocks of text.
* catch: Java catch keyword is used to catch the exceptions generated by try statements. It must be used after the try block only.
* char: Java char keyword is used to declare a variable that can hold unsigned 16-bit Unicode characters
* class: Java class keyword is used to declare a class.
* continue: Java continue keyword is used to continue the loop. It continues the current flow of the program and skips the remaining code at the specified condition.
* default: Java default keyword is used to specify the default block of code in a switch statement.
* do: Java do keyword is used in the control statement to declare a loop. It can iterate a part of the program several times.
* double: Java double keyword is used to declare a variable that can hold 64-bit floating-point number.
* else: Java else keyword is used to indicate the alternative branches in an if statement.
* enum: Java enum keyword is used to define a fixed set of constants. Enum constructors are always private or default.
* extends: Java extends keyword is used to indicate that a class is derived from another class or interface.
* final: Java final keyword is used to indicate that a variable holds a constant value. It is used with a variable. It is used to restrict the user from updating the value of the variable.
* finally: Java finally keyword indicates a block of code in a try-catch structure. This block is always executed whether an exception is handled or not.
* float: Java float keyword is used to declare a variable that can hold a 32-bit floating-point number.
* for: Java for keyword is used to start a for loop. It is used to execute a set of instructions/functions repeatedly when some condition becomes true. If the number of iteration is fixed, it is recommended to use for loop.
* if: Java if keyword tests the condition. It executes the if block if the condition is true.
* implements: Java implements keyword is used to implement an interface.
* import: Java import keyword makes classes and interfaces available and accessible to the current source code.
* instanceof: Java instanceof keyword is used to test whether the object is an instance of the specified class or implements an interface.
* int: Java int keyword is used to declare a variable that can hold a 32-bit signed integer.
* interface: Java interface keyword is used to declare an interface. It can have only abstract methods.
* long: Java long keyword is used to declare a variable that can hold a 64-bit integer.
native: Java native keyword is used to specify that a method is implemented in native code using JNI (Java Native Interface).
* new: Java new keyword is used to create new objects.
* null: Java null keyword is used to indicate that a reference does not refer to anything. It removes the garbage value.
* package: Java package keyword is used to declare a Java package that includes the classes.
* private: Java private keyword is an access modifier. It is used to indicate that a method or variable may be accessed only in the class in which it is declared.
* protected: Java protected keyword is an access modifier. It can be accessible within the package and outside the package but through inheritance only. It can't be applied with the class.
* public: Java public keyword is an access modifier. It is used to indicate that an item is accessible anywhere. It has the widest scope among all other modifiers.
* return: Java return keyword is used to return from a method when its execution is complete.
* short: Java short keyword is used to declare a variable that can hold a 16-bit integer.
* static: Java static keyword is used to indicate that a variable or method is a class method. The static keyword in Java is mainly used for memory management.
* strictfp: Java strictfp is used to restrict the floating-point calculations to ensure portability.
* super: Java super keyword is a reference variable that is used to refer to parent class objects. It can be used to invoke the immediate parent class method.
* switch: The Java switch keyword contains a switch statement that executes code based on test value. The switch statement tests the equality of a variable against multiple values.
synchronized: Java synchronized keyword is used to specify the critical sections or methods in multithreaded code.
* this: Java this keyword can be used to refer the current object in a method or constructor.
* throw: The Java throw keyword is used to explicitly throw an exception. The throw keyword is mainly used to throw custom exceptions. It is followed by an instance.
* throws: The Java throws keyword is used to declare an exception. Checked exceptions can be propagated with throws.
* transient: Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.
* try: Java try keyword is used to start a block of code that will be tested for exceptions. The try block must be followed by either catch or finally block.
* void: Java void keyword is used to specify that a method does not have a return value.
* volatile: Java volatile keyword is used to indicate that a variable may change asynchronously.
* while: Java while keyword is used to start a while loop. This loop iterates a part of the program several times. If the number of iteration is not fixed, it is recommended to use the while loop.

continue

```java
//for loop  
for(int i=1;i<=10;i++){  
    if(i==5){  
        //using continue statement  
        continue;//it will skip the rest statement  
    }  
    System.out.println(i);  
}  
```


Java default keyword

A Java default keyword is an access modifier. If you didn't assign any access modifier to variables, methods, constructors and, classes, by default, it is considered as default access modifier.

The default access modifier is accessible within the package only.

Java null reserved word

In Java, null is a reserved word for literal values. It seems like a keyword, but actually, it is a literal similar to true and false.

The access to a null reference generates a NullPointerException.

Java strictfp keyword 

ensures that you will get the same result on every platform if you perform operations in the floating-point variable. The precision may differ from platform to platform that is why java programming language have provided the strictfp keyword, so that you get same result on every platform. So, now you have better control over the floating-point arithmetic.

The strictfp keyword can be applied on methods, classes and interfaces.

```java
strictfp class A{}//strictfp applied on class  

strictfp interface M{}//strictfp applied on interface  

class A{  
    strictfp void m(){}//strictfp applied on method  
}  
```


Volatile Keyword in Java

Volatile keyword is used to modify the value of a variable by different threads. It is also used to make classes thread safe. It means that multiple threads can use a method and instance of the classes at the same time without any problem. The volatile keyword can be used either with primitive type or objects.

The volatile keyword does not cache the value of the variable and always read the variable from the main memory. The volatile keyword cannot be used with classes or methods. However, it is used with variables. It also guarantees visibility and ordering. It prevents the compiler from the reordering of code.

```java
class Test  {  
    static volatile int var =5;  
}  
```

When to use it?

* You can use a volatile variable if you want to read and write long and double variable automatically.
* It can be used as an alternative way of achieving synchronization in Java.
* All reader threads will see the updated value of the volatile variable after completing the write operation. If you are not using the volatile keyword, different reader thread may see different values.
* It is used to inform the compiler that multiple threads will access a particular statement. It prevents the compiler from doing any reordering or any optimization.
* If you do not use volatile variable compiler can reorder the code, free to write in cache value of volatile variable instead of reading from the main memory.

![](2022-03-29-14-46-38.png)


to check your java version in the command

```terminal
java - version
```

java comments 

```java
/*
multiline comments

*/

// this is inline comment

// javadoc comments

/**
 * Multiple lines of Javadoc text are written here,
 * wrapped normally...
 */

/** An especially short bit of Javadoc. */

```

