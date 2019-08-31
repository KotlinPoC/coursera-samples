// throw is an expression 

// percentage set to 0-100 or throw exception
val percentage = 
  if (number in 0..100) 
    number
  else
    throw IllegalArgumentException("percentage must be 0-100%: $number")


// try is an expression 

// as java, try throws exception if type not listed
// != java try is an expression, so can assign results of try to  a variable
// everything ok, assign Int (from string)
// exception:  return from outer func 
val number = try {
     Integer.parseInt(string)
} catch (e: NumberFormatException) {
      return   // instead of completing func, could assign null 
}

// @Throws annotation

fun foo() { 
  throw IOException()
 }
// no checked expctions in kotlin, so why do we need @Throws
// for interop w Java
@Throws(IOException::class)
fun bar() { 
  throw IOException()
 }
 
 // FROM JAVA
 // DOES NOT COMPILE
 try { DemoKt.foo(); } catch (IOException e) { // ... }
 // COMPILES, DUE TO @Throws ANNOTATION
 try { DemoKt.bar(); } catch (IOException e) { // ... }
  
// N.B. in Java you cannot catch a checked exception if it wasn't thrown
// foo() Error: Exception java.io.IOException is never thrown in the corresponding try block
// so @Throws only needed if you are going to call your func via java
