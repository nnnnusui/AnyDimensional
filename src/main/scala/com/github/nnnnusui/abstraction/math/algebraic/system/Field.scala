package com.github.nnnnusui.abstraction.math.algebraic.system

import com.github.nnnnusui.abstraction.math.calculation.Div

trait Field[T] extends Ring[T]  with Div[T]
