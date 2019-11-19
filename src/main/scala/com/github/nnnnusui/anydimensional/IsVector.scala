package com.github.nnnnusui.anydimensional

trait IsVector[A]{
  val values: Vector[A]
  override def toString: String = s"${this.getClass.getSimpleName}(${values.mkString(", ")})"
}
