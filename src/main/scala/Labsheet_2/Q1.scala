package Labsheet_2

object Q1 {
  var k, i, j : Int = 2;
  var m,n : Int = 5;
  var f = 12.0f;
  var g = 4.0f;
  var c = 'X';

  def main(args: Array[String]): Unit = {
    println(k + 12 * m)
    println(m / j)
    println(n % j)
    println(m / j * j)
    println(f + 10 * 5 + g)
    i += 1;
    println(i * n)

  }
}

//Syntax:
// Answer for the Question 1:


//  Scala has a more concise and expressive syntax compared to Java. It incorporates functional programming concepts, allowing developers to write more expressive and concise code.
//  Java has a more verbose syntax compared to Scala. It follows a more traditional object-oriented programming style.


//  Functional Programming:
//  Scala has strong support for functional programming paradigms. It provides features like higher-order functions, immutability, pattern matching, and type inference.
//Java introduced functional programming features like lambda expressions and streams in later versions (Java 8+). While functional programming is possible in Java, it is not as natural or powerful as in Scala.


//Type System:
//  Scala has a more advanced and flexible type system compared to Java. It supports traits, which are similar to interfaces but allow for code reuse and composition. Scala also has built-in support for algebraic data types (ADTs) and pattern matching.
//Java has a simpler type system compared to Scala. It uses interfaces for abstraction and does not have built-in support for ADTs or pattern matching.


//  Interoperability:
//  Scala is fully interoperable with Java. Scala code can call Java code and vice versa, allowing developers to leverage existing Java libraries and frameworks seamlessly.
//While Java and Scala can interoperate, Scala has some advanced features and constructs that are not compatible with Java, making Java code integration more challenging in certain cases.


//  Concurrency:
//  Scala provides built-in support for concurrent programming with features like actors and the Future API. It offers more expressive and safer ways to write concurrent code.
//  Java also has support for concurrency with features like threads, synchronization, and the java.util.concurrent package. However, Java's concurrency model is lower-level and requires more explicit management compared to Scala.


//  Community and Ecosystem:
//  Java has a larger and more mature ecosystem with a vast array of libraries, frameworks, and tools available. It has been widely adopted for enterprise development and has a large developer community.
//Scala has a smaller but growing community and a more specialized ecosystem. It is often used in data processing, distributed systems, and scalable applications. However, many Java libraries and frameworks can be used in Scala, providing a bridge to the Java ecosystem.
