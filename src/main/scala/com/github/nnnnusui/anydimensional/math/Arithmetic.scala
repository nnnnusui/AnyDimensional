package com.github.nnnnusui.anydimensional.math

import com.github.nnnnusui.anydimensional.math.calculate.{Div, Minus, Plus, Times}

trait Arithmetic[-In, Out] extends Field[In, Out]
trait Field[-In, Out] extends Ring[In, Out]  with Div[In, Out]
trait Ring[-In, Out]  extends Group[In, Out] with Times[In, Out]
trait Group[-In, Out] extends Plus[In, Out] with Minus[In, Out]