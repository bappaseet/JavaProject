/*
 * JUnit is a simple framework to write repeatable tests.
 *  It is an instance of the xUnit architecture for unit testing frameworks.
 *   We are using Junit 4 for examples shown here. Here is a simple example.
 *    MyEvenOdd class provides a method isEvenNumber() to test whether the 
 *    given number is even or odd number. We have written MyEvenOddTest class 
 *    to test the functionality of MyEvenOdd class.

@org.junit.Test annotation: The Test annotation tells JUnit that the public 
void method to which it is attached can be run as a test case. To run the method,
 JUnit first constructs a fresh instance of the class then invokes the annotated
  method. Any exceptions thrown by the test will be reported by JUnit as a failure.
   If no exceptions are thrown, the test is assumed to have succeeded.

assertEquals(String message, Object expected, Object actual): Asserts that two objects 
are equal. If they are not, an AssertionError is thrown with the given message. 
If expected and actual are null, they are considered equal.


 */
package com.example.Junit;
 
public class MyEvenOdd {
 
    public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}
