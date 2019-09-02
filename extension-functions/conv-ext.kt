// extension functions extend the class

// you can look in the library or use completion in the ide for more

//  conversion to numbers

fun main() {
     println("123456".toInt())    // 123456
     println("1e-10".toDouble())
     println("12".toLong())    //12L
     println("12.5".toFloat())    //12.5F
     try {
     println("xx".toInt())    //NumberFormatException
     } catch (e: NumberFormatException) {  
		println("NumberFormatException") } 
     println("123".toIntOrNull())    // 123456
     println("xx".toIntOrNull())    // null
}
