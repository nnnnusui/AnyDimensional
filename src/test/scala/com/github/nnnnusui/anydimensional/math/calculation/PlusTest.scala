package com.github.nnnnusui.anydimensional.math.calculation

class PlusTest extends org.scalatest.FunSuite {
  import com.github.nnnnusui.anydimensional.math.implicits._
  case class I(value: Int)
  implicit val iHasPlus: Plus[I] = (x: I, y: I) => I(x.value + y.value)
  case class J(value: Double)
  implicit val jHasPlus: Plus[J] = (x: J, y: J) => J(x.value + y.value)

  implicit def iToJ(i: I): J = J(i.value)
  implicit def jToI(j: J): I = I(j.value.toInt)

  implicit def iterableHasPlus[A, B[X] <: Iterable[X]](implicit has: Plus[A]): Plus[B[A]]
    = (x: B[A], y: B[A]) => x.zip(y).map(it => has.plus(it._1, it._2)).asInstanceOf[B[A]]
  implicit def iterableParameterImplicitConversion[A, B, C[X] <: Iterable[X]](before: C[A])(implicit converter: A => B): C[B]
    = before.map(it=> converter(it)).asInstanceOf[C[B]]

  /* iterable's parameter implicit conversion
   * if (implicitly[I => J])
   *   Iterable[I] => Iterable[J] is implicitly
   */
  val iSeq: Seq[I] = Seq(I(1), I(1), I(2))
  println(iSeq + iSeq)
  val jSeq: Seq[J] = Seq(J(1.2), J(2.4), J(3.2))
  println(jSeq + jSeq)
  println(iSeq + jSeq)
  println(jSeq + iSeq)

  def intVec(v: Vector[J]): Vector[J] = v
  intVec(Vector(I(1), I(2), I(3)))
}
