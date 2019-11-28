package com.github.nnnnusui.anydimensional.math.calculation

trait Div[T] extends IsCalculation{
  def div(x: T, y: T): T
}
object Div{
  trait Operator[T] extends IsOperator[T]{
    def /[Right](rhs: Right)(implicit rToL: Right => T, has: Div[T]): T = has.div(lhs, rhs)
  }
}
