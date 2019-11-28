package com.github.nnnnusui.anydimensional.math.calculate

class PlusTest extends org.scalatest.FunSuite {
  case class I(value: Int)
  implicit val aHasPlus: Plus[I] = (x: I, y: I) => I(x.value + y.value)

  class PlusOperator[A: Plus](lhs: A){
    def +(rhs: A): A = implicitly[Plus[A]].plus(lhs, rhs)
  }

  val plop = new PlusOperator[I](I(1))
  println(plop + I(2))
}
