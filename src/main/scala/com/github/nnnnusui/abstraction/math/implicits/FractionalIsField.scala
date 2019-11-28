package com.github.nnnnusui.abstraction.math.implicits

import com.github.nnnnusui.abstraction.math.algebraic.system.Field

trait FractionalIsField[T] extends NumericIsRing[T] with Field[T]{
  override implicit val has: Fractional[T]
  override def div(x: T, y: T): T = has.div(x, y)
}
