package com.github.nnnnusui.anydimensional.math.calculation

trait Minus[T] extends IsCalculation{
  def minus(x: T, y: T): T
}
object Minus{
  trait Operator[T] extends IsOperator[T]{
    def -[Right](rhs: Right)(implicit rToL: Right => T, has: Minus[T]): T = has.minus(lhs, rhs)
  }
}
