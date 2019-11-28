package com.github.nnnnusui.anydimensional.math.calculate

class PlusTest extends org.scalatest.FunSuite {
  case class I(value: Int)
  implicit val aHasPlus: Plus[I] = (x: I, y: I) => I(x.value + y.value)
  println(aHasPlus.plus(I(1), I(2)))
}
