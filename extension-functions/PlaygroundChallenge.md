# Challenge:   
change the sum function so that it is declared as an extension to List<Int>

https://www.coursera.org/learn/kotlin-for-java-developers/ungradedWidget/drdf0/kotlin-playground-sum-as-an-extension-function

```
fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}
```

```
fun main(args: Array<String>) {
    val sum = sum(listOf(1, 2, 3))
    println(sum)    // 6
}
```
