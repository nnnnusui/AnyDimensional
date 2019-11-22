package com.github.nnnnusui.anydimensional.math

import com.github.nnnnusui.anydimensional.math.calculate.{Div, Minus, Plus, Times}

class Operator[A](lhs: A){
  def +(rhs: A)(implicit has: Plus[A,A] ): A = has.plus(lhs, rhs)
  def -(rhs: A)(implicit has: Minus[A,A]): A = has.minus(lhs, rhs)
  def *(rhs: A)(implicit has: Times[A,A]): A = has.times(lhs, rhs)
  def /(rhs: A)(implicit has: Div[A,A]  ): A = has.div(lhs, rhs)
}
