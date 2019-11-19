package com.github.nnnnusui.anydimensional

import org.scalatest.{Matchers, WordSpec}
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class CoordinatesTest extends WordSpec with Matchers with ScalaCheckDrivenPropertyChecks {
//  "Coordinates(*)" should {
//    "Int" in
//      forAll { (vec: Vector[Int]) =>
//        println(Coordinates(vec))
//      }
//    "Double" in
//      forAll { (vec: Vector[Double]) =>
//        println(Coordinates(vec))
//      }
//  }
  val coord = Coordinates(1, 5)
  println(coord)
}
