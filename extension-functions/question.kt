// in StringUtil.kt
fun String.repeat(n: Int): String {
  val sb = StringBuilder(n*length)
  for (i in 1..n) { sb.append(this) }
  return sb.toString()
}
// how many args if called from java ??  1, 2 or 3
// has 2 arguments  (answer

// why?
// when this is compiled to a static function the
//  reciever (String) is transformed to the extra, first param


StringUtil.repeat("abc",2);   // abcabc 

// is it possible to call a private member of STring inside an extension function to STring? 

// no (ans
// in java you can't call a private member from a static function of another class

