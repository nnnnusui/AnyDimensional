package com.github.nnnnusui.anydimensional

import org.scalatest.{Matchers, WordSpec}
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class CoordinatesTest extends WordSpec with Matchers with ScalaCheckDrivenPropertyChecks {

  val coord1 = Coordinates(1, 2, 3)
  val coord2 = Coordinates(4, 5, 6)

  import math._
  println(coord1 + coord2)
  println(coord1.value + coord2.value)
}
