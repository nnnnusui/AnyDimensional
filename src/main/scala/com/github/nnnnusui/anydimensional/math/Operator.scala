package com.github.nnnnusui.anydimensional.math

import com.github.nnnnusui.anydimensional.math.calculate.{Div, Minus, Plus, Times}

class Operator[In, Out](lhs: In){
  def +(rhs: In)(implicit has: Plus[In,Out] ): Out = has.plus(lhs, rhs)
  def -(rhs: In)(implicit has: Minus[In,Out]): Out = has.minus(lhs, rhs)
  def *(rhs: In)(implicit has: Times[In,Out]): Out = has.times(lhs, rhs)
  def /(rhs: In)(implicit has: Div[In,Out]  ): Out = has.div(lhs, rhs)
}
