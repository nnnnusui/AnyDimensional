package com.github.nnnnusui.abstraction.math

import com.github.nnnnusui.abstraction.math.calculation.{Div, Minus, Plus, Times}

package object implicits {
  implicit class ImplicitOperator[T](override val lhs: T)
    extends Plus.Operator[T]
       with Minus.Operator[T]
       with Times.Operator[T]
       with Div.Operator[T]

  implicit def iterableHasPlus[A, B[X] <: Iterable[X]](implicit has: Plus[A]): Plus[B[A]]
    = (x: B[A], y: B[A]) => x.zip(y).map(it => has.plus(it._1, it._2)).asInstanceOf[B[A]]
  implicit def iterableParameterImplicitConversion[A, B, C[X] <: Iterable[X]](before: C[A])(implicit converter: A => B): C[B]
    = before.map(it=> converter(it)).asInstanceOf[C[B]]
}
