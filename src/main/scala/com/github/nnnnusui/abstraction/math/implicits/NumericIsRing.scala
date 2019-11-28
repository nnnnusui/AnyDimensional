package com.github.nnnnusui.abstraction.math.implicits

import com.github.nnnnusui.abstraction.math.algebraic.system.Ring

trait NumericIsRing[T] extends Ring[T]{
  implicit val has: Numeric[T]
  override def plus(x: T, y: T): T = has.plus(x, y)
  override def minus(x: T, y: T): T = has.minus(x, y)
  override def times(x: T, y: T): T = has.times(x, y)
}
