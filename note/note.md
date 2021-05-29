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

method signature: public static List<Integer> hailstone(int n) , the parameters' types and return type.

![Javadoc Comments](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\Javadoc Comments.png)

## Snapshot diagrams
Snapshot diagrams represent the internal state of a program at runtime – its stack (methods in progress and their local variables) and its heap (objects that currently exist)

![primitive Values](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\primitive Values.png)

![object values](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\object values.png)

![mutable value](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\mutable value.png)

![immutable value](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\immutable value.png)

![immutable references](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\immutable references.png)

## mutable and immutable
### mutable value and immutable value
Immutable type: a type whose values can never change once they have been created, e.g. String.
mutable type: has methods that change the value of the object, e.g. StringBuilder.

### mutable reference and immutable reference
mutable reference: variables that can point to other value, e.g. String a = "sd", a = "a";
immutable reference: variables cannot point to other value, e.g. variables declare with the keyword "final"

if a final variable points to a mutable object, then the variable cannot be reassigned, but the object it points to can still be mutated, e.g. final List a = {1, 2}, a = {2, 3};


## Final

final can be used on both **parameters** and **local variables**

if a final variable points to a mutable object, then the variable cannot be reassigned , but the object it points to can still be mutated.

## Map

A map stores key/value pairs , where each key has an associated value.




## Interface
interfaces: define how these respective types work, but don’t provide implementation code.



## Testing

### Test Driven Development and Corner Cases

In Test Driven Development (TDD), you start by writing the test code first even before writing the implementation code.

Always create test cases for the corner cases
○ For example: empty list, singleton list (list with just one element), smallest list with answer equals zero/non zero or false/true.


### regression testing
Rerun tests when you modify your code.
A regression test case comes from the discovery of a bug, which means when you find and fix a bug, you should take the input that elicited the bug and add it to your automated test suite as a test case.

### automated regression testing
automated regression testing is a best practice of modern software engineering.

### unit testing
unit testing,  the idea that we should write tests of each module of our program in isolation.
A good unit test is focused on just a single specification.


## Specification
### Specification Structure
A specification of a method consists of two clauses:
○ a ***precondition***, indicated by the keyword requires
○ a ***postcondition***, indicated by the keyword effects


● The overall structure is a logical implication:
if the precondition holds when the method is called, then the postcondition must hold when the method completes

● If the precondition does not hold when the method is
called, the implementation is not bound by the
postcondition
	○ It is free to do anything , including not terminating, throwing an exception, returning arbitrary results, making arbitrary modifications, etc

### Three Dimensions for Comparing Specs
deterministic: it is: does the spec define only a ***single possible output*** (deterministic) for a given input, or does it allow the implementor to choose from a ***set of legal outputs*** (underdetermined)
declarative: it is: does the spec just ***characterize what the output should be*** (Declarative), or does it 
***explicitly say how to compute the output*** (Operational)
strong: it is: does the spec have a ***small set of legal implementations***, or a ***large set***



A specification S2 is stronger than or equal to a specification S1 if
○ S2's precondition is weaker than or equal to S1's, and
○ S2's postcondition is stronger than or equal to S1's for the states that satisfy S1's precondition

otherwise, they are incomparable.

if S2 stronger than S1:

![S2 stronger than S1](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\S2 stronger than S1.png)

If this is the case, then an implementation that satisfies S2 can be used to satisfy S1 as well, and it's safe to replace S1 with S2 in your program.

These two rules embody several ideas: they tell you that you can always weaken the precondition ; placing fewer demands on a client will never upset them; and you can always strengthen the postcondition , which means making more promises.




## invariant
An invariant is a condition that is guaranteed to be true during code execution.

For example, SLList with Sentinel Node has the following invariants:
○ sentinel instance variable always points to a sentinel node
○ the first node, if it exists, is always at sentinel.next
○ size instance variable is always the total number of items added

Invariants make it easier to reason about code:
○ can assume they are true to simplify code, e.g., addLast does not need to worry about the null case
○ must ensure that the methods preserve invariants


## Exception

### Checked and Unchecked Exceptions
checked exceptions to signal special results.
unchecked exceptions to signal bugs.

![Java Expection Hierarchy](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\Java Expection Hierarchy.png)

![checked](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\checked.png)

![throw](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\throw.png)

![Exception](D:\Files\Learning Materials\Y3\Semester-2\CPT204\note\Exception.png)


## Assertions
### defensive programming
Defensive programming offers a way to mitigate the effects of bugs even if you don't know where they are.
example: Checking preconditions

### assert
Note that the Java assert statement is a different mechanism than the JUnit methods assertTrue()assertTrue(), assertEquals()assertEquals(), etc.
They all assert a predicate about your code, but are designed for use in different contexts.
The assert statement should be used in implementation code for defensive checks inside the implementation.
JUnit assert...() methods should be used in JUnit tests to check the result of a test.

## Modularity
***Modularity*** means dividing up a system into components, or modules, each of which can be designed, implemented, tested, reasoned about, and reused separately from the rest of the system.

The opposite of a modular system is a ***monolithic*** system - big and with all of its pieces tangled up and dependent on each other.

***Encapsulation*** means building walls around a module (a hard shell or capsule) so that the module is responsible for its own internal behavior and bugs in other parts of the system can't damage its integrity.

One kind of encapsulation is ***access control*** : using public and private to control the visibility and accessibility of your variables and methods.

Another kind of encapsulation comes from ***variable scope***

