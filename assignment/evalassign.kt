// number of chars the same
// number of chars in the right order
fun eval(S1: String, S2: String): Pair<Int, Int> {
     var countPosMatch = 0
     var countLetterMatch = 0
     val A: String
     val B: String

     if (S1.equals(S2)) return Pair(S1.length,S1.length) 
     if (S1.length > S2.length) { 
        A = S2 ; B = S1
     } else { 
        B = S2 ; A = S1
     }
          
     for (i in 0..A.length-1) { 
        if (A.get(i).compareTo(B.get(i)) == 0) {
                countPosMatch++
		countLetterMatch++
        } else if (B.contains(A.get(i))) {
		countLetterMatch++
        }
    }
     return Pair(countLetterMatch, countPosMatch)
} 
    

fun main() {
    println (eval("abcd", "abcd"))   // 4, 4
    println (eval("xbcd", "abcd"))   // 3, 3
    println (eval("bcda", "abcd"))   // 4, 0
    println (eval("cda", "abcd"))   // 4, 0
    println (eval("cda", "ab"))   // 4, 0
}
