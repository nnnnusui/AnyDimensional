package com.github.nnnnusui.abstraction.math.calculation

class PlusTest extends org.scalatest.FunSuite {
  import com.github.nnnnusui.abstraction.math.implicits._

  case class I(value: Int)
  implicit val iHasPlus: Plus[I] = (x: I, y: I) => I(x.value + y.value)
  I(1) + I(1)

}
