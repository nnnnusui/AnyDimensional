package com.github.nnnnusui.anydimensional

package object math {
  implicit def makeOperator[A](lhs: A): Operator[A] = new Operator[A](lhs)

  implicit def integralIsArithmetic[A](implicit integral: Integral[A]): ImplicitArithmetic.IntegralIsArithmetic[A]
    = new ImplicitArithmetic.IntegralIsArithmetic[A]
  implicit def fractionalIsArithmetic[A](implicit fractional: Fractional[A]): ImplicitArithmetic.FractionalIsArithmetic[A]
    = new ImplicitArithmetic.FractionalIsArithmetic[A]

  object ImplicitArithmetic{
    trait NumericIsRing[T] extends Ring[T]{
      implicit val has: Numeric[T]
      override def plus(x: T, y: T): T = has.plus(x, y)
      override def minus(x: T, y: T): T = has.minus(x, y)
      override def times(x: T, y: T): T = has.times(x, y)
    }
    trait IntegralIsField[T] extends Field[T] with NumericIsRing[T]{
      implicit val has: Integral[T]
      override def div(x: T, y: T): T = has.quot(x, y)
    }
    trait FractionalIsField[T] extends Field[T] with NumericIsRing[T]{
      implicit val has: Fractional[T]
      override def div(x: T, y: T): T = has.div(x, y)
    }
    class IntegralIsArithmetic[T](implicit val has: Integral[T]) extends Arithmetic[T] with IntegralIsField[T]
    class FractionalIsArithmetic[T](implicit val has: Fractional[T]) extends Arithmetic[T] with FractionalIsField[T]
  }
}
