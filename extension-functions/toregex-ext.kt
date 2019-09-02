// extension functions extend the class

// you can look in the library or use completion in the ide for more

// using regex

fun main() {
  // val regex ="\\d{4}\\.\\d{2}\\.\\d{2}".toRegex()
  // YAY tripple quoted strings, no escapes necssary for special chars
  // no escapes for backslash in this example
  val regex ="""\d{4}\.\d{2}\.\d{2}""".toRegex()
  println(regex.matches("15.09.2019"))    // false
  println(regex.matches("19.09.15"))    // false
  println(regex.matches("2019.09.15"))    // false
}
