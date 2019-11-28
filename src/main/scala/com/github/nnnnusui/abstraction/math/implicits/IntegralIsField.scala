package com.github.nnnnusui.abstraction.math.implicits

import com.github.nnnnusui.abstraction.math.algebraic.system.Field

trait IntegralIsField[T] extends NumericIsRing[T] with Field[T]{
  override implicit val has: Integral[T]
  override def div(x: T, y: T): T = has.quot(x, y)
}
