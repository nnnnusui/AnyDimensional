package com.github.nnnnusui.anydimensional

import com.github.nnnnusui.anydimensional.math.{Arithmetic, Field}

object Coordinates{
  implicit def coordinatesIsArithmetic[A](implicit has: Arithmetic[A, A]): CoordinatesIsArithmetic[A] = new CoordinatesIsArithmetic[A]
  def apply[A](values: A*)(implicit numeric: Numeric[A]): Coordinates[A] = Coordinates(values.toVector)
}
case class Coordinates[A](value: Vector[A]) extends Is[Vector[A]]{
  override def toString: String = s"${this.getClass.getSimpleName}(${value.mkString(", ")})"
}
trait CoordinatesIsField[A] extends Arithmetic[Coordinates[A], Coordinates[A]]{
  implicit val has: Field[A, A]
  override def plus( x: Coordinates[A], y: Coordinates[A]): Coordinates[A]
    = Coordinates(Vector.from(x.value.zip(y.value).map(it=> has.plus(it._1, it._2))))
  override def minus(x: Coordinates[A], y: Coordinates[A]): Coordinates[A]
    = Coordinates(Vector.from(x.value.zip(y.value).map(it=> has.minus(it._1, it._2))))
  override def times(x: Coordinates[A], y: Coordinates[A]): Coordinates[A]
    = Coordinates(Vector.from(x.value.zip(y.value).map(it=> has.times(it._1, it._2))))
  override def div(  x: Coordinates[A], y: Coordinates[A]): Coordinates[A]
    = Coordinates(Vector.from(x.value.zip(y.value).map(it=> has.div(it._1, it._2))))
}
class CoordinatesIsArithmetic[A](implicit val has: Arithmetic[A, A]) extends CoordinatesIsField[A]