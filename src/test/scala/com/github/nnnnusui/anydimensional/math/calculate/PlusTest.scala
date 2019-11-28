package com.github.nnnnusui.anydimensional.math.calculate

class PlusTest extends org.scalatest.FunSuite {
  case class I(value: Int)
  implicit val iHasPlus: Plus[I] = (x: I, y: I) => I(x.value + y.value)

  case class J(value: Double)
  implicit val jHasPlus: Plus[J] = (x: J, y: J) => J(x.value + y.value)

  implicit class EnrichPlusOperator[Left](lhs: Left){
    def +[Right: Plus](rhs: Right)(implicit lToR: Left => Right): Right = implicitly[Plus[Right]].plus(lhs, rhs)
  }

  println(I(1) + I(2))
  println(J(2) + J(4))

  implicit def IToJ(i: I): J = J(i.value)
  implicit def JToI(j: J): I = I(j.value.toInt)

  println(I(2) + J(4))
  println(J(2) + I(4))
}
