package com.github.nnnnusui.anydimensional

object Coordinates{
  def apply[A](values: A*)(implicit numeric: Numeric[A]): Coordinates[A] = Coordinates(values.toVector)
}
case class Coordinates[A](values: Vector[A])(implicit numeric: Numeric[A]){
  val dimension = values.size

  override def toString: String = s"${this.getClass.getSimpleName}(${values.mkString(", ")})"
}
