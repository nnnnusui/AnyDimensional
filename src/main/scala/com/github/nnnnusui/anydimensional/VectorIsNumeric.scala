package com.github.nnnnusui.anydimensional

trait VectorIsNumeric[A] extends HasNumeric[A]
                            with Numeric[Vector[A]]{
  override def plus(x: Vector[A], y: Vector[A]): Vector[A]
    = Vector.from(x.zip(y).map(it=> numeric.plus(it._1, it._2)))
  override def minus(x: Vector[A], y: Vector[A]): Vector[A]
    = Vector.from(x.zip(y).map(it=> numeric.minus(it._1, it._2)))
  override def times(x: Vector[A], y: Vector[A]): Vector[A]
    = Vector.from(x.zip(y).map(it=> numeric.times(it._1, it._2)))
  override def negate(x: Vector[A]): Vector[A]
    = Vector.from(x.map(it=> numeric.negate(it)))

  override def fromInt(x: Int): Vector[A] = Vector(numeric.fromInt(x))
  override def parseString(str: String): Option[Vector[A]] = ???
  //  {
  //    val parsed = str.split(',').map(it=> numeric.parseString(it))
  //    if (parsed.exists(_.isEmpty)) None
  //    Some(parsed.map(_.get).toVector) // No ClassTag available for A
  //  }

  override def toInt(x: Vector[A]): Int = ???
  override def toLong(x: Vector[A]): Long = ???
  override def toFloat(x: Vector[A]): Float = ???
  override def toDouble(x: Vector[A]): Double = ???
  override def compare(x: Vector[A], y: Vector[A]): Int = ???
}