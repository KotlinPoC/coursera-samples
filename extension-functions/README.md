# Extension functions

* https://www.coursera.org/learn/kotlin-for-java-developers/lecture/i8Av9/extension-functions
* https://kotlinlang.org/docs/reference/extensions.html
* extension functions extend the class

* the class that a function extends is called the receiver
** Reciever.extensionfunction

* Mostly used at top level, directly under packages, if used outside, must be imported a(see scope in kotlinlang ref)
* kotlin extension funcs are regular static functions defined in a separate auxilliary class
** so can't call private members from extensions

# Kotlin standard library
Kotlin standard library provides extensions for Java colllections

There is no kotlin SDK,  it's the JDK + extensions, this means
* small runtime jar
* easy Java interop

## kotlin standard library = java standard library + extensions

#  Calling Extensions & Inheritance
Extensions are **static** java functions under the hood, so
extension functions cannot be overriden (as static methods)

An extension cannot hide a member function but CAN overload it. 

# Extensions are **important**
* purpose to keep classes and interface APIs simple
* utility convenience methods can be written as extensions
Ex:  string class from Kotlin lib, string id a collection of chars that can be indexed, so handful of methods:
* length
* char by index etc
everything else is an extension: regex funcs, matching, toupper, to lower etc

## member funcs for intrinsic things and extensions for everything else

other situation: when you don't have control of the class yourself, allows you to extend the APIs of existing libs




