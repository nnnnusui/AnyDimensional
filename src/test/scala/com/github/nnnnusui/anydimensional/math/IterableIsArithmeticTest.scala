package com.github.nnnnusui.anydimensional.math

import com.github.nnnnusui.anydimensional.math.calculate.Plus
import org.scalatest.FunSuite

class IterableIsArithmeticTest extends FunSuite {
//  implicit def vectorIsArithmetic[A, B <: Seq[A]](implicit integral: Plus[A]) = new SeqIsArithmetic[A, B]
//  val vec = Vector(1, 2, 3)
//  println(vec + Vector(2, 2, 4))
//
//  def test[A](seq: Seq[A]): Unit = println(seq)
//  test(Seq(1, 2, 3))
//  class Operator[A, B](lhs: A){
//    def +(rhs: A)(implicit has: Plus[A, B] ): B = has.plus(lhs, rhs)
//  }
//  implicit def makeOperator[A, In[_]](lhs: In[A]): Operator[In[A], Iterable[A]] = new Operator[In[A], Iterable[A]](lhs)


  println(new IterableIsArithmetic[Double, Iterable].plus(Seq(0x11), IndexedSeq(1)))
  implicit def iterableIsArithmetic[A, B[X] <: Iterable[X]](implicit integral: Plus[A, A]): IterableIsArithmetic[A, B] = new IterableIsArithmetic[A, B]
  println(Vector(1) + Vector(1))
  println(Seq(1) + Vector(1))

//  // 型コンストラクタ
//  type IntMap[A] = scala.collection.immutable.Map[Int, A]
//  type StringMap[A] = scala.collection.immutable.Map[String, A]
//
//  // ある型のMapにproxyするtrait
//  trait MapProxy[A,B, ReprMap[B] <: Map[A,B]] {
//    val underlying:ReprMap[B]
//  }
//  class StringMapProxy[A](elems:(String, A)*) extends MapProxy[String, A, StringMap]{
//    val underlying:StringMap[A] = Map(elems:_*)
//    def apply(key:String):A = underlying(key)
//  }
//  trait HasSeq[A, +S[A] <: Seq[_]]{
//    val seq: S[A]
//    def plus(y: )
//  }
//  class HasSeqTest[A] extends HasSeq[A, List]{
//    override val seq: List[A] = _
//  }
//
//  trait Low{
//    val t: Int
//  }
//  case class High(t: Int) extends Low

}
