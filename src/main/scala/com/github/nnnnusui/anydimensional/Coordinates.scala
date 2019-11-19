package com.github.nnnnusui.anydimensional

object Coordinates{
  def apply[A](values: A*)(implicit numeric: Numeric[A]): Coordinates[A] = Coordinates(values.toVector)

  implicit def toVector[A](that: Coordinates[A])(implicit numeric: Numeric[A]): Vector[A] = that.values
  implicit def fromVector[A](that: Vector[A])(implicit numeric: Numeric[A]): Coordinates[A] = Coordinates(that)
}
case class Coordinates[A](values: Vector[A])(implicit numeric: Numeric[A]){
  val dimension = values.size

  object VectorIsNumeric extends VectorIsNumeric[A]
  def +(x: Coordinates[A]): Coordinates[A] = VectorIsNumeric.plus(this, x)

  override def toString: String = s"${this.getClass.getSimpleName}(${values.mkString(", ")})"
}
