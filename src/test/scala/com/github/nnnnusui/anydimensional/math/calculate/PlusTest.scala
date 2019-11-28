package com.github.nnnnusui.anydimensional.math.calculate

class PlusTest extends org.scalatest.FunSuite {
  case class I(value: Int)
  implicit val iHasPlus: Plus[I] = (x: I, y: I) => I(x.value + y.value)
  case class J(value: Double)
  implicit val jHasPlus: Plus[J] = (x: J, y: J) => J(x.value + y.value)

  implicit class EnrichPlusOperator[T](lhs: T){
    def +[Right](rhs: Right)(implicit rToL: Right => T, has: Plus[T]): T = has.plus(lhs, rhs)
  }

  implicit def iterableHasPlus[A, B[X] <: Iterable[X]](implicit has: Plus[A]): Plus[B[A]] = (x: B[A], y: B[A]) => x.zip(y).map(it => has.plus(it._1, it._2)).asInstanceOf[B[A]]

  /* Arithmetic iterable
   * Iterable -> Seq -> List
   * Iterable -> IndexedSeq -> Vector
   *  allow: -T
   *  deny : +T
   */
  val i = Iterable(I(1), I(1), I(2))
  println(i.toIterable + i.toIterable)
  println(i.toIterable + i.toSeq     )
  println(i.toIterable + i.toList    )
  println(i.toSeq      + i.toIterable) //error: NotImplicitly[Iterable => Seq]
  println(i.toSeq      + i.toSeq     )
  println(i.toSeq      + i.toList    )
  println(i.toList     + i.toIterable) //error: NotImplicitly[Iterable => List]
  println(i.toList     + i.toSeq     ) //error: NotImplicitly[Seq => List]
  println(i.toList     + i.toList    )
  println(i.toIterable + i.toIndexedSeq)
  println(i.toIterable + i.toVector    )
  println(i.toIndexedSeq + i.toIndexedSeq)
  println(i.toIndexedSeq + i.toVector    )
  println(i.toVector + i.toIndexedSeq) //error: NotImplicitly[IndexedSeq => Vector]
  println(i.toVector + i.toVector    )

}
