package com.github.nnnnusui.anydimensional

import org.scalatest.{Matchers, WordSpec}
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class CoordinatesTest extends WordSpec with Matchers with ScalaCheckDrivenPropertyChecks {

  val coord1 = Coordinates(1, 2, 3)
  val coord2 = Coordinates(4, 5, 6)
  println(coord1 + coord2)






//  "Coordinates(*)" should {
//    "Int" in
//      forAll { (vec: Vector[Int]) =>
//        val coordinates = Coordinates(vec)
//        println(coordinates)
//      }
//    "Double" in
//      forAll { (vec: Vector[Double]) =>
//        val coordinates = Coordinates(vec)
//        println(coordinates)
//      }
//  }
//  val coordinates = Coordinates(1, 5)
//  println(
//    Coordinates(1, 1)
//    + Coordinates(1, 1)
//  )
}
