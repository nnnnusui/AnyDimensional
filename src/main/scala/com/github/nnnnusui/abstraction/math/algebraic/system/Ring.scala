package com.github.nnnnusui.abstraction.math.algebraic.system

import com.github.nnnnusui.abstraction.math.calculation.Times

trait Ring[T]  extends Group[T] with Times[T]
