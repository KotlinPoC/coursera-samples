open class Parent 
class Child: Parent()
 
fun Parent.foo() = "Parent" 
fun Child.foo() = "Child"
 
fun main() { 
  val parent: Parent = Child()
  println(parent.foo()) 
}

// similar code in java
/*
public static String foo(Parent parent) { return "Parent"; }
public static String foo(Child child) { return "Child"; }
 
public static void main(String[] args) { 
  //Parent parent = new Child()
  Parent parent = (new Random().nextBoolean()) ? new Parent() : new Child()
  System.out.println(foo(parent))) 
}
*/
