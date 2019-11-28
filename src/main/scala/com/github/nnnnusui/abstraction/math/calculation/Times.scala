package com.github.nnnnusui.abstraction.math.calculation

trait Times[T] extends IsCalculation{
  def times(x: T, y: T): T
}
object Times{
  trait Operator[T] extends IsOperator[T]{
    def *[Right](rhs: Right)(implicit rToL: Right => T, has: Times[T]): T = has.times(lhs, rhs)
  }
}
