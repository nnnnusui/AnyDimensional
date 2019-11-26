package com.github.nnnnusui.anydimensional

import org.scalatest.FunSuite

class IsTest extends FunSuite {
  implicit def isTo[A, I <: Is[A]](src: I): A = src.value

  object Test1 extends ConvertibleIs[Test1, Int]
  case class Test1(value: Int) extends Is[Int]
  object Test2 extends ConvertibleIs[Test2, Int]
  case class Test2(value: Int) extends Is[Int]

  val test1 = Test1(4)
  val test2 = Test2(5)
  println(3 + test1)

  {
    def testMethod(value: Test1): Unit = println(value)
    testMethod(4) // implicit conversion
  }

  def testMethod(value: Test1): Unit = println(value)
  def testMethod(value: Test2): Unit = println(value)
  testMethod(Test2.fromValue(3)) // explicit conversion
  /* implicit conversion can't overload
   *   testMethod(3) // Compile Error
   */

  { /* WARNING:
     *   -> import XXX.toValue (XXX <: CompanionIs[Is[_], _])
     *   It will conflict if you describe this more than once.
     */
    import Test1.toValue
    println(test1 + test1)
    println(test1 + test2)

    { // Compile Error
//      import Test1.toValue
//      import Test2.toValue
//      println(test2 + test1)
    }
  }

}
