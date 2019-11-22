package com.github.nnnnusui.anydimensional.math


trait Plus[-In, +Out]{
  def plus(x: In, y: In): Out
}
trait IterableIsField[A, -S[A] <: Iterable[A]] extends Plus[S[A], Iterable[A]]{
  implicit val has: Plus[A, A]
  override def plus(x: S[A], y: S[A]): Iterable[A]
  = Seq.from(x.zip(y).map(it=> has.plus(it._1, it._2)))
}
class IterableIsArithmetic[A, B[A] <: Iterable[A]](implicit val has: Plus[A, A]) extends IterableIsField[A, B]

//class VectorIsArithmetic[A, S](implicit val has: Plus[A, A]) extends SequenceIsField[A, S]
//trait VectorIsField[T] extends Plus[B]{
//  implicit val has: Plus[T]
//  override def plus(x: B, y: B): B
//    = Seq.from(x.zip(y).map(it=> has.plus(it._1, it._2)))
////  override def minus(x: Vector[A], y: Vector[A]): Vector[A] = ???
////  override def times(x: Vector[A], y: Vector[A]): Vector[A] = ???
////  override def div(x: Vector[A], y: Vector[A]): Vector[A] = ???
//}
//class VectorIsArithmetic[A](implicit val has: Plus[A]) extends VectorIsField[A]