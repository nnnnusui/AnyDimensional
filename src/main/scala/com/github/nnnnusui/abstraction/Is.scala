package com.github.nnnnusui.abstraction

trait Is[T]{
  val value: T
  val isCompanion: IsCompanion[T]
}
