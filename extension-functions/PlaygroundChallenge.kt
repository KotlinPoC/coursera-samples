// see PlaygroundChallenge.md 
/*
fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}
*/
fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}
    
fun main(args: Array<String>) {
    //val sum = sum(listOf(1, 2, 3))
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}
