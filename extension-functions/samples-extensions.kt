// extension functions extend the class

fun String.lastChar() = this.get(this.length -1)
// this can be omitted  fun String.lastChar() = get(length -1)
fun String.firstChar() = this.get(0)

fun main() {
  val c: Char = "abcdefg".lastChar()
  val cf: Char = "abcdefg".firstChar()
  println("last char $c") 
  println("first char $cf") }
