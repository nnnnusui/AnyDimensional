package com.github.nnnnusui.abstraction

trait IsCompanion[T]{
  type IsType <: Is[T]
  def apply(value: T): IsType
  implicit def toIs(value: T): IsType = apply(value)
  implicit def fromIs(is: IsType): T = is.value
}
