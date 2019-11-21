package com.github.nnnnusui.anydimensional.math

trait Arithmetic[T] extends Field[T]

/* MEMO:
 * extends ではなく implicit であるべきな気もする。
 */
/* 群 */trait Group[T] extends Addition[T] with Subtraction[T]
/* 環 */trait Ring[T] extends Group[T] with Multiplication[T] with Negate[T]
/* 体 */trait Field[T] extends Ring[T] with Division[T]

trait Addition[T] {
  // identity element = 1
  def plus(x: T, y: T): T
}
trait Subtraction[T] {
  def minus(x: T, y: T): T
}
trait Multiplication[T]{
  def times(x: T, y: T): T
}
trait Division[T]{
  def div(x: T, y: T): T
}

trait Negate[T]{
  def negate(x: T): T
}