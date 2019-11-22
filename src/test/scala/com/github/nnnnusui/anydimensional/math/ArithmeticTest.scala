package com.github.nnnnusui.anydimensional.math

import com.github.nnnnusui.anydimensional.{ConvertibleIs, Is}
import com.github.nnnnusui.anydimensional.math.calculate.{Div, Plus}
import org.scalatest.FunSuite

class ArithmeticTest extends FunSuite {
//  trait XIsArithmetic extends Arithmetic[X]{
//    import X.toValue
//    override def plus(x: X, y: X): X = x + y
//    override def minus(x: X, y: X): X = x - y
//    override def times(x: X, y: X): X = x * y
//    override def div(  x: X, y: X): X = x / y
//  }
//  implicit object XIsArithmetic extends XIsArithmetic

  object X extends ConvertibleIs[X, Int]
  case class X(value: Int) extends Is[Int]
//  import math._
  import X.{toValue, fromValue}
  println(X(1) + X(2))
  println(X(1) - X(2))
  println(X(1) * X(2))
  println(X(5) / X(2))

  def test[A, B](value: A)(implicit ev$1: A => B): Unit = println(value)
  test(X(1))
}
