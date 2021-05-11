# T204 Advanced OO Programming
## Types
Java has 8 primitive types
○ boolean, byte, char, short, int, long, float and double

Java also has object types
○ String, BigInteger

Pimitive types are lowercase, while object types start with a capital letter.



***java is a statically-typed language***:  types of all variables have to be known at compile time (before the program runs).

***dynamically-typed languages*** like Python or Javascript, this kind of checking is deferred until runtime (while the program is running).

## Checking
Three kinds of automatic checking that a language can provide:
1. ***Static checking***: the bug is found automatically before the program even runs.
2. ***Dynamic checking***: the bug is found automatically when the code is executed.
3. ***No checking***: the language doesn't help you find the error at all. You have to watch for it yourself, or end up with wrong answers!

dynamic checking will throw exception, but no checking only result error.

### Static Checking
Static checking can catch:
● syntax errors, like extra punctuation or spurious words
● wrong names, e.g. Math.sine(2) (The right name is sin)
● wrong number of arguments, e.g. Math.sin(30, 20)
● wrong argument types, e.g. Math.sin("30")
● wrong return types, e.g. return "30"; from a function that's declared to return an int

### Dynamic Checking
Dynamic checking can catch:
● illegal argument values, for example, the integer expression x/y is only erroneous when y is actually zero; otherwise it works!
so in this expression, divide-by-zero is not a static error, but a dynamic error
● unrepresentable return values, i.e. when the specific return value can't be represented in the type
● out-of-range indexes, e.g. using a negative or too-large index on a string
● calling a method on a null object reference 

### No checking
● Integer division, e.g. int a = 5 / 2;
● Integer overflow, e.g. byte a = 382387478324324;
● Special values in floating-point types, e.g. NaN

## public and static
***public*** means that any code, anywhere in your program, can refer to that method.
***static*** means the method is associated with the class, not with an object.

## Javadoc Comments and Documenting Assumptions

![Javadoc Comments](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\Javadoc Comments.png)

## Snapshot diagrams
Snapshot diagrams represent the internal state of a program at runtime – its stack (methods in progress and their local variables) and its heap (objects that currently exist)

## mutable and immutable
### mutable value and immutable value
Immutable type: a type whose values can never change once they have been created, e.g. String.
mutable type: has methods that change the value of the object, e.g. StringBuilder.

### mutable reference and immutable reference
mutable reference: variables that can point to other value, e.g. String a = "sd", a = "a";
immutable reference: variables cannot point to other value, e.g. variables declare with the keyword "final"

if a final variable points to a mutable object, then the variable cannot be reassigned, but the object it points to can still be mutated, e.g. final List a = {1, 2}, a = {2, 3};



## Interface
interfaces: define how these respective types work, but don’t provide implementation code.



## Testing

### regression testing
Rerun tests when you modify your code.
A regression test case comes from the discovery of a bug, which means when you find and fix a bug, you should take the input that elicited the bug and add it to your automated test suite as a test case.

### automated regression testing
automated regression testing is a best practice of modern software engineering.