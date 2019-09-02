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


