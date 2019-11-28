package com.github.nnnnusui.abstraction.math.implicits

import com.github.nnnnusui.abstraction.math.calculation.{Minus, Plus, Times}
import org.scalatest.FunSuite

class packageTest extends FunSuite {
  import com.github.nnnnusui.abstraction.math.implicits._

  case class I(value: Int)
  implicit val iHasPlus: Plus[I] = (x: I, y: I) => I(x.value + y.value)
  case class J(value: Double)
  implicit val jHasPlus: Plus[J] = (x: J, y: J) => J(x.value + y.value)

  implicit def iToJ(i: I): J = J(i.value)
  implicit def jToI(j: J): I = I(j.value.toInt)

  { // iterable's implicit def
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
  {
    val iSeq = Seq(1, 1, 2)
    val jSeq = Seq(1.2, 2.4, 3.2)
//    val a = numericHasPlus(1)
//    println(a.plus(1, 2))
//    implicit def intHasPlus: Plus[Int] = (x: Int, y: Int)=> x + y

    println(iSeq + iSeq)
    println(iSeq * iSeq)
    println(jSeq * jSeq)
  }
}
