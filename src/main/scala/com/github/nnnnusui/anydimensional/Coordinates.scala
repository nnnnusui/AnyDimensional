package com.github.nnnnusui.anydimensional

object Coordinates{
  def apply[A](values: A*)(implicit numeric: Numeric[A]): Coordinates[A] = Coordinates(values.toVector)
}
case class Coordinates[A](value: Vector[A])(implicit numeric: Numeric[A]) extends Is[Vector[A]]{
  object Convert extends ConvertibleIs[Coordinates[A], Vector[A]] {
    override def apply(value: Vector[A]): Coordinates[A] = Coordinates(value)
  }

  import Convert.{toValue, fromValue}
  object VectorIsNumeric extends VectorIsNumeric[A]
  def +(x: Coordinates[A]): Coordinates[A] = VectorIsNumeric.plus(this, x)

  override def toString: String = s"${this.getClass.getSimpleName}(${value.mkString(", ")})"
}