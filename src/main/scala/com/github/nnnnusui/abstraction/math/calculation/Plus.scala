package com.github.nnnnusui.abstraction.math.calculation

trait Plus[T] extends IsCalculation{
  def plus(x: T, y: T): T
}
object Plus{
  trait Operator[T] extends IsOperator[T]{
    def +[Right](rhs: Right)(implicit rToL: Right => T, has: Plus[T]): T = has.plus(lhs, rhs)
  }
}
