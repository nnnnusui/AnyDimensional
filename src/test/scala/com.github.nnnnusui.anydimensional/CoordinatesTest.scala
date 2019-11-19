package com.github.nnnnusui.anydimensional

import org.scalatest.{Matchers, WordSpec}
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class CoordinatesTest extends WordSpec with Matchers with ScalaCheckDrivenPropertyChecks {
  "Coordinates(*)" should {
    "Int" in
      forAll { (vec: Vector[Int]) =>
        val coordinates = Coordinates(vec)
        println(coordinates)
      }
    "Double" in
      forAll { (vec: Vector[Double]) =>
        val coordinates = Coordinates(vec)
        println(coordinates)
      }
  }
  val coordinates = Coordinates(1, 5)
  println(coordinates(1))
}
