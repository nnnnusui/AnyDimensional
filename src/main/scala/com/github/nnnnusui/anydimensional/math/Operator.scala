package com.github.nnnnusui.anydimensional.math

import com.github.nnnnusui.anydimensional.math.calculate.{Div, Minus, Plus, Times}

class Operator[Lhs, Out](lhs: Lhs){
  def +[Rhs](rhs: Rhs)(implicit convert: Rhs => Lhs, has: Plus[Lhs,Out] ): Out = has.plus(lhs, rhs)
  def -[Rhs](rhs: Rhs)(implicit convert: Rhs => Lhs, has: Minus[Lhs,Out]): Out = has.minus(lhs, rhs)
  def *[Rhs](rhs: Rhs)(implicit convert: Rhs => Lhs, has: Times[Lhs,Out]): Out = has.times(lhs, rhs)
  def /[Rhs](rhs: Rhs)(implicit convert: Rhs => Lhs, has: Div[Lhs,Out]  ): Out = has.div(lhs, rhs)
}
