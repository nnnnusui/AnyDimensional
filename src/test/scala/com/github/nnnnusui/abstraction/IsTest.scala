package com.github.nnnnusui.abstraction

import org.scalatest.FunSuite

class IsTest extends FunSuite {

  object A extends IsCompanion[Int]{
    override type IsType = A
  }
  case class A(value: Int) extends Is[Int]{
    override val isCompanion: IsCompanion[Int] = A
  }
//  implicit def isHasPlus[A: Plus, I[A] <: Is[A]](is: I[A]): Plus[I[A]] = (x: I[A], y: I[A]) => is.isCompanion.apply(implicitly[Plus[A]].plus(x.value, y.value))
  def catchInt(int: Int): Unit = println(int)
  def catchA(a: A): Unit = println(a)

  //  println(new A(1) + new A(1))
  catchInt(new A(1))
  catchA(1)

  object B extends IsCompanion[Int] {
    override type IsType = B
    override def apply(value: Int): B = new B(value)
  }
  class B(val value: Int) extends Is[Int] {
    override val isCompanion: IsCompanion[Int] = B
  }
  def catchB(b: B): Unit = println(b)

//  println(new B(1) + new B(2))
  catchInt(new B(22332))
  catchB(1)
}
