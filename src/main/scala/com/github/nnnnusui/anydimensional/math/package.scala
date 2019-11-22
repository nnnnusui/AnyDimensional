package com.github.nnnnusui.anydimensional

package object math {
  implicit def makeOperator[A](lhs: A): Operator[A] = new Operator[A](lhs)
}
