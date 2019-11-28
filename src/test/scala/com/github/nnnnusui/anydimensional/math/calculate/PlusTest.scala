package com.github.nnnnusui.anydimensional.math.calculate

class PlusTest extends org.scalatest.FunSuite {
  case class I(value: Int)
  implicit val iHasPlus: Plus[I] = (x: I, y: I) => I(x.value + y.value)

  case class J(value: Int)
  implicit val jHasPlus: Plus[J] = (x: J, y: J) => J(x.value + y.value)

  implicit class EnrichPlusOperator[A: Plus](lhs: A){
    def +(rhs: A): A = implicitly[Plus[A]].plus(lhs, rhs)
  }

  println(I(1) + I(2))
  println(J(2) + J(4))

  implicit def JToI(j: J): I = I(j.value)
  println(I(2) + JToI(J(4)))
  println(I(2) + J(4)) // error
}
