package com.github.nnnnusui.abstraction.math

import com.github.nnnnusui.abstraction.math.calculation.{Div, Minus, Plus, Times}

package object implicits {
  implicit class ImplicitOperator[T](override val lhs: T)
    extends Plus.Operator[T]
       with Minus.Operator[T]
       with Times.Operator[T]
       with Div.Operator[T]
}
