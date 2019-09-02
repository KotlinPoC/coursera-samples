// extension functions extend the class

// you can look in the library or use completion in the ide for more

fun main() {
 val set = hashSetOf(1,7,53)
 val list = arrayListOf(1,7,53)
 val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

 println(set.javaClass)  // class java.util.HashSet
 println(list.javaClass)  // class java.util.ArrayList
 println(map.javaClass)   // class java.util.HashMap 
}

//joinToString() is an extension function:
fun main(args: Array<String>) {
   println(listOf('a', 'b', 'c').joinToString(
	separator = "", prefix ="(", postfix = ")"))
   // result: (abc)
}
fun <T> Iterable<T>.joinToString(
	separator: CharSequence = ", ",
	prefix: CharSequence = "",
	postfix: CharSequence = ""
): String

// getOrNull() is an extension function
fun main(args: Array<String>) {
   println("Hello, $(args.getOrNull(0)}!")
}
fun <T> Array<T>.getOrNull(index: Int) = 
        if (index in 0 until size) this[index] else null

//withIndex() is an extension function:
fun main(args: Array<String>) {
   val = listOf('a', 'b', 'c')
   for ((index, element) in list.withIndex()) {
	println("$index $element")
   }
}
fun <T> Iterable<T>.withIndex(): List(IndexedValue<T>> { ... }

//until() is an extension infix function:
fun main(args: Array<String>) {
  1.until(10)
  1 until 10
}
infix fun Int.until(to: Int): IntRange

//to() is an extension infix function:
// can use whenever you need a pair
fun main(args: Array<String>) {
  "ANSWER".to(42)
  "hot" to RED 
  mapOf(0 to "zero, 1 to "one")
}
infix fun <A, B> A.to(that B) = Pair (this,that)

//Char extension functions isletter() isDigit() 
fun main(args: Array<String>) {
  println('a'.isLetter())  //true
  println('%'.isLetterOrDigit())  //false
}
fun Char.isLetter() = this in 'a'..'z' || this in 'A'..'Z'
fun Char.isLetterOrDigit() = isLetter()  || this in '0'..'9'
