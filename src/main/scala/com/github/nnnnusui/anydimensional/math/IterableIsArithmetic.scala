package com.github.nnnnusui.anydimensional.math

import com.github.nnnnusui.anydimensional.math.calculate.Plus


trait IterableIsField[A, -S[X] <: Iterable[X]] extends Field[S[A], Iterable[A]]{
  implicit val has: Field[A, A]
  override def plus(x: S[A], y: S[A]): Iterable[A]
    = Seq.from(x.zip(y).map(it=> has.plus(it._1, it._2)))
  override def minus(x: S[A], y: S[A]): Iterable[A]
    = Seq.from(x.zip(y).map(it=> has.minus(it._1, it._2)))
  override def div(x: S[A], y: S[A]): Iterable[A]
    = Seq.from(x.zip(y).map(it=> has.div(it._1, it._2)))
  override def times(x: S[A], y: S[A]): Iterable[A]
    = Seq.from(x.zip(y).map(it=> has.times(it._1, it._2)))
}
class IterableIsArithmetic[A, B[X] <: Iterable[X]](implicit val has: Field[A, A]) extends IterableIsField[A, B]