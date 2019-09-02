// what happens when we create an extension with the same
// name as a member method ?? 

// ANSWER:   member method always invoked

fun String.get(index: Int) = '*'

fun main(args: Array<String>) {
  println("abc".get(1))
}
// on compile:
/*
duplicate-methods.kt:6:12: warning: extension is shadowed by a member: public open fun get(index: Int): Char
fun String.get(index: Int) = '*'

*/

// example:
class A { fun foo() = 1 }
fun A.foo() = 2  // gets a warning

A().foo()     // results in 1

// can overload members explicitly 
class A { fun foo() = "member" }
fun A.foo(i: Int) = "extension($i)"  // gets a warning

A().foo(2)     // results in extension(2)

