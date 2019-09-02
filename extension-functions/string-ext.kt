// extension functions extend the class

// you can look in the library or use completion in the ide for more

// formatinng multi line strings

fun main() {

  // indent sometimes needed but becomes part of string
  val str = """To code,
	or not to code"""
  println (str)
  // use trimMargin to get rid of it
  val str2 = """To code,
	#or not to code""".trimMargin(marginPrefix = "#")
  println (str2)

  // use trimMargin to get rid of it
  val str3 = """To code,
	|or not to code""".trimMargin()
  println (str3)

  // use trimIndent() if all are same indent
  val str4 = """
	Keep calm
	and learn Kotlin""".trimIndent()
  println (str4)
  // use trimIndent() if all are same indent
  val str5 = """
	Keep calm
forget Java
	and learn Kotlin""".trimIndent()
  println (str5)
}
// result
To code,
	or not to code
To code,
or not to code
To code,
or not to code
Keep calm
and learn Kotlin
	Keep calm
forget Java
	and learn Kotlin
