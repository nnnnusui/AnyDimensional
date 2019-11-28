package com.github.nnnnusui.abstraction.math.algebraic.system

import com.github.nnnnusui.abstraction.math.calculation.{Minus, Plus}

trait Group[T] extends Plus[T] with Minus[T]
