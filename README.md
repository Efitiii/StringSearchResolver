# Introduction

String Search Set searches on the occurrences of an input string in a given set of strings. 

For example:

Example 1:

Set input containing: { x, alyw, u, v}

String input "xalywu"

output is true as all the substrings of "xalywu" are present in the input set. 

Example 2:

Set input containing: { i, like, ice, cream}

String input "ialike"

output is false as all the substrings of "ialike" are not present in the input set. 

In this case 'a' alone is not present in the set so the result is false. 



## Key Features and Technologies

### Spring and Spring Boot
Spring framework is an open source Java platform that provides comprehensive infrastructure support for developing robust Java applications very easily and very rapidly.
Spring and Spring Boot features is used in this problem to decouple dependencies by the use of Inversion of Control container utilizing dependency injection.

## StringSetSearch
~Given a set of look up strings in a set StringSetSearch tries to search for substrings in the input string. 

~On each stage boolean values 'previous' and 'beforePrevious' are been recorded to help with this manipulation. 

~If 'previous' value is true meaning a string matching the previous value is available then a check for the current character can be made and vice versa. 
 
~If 'beforePrevious' values is true an appended value of just the current character and previous character can be put in the queue to be considered for later check up. 
But if 'beforePrevious' value is false putting the current character and previous character in the queue for later check up won't help as the beforePrevious value also needs to be appended to those characters for later check up.

~ In each of this stages all the values are stored in a queue to be checked with a new character input. 
   

## Installation

To run Spring Boot the following dependencies should be added.
  
    compile 'org.springframework.boot:spring-boot-starter-test:2.1.2.RELEASE'
    compile 'org.springframework.boot:spring-boot-starter-parent:2.1.2.RELEASE'
    compile 'org.springframework.boot:spring-boot-starter-web:2.1.2.RELEASE'

Junit 5 should also be added to the class path

 'org.junit.jupiter:junit-jupiter-engine:5.2.0'
 
 ## Assumption
 ~ Only lowercase String values are been considered.
 
 ~ No white space is considered for the string input. 
 
 
 ## Future Scope
 Some futures of functional programming of Java 8 can be integrated with this solution.
 
 For example: features of Stream API such as anyMatch(), allMatch() can be used in search for a substring in the set of strings. 