package com.github.nnnnusui.anydimensional.math

import org.scalatest.FunSuite

class IterableIsArithmeticTest extends FunSuite {

//  implicit def isConvertable[A, B, I[X] <: Iterable[X]](from: I[A])(implicit f: A => B): Iterable[B] = from.map(it=> f(it))
//
//
//  implicit class Convertable[Lhs[_] <: Iterable[_], A](lhs: Lhs[A]){
//    def isConvertable[Rhs[X] >: Iterable[X], B](rhs: Rhs[B])(implicit f: B => A): Rhs[A] = lhs.map(it=> f(it))
//  }
//  println(1.isConvertable(2.0))
//  implicit class ConvVec[A](lhs: Vector[A]){
//    implicit def conv[B](rhs: Vector[B])(implicit f: B => A): Vector[A] = rhs.map(it=>f(it))
//  }
  println(Vector(1) + Vector(1, 1))
  println(Seq(1, 1) + Vector(1))
  println(Seq(1, 1) + Seq(1, 1))
//  println(Vector(1, 2, 3) + Seq(1, 2, 3)) //err
  println(Vector(5, 8, 5) - Seq(2, 5, 1).toVector)
//  println(Vector(3.1415) - Vector(2, 2)) //err
  println(Vector(3.0, 3.0, 3.0, 4.8) - Vector(2.2, 2.2, 33.3, 1))
  println(Vector(3.0, 3.0, 3.0, 4.8) * Vector(2.2, 2.2, 33.3, 1))
  println(Vector(3.0, 3.0, 3.0, 4.8) / Vector(2.2, 2.2, 33.3, 1))
//
//  // Error
//  println(Vector(5, 8, 5) + Seq(2, 5, 1))
//  println(Vector(5, 8, 5) - Seq(2, 5, 1))
//  println(Vector(2, 2) + Vector(3.0, 3.0))
//  println(Vector(3.0, 3.0) - Vector(2, 2))
}
