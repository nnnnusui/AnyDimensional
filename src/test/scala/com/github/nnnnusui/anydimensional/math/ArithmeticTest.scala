package com.github.nnnnusui.anydimensional.math

import org.scalatest.FunSuite

import scala.math.Fractional

class ArithmeticTest extends FunSuite {

  def arithmetic[T](value: T)(implicit arithmetic: Arithmetic[T]): Unit = println(s"$value is arithmetic. ${arithmetic.plus(value, value)}")

  abstract class FractionalIsArithmetic[T](implicit fractional: Fractional[T]) extends Arithmetic[T]{
    override def plus(x: T, y: T): T = fractional.plus(x, y)
    override def minus(x: T, y: T): T = fractional.minus(x, y)
    override def times(x: T, y: T): T = fractional.times(x, y)
    override def div(x: T, y: T): T = fractional.div(x, y)
    override def negate(x: T): T = fractional.negate(x)
  }
  implicit object FractionalDoubleIsArithmetic extends FractionalIsArithmetic[Double]

  arithmetic(2.2)
}
