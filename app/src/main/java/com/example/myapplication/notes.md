============
==> Kotlin mostly runs on the JVM
==> Runtime exceptions and Application exceptions
==> JAVA EXCEPTIONS => Unchecked exceptions and Checked
==> Unchecked => Runtime exceptions eg ArrayOutOfBounds
==> Checked => app-level exceptions -> must be caught

==> In kotlin theres no distinction
==> all exceptions are the same (Unchecked)


================LOOPS===============
==> You can break out of 2 while loops by using labels



================RANGES==============
==> Inclusive ranges are also known as closed ranges
==> One limitation of the foreach loop in java is that you can't get the index of what you're iterating over
==> In kotlin, you can


==> the when keyword can also work on ranges of values
==> when you use the in keyword you can have multiple conditions within a when block like...
        when (num) {
            in validNumbers -> println("num is valid")
            in 1..10 -> println("num exists in range")
            else -> println("num not exist in range")
        }

===============CLASSES AND INTERFACES=================
Declaring classes
Creating instances
Properties
Members
Declaring interfaces
Interface Details
Implementing interfaces
Inline classes

CONSTRUCTORS
==> Classes are public by default
==> They will have a primary constructor that allows us to initialize an instance when it is created
==> Also, secondary constructors
==> No new keyword

==> Properties passed into the primary constructor of classes are private by default and can be made public by using the 
val or var keyword eg.
        class Planet (val name: String) // Primary constructor

==> to run code as part of the constructor initialization you can add an init method to the object
==> secondary constructors can be created using the constructor keyword
==> You can have multiple keywords

PROPERTIES
==> Just like other PLs

METHODS
==> Classes can also have methods
==> By default methods and classes are public, they can be made private

DERIVATION
==> more like inheritance - isA relationship

==> In kotlin by default all classes are marked as final
==> mark classes/methods you want to inherit from with the 'open' keyword
==> be explicit when overriding

ABSTRACT CLASSES
==> mark with 'abstract' keyword - classes, properties and methods
// TODO is a function that throws an exception

INTERFACES
==> one difference between abstract classes and interfaces is that interfaces can't store state. 
The similarities and differences are similar to those in other languages
==> Interfaces represent actions -> database connections, logging
==> Interfaces model a hasA relationship
    - A Person hasA logger calls
    - A Person hasA DatabaseConnection

INLINE CLASSES
==> See Exam.kt

===================DATA CLASSES (DC)====================
==> creating DC
==> Overriding functionality
==> Overriding the behaviour
==> Copying and Destructuring

What is a data class?
==> Many times in code, we need to model data - But no behaviour
==> Like DTOs
==> We need DTOs
- Moving data to and from the database
- Sending data over HTTP
- Storing data in collections

==> All classes derive from a base class - Any and any provides a toString method etc just like java
==> DTOs should override these methods especially when:
- especially when Comparing for collections
- can be tedious

- See Person.kt
- A data class must contain data
- N/B - in java == does a reference equality test, in kotlin === does that
- in kotlin == calls .equals under the covers and does a structural equality test
- Any value of a data class that is not present in the constructor is removed 
from the calculation of the hashcode, the equals and the toString

DESTRUCTURING
- Reaches into the data class, and pulling out the properties by position and then assigning those properties
to the values on the left hand side, and then you can use those values elsewhere in the code



======================OTHER CLASS TYPES======================
ENUMERATIONS
- Enums are instances of the class they are part of
- See Colors.kt

SEALED CLASSES
- with sealed classes, rather than having values of a class, we actually create a hierarchy, 
so you have a base class that's marked as sealed and then other classes that derive from that within a class hierarchy
- the idea behind sealed classes is that they give us more control over inheritance
- when you defined a sealed class, all subclasses are known at compile time because all subclasses are in the same module as the sealed class
- See Events.kt

INNER CLASSES
- the nested class has no access to the outer classes data
- to create an instance of the nested class we have something like an outer class named Outer
      - val nested = Outer.Nested()
      - nested.doSomething
- NOW, Inner classes are different
- to create an instance of the inner class. You make an instance of the outer class and then 
create an instance of thee inner class on it
- and then call methods on the inner class
- the most common use of inner classes is to use them as anonymous inner classes for things like listeners


===================OBJECTS AND COMPANIONS==================
==> In Kotlin we use the object keyword to create a single instance
==> another place where we use object keyword is in creating singletons

==> You can mark an object as a companion object, which makes it freely available within the outer class
or within invoice and you can call its methods even though they are marked as private

==> Methods of the class that contains a companion object will have the companion objects methods 
directly accessible from the class itself


=====================FUNCTIONS ON KOTLIN===================
==> Single Function Expressions
==> fun max(a: Int, b: Int): Int = if (a > b) a else b

EXTENSION FUNCTIONS 
- used to add behaviour to classes not necessarily owned by you eg a String class

fun String.pad(original: String, numberToReplace: Int, replacementCharacter: Char = ' '): String {
    val strToAdd =replacementCharacter.toString().repeat(numberToReplace)
    return original + strToAdd
}

- the above makes pad an extension function on the string class

INFIX FUNCTIONS
- Normal function - a.add(b)
- infix function - a add b
==> Member of extension functions
==> have a single parameter
==> marked with infix keyword

uses of Infix functions:
- Operator overloading - predefined set of operators can be overloaded
- See Point.kt


===============HIGHER ORDER FUNCTIONS===============
- Functions as first class citizens
- Can pass to and return from functions ie passing functions to other functions
- storing references of functions inside collections

PASSING FUNCTIONS
- functions have a type and can be declared
- type consists of parameters and return type followed by an arrow (->) followed by return type
- Passing a function is to declare a function as having another function as a parameter, the when we
call the first function we pass the second function as argument
- Declaration ==>
        fun foo(bar: Int, action: (int) -> Unit) {}
- Usage ==>
        foo(20, {a -> someFunction(a)}
- Usage with method reference==>
        foo(20, ::someFunction)
        val b = Bar()
        foo(20, b::someFunction)
- see Fibonacci.kt

CLOSURES
==> Mutating values outside the lambda
==> So if i declare a variable that I use inside a lambda, that lambda can change the value of that variable
- see Fibonacci.kt

WITH AND APPLY
- see Meeting.kt

TRY
- java has tryWithResources where it will auto-close things that implement the closable interface
- Kotlin has similar, but not a language feature - it's part of the standard library
- See Meeting.kt

==================COLLECTIONS AND SEQUENCES====================
ARRAYS
- See Arrays.kt

COLLECTIONS
- val numbers = listOf(1,2,3,4) doesn't have a add method for you to add elements
- use mutableListOf. Same for other collection types
- See Collections.kt

MANIPULATING COLLECTIONS -> predicates, map & filter
- See ManipulatingCollections.kt

SEQUENCES
- functions such as filter and map create lists and are fine if lists are small
- Instead use sequences
- sequences are lazily evaluated
- evaluation starts when using terminal operation
- See ManipulatingCollections.kt


===================NULLABILITY===================
- Kotlin supports nullable types
- Means only explicit variable can be null
- applies to collections as well
- ?. is known as a Safe call Operator
- eg ?.method() -> it checks for null
        val m:Meeting? = null
        val newMeeting = Meeting()
        newMeeting = m
- the above wont compile because m is defined as a nullable type
- you cant assign nullable types to non-nullable types

- See nullability package
- See NullableTypes.kt

OPERATORS
- null coalescing operator ?:
- Not-Null assertions (!!)
- eg m!!.close()
- See Operators.kt

LET AND LATEINIT
- the let function is used to avoid explicit null checks
- Useful when passing Nullable values to functions expecting non-null values
- LateInit (Late Initialized properties) - Sometimes in a class, values cannot be initialized when declared
- And you do not want to mark them as Nullable
- Use 'lateInit' instead


=====================JAVA INTEROPERABILITY======================
- In kotlin we spend a lot of time interoperating with java code 
- Kotlin now working with 'Platform' types 

OVERRIDING JAVA TYPES

- Address is a Java Interface:
class HomeAddress : Address {
// returns a string
override fun getFirstLine(): String {
TODO("Not yet implemented")
}
}

class WorkAddress : Address {
// returns nullable string - allowed because the String type in the address interface is a platform string
override fun getFirstLine(): String? {
TODO("Not yet implemented")
}

}

SAM (Single Abstract method)  INTERFACES 
- See Meeting2.java

ANNOTATIONS 
- All the above reference using java code from kotlin
- This section illustrates using kotlin code from java
- @File, @JvmField and @JvmStatic
- Kotlin var = Java final