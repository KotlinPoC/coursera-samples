// see PlaygroundChallenge.md 
//solution 1
fun isValidIdentifier1(s: String): Boolean {
     fun isValidChar(ch: Char) = 
	      ch == '_' || ch in '0'..'9' || ch in 'a'..'z'
				|| ch in 'A'..'Z'
	 if (s.isEmpty()) || s[0] in '0'..'9') return false					
	 for (ch in s) {
	    if (!isValidChar(ch)) return false
	}
	return true
}
// solution 2
fun isValidIdentifier(s: String): Boolean {
     fun isValidChar(ch: Char) = 
	      ch == '_' || ch.isLetterOrDigit()
	 if (s.isEmpty()) || s[0].isDigit()) return false					
	 for (ch in s) {
	    if (!isValidChar(ch)) return false
	}
	return true
}
		
fun main(args: Array<String>) {
   println(isValidIdentifier("name"))   // true
   println(isValidIdentifier("_name"))  // true
   println(isValidIdentifier("_12"))    // true
   println(isValidIdentifier(""))       // false
   println(isValidIdentifier("012"))    // false
   println(isValidIdentifier("no$"))    // false
}`
