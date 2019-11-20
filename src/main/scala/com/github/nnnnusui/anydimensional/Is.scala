package com.github.nnnnusui.anydimensional

trait Is[A]{
//  type self = A
  val value: A
}
trait CompanionIs[IsA <: Is[A], A]{
  def apply(value: A): IsA
  implicit def toValue(that: IsA): A = that.value
  implicit def fromValue(that: A): IsA = apply(that)
}
