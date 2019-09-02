// extension functions extend the class

// you can look in the library or use completion in the ide for more

//  eq used in this course, not a standard extention func

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
 }
fun main() {
     fun getAns() = 42
     getAns() eq 42    // OK
     getAns() eq 24	// Error: 42 != 24
}
