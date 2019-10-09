class Assertion<T>(private val target: T) {
    infix fun isEqualTo(other: T) {
        Assert.assertEquals(other, target)
    }
 
    infix fun isDifferentFrom(other: T) {
        Assert.assertNotEquals(other, target)
    }
}
fun main() {
  val result = Assertion(5)
  result isEqualTo 5 // This passes
  result isEqualTo 6 // This fails the assertion
  result isDifferentFrom 5 // This also fails the assertion
}
