package com.github.nnnnusui.anydimensional.math

import org.scalatest.FunSuite

class IterableIsArithmeticTest extends FunSuite {

  implicit def iterableIsArithmetic[A, B[X] <: Iterable[X]](implicit integral: Field[A, A]): IterableIsArithmetic[A, B] = new IterableIsArithmetic[A, B]
  println(Vector(1) + Vector(1, 1))
  println(Seq(1, 1) + Vector(1))
  println(Seq(1, 1) + Seq(1, 1))
  println(Vector(1, 2, 3) + Seq(1, 2, 3).toVector)
  println(Vector(3.1415) - Vector(2, 2))
  println(Vector(5, 8, 5) - Seq(2, 5, 1).toVector)
  println(Vector(3.0, 3.0, 3.0, 4.8) - Vector(2.2, 2.2, 33.3, 1))
  println(Vector(3.0, 3.0, 3.0, 4.8) * Vector(2.2, 2.2, 33.3, 1))
  println(Vector(3.0, 3.0, 3.0, 4.8) / Vector(2.2, 2.2, 33.3, 1))

  // Error
  println(Vector(5, 8, 5) + Seq(2, 5, 1))
  println(Vector(5, 8, 5) - Seq(2, 5, 1))
  println(Vector(3.0, 3.0) + Vector(2, 2))
  println(Vector(3.0, 3.0) - Vector(2, 2))
}
