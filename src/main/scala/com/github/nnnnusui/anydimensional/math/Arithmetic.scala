package com.github.nnnnusui.anydimensional.math

import com.github.nnnnusui.anydimensional.math.calculate.{Div, Minus, Plus, Times}

trait Arithmetic[T] extends Field[T]
trait Field[T] extends Ring[T]  with Div[T]
trait Ring[T]  extends Group[T] with Times[T]
trait Group[T] extends Plus[T] with Minus[T]