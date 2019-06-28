package z3.scala

import org.scalatest.{FunSuite, Matchers}

class ForComprehension extends FunSuite with Matchers {
  import dsl._

  def isPrime(i : Int) : Boolean = {
    ! (2 to i-1).exists(i % _ == 0)
  }

  test("ForComprehension") {
    find[Int,Int]((x: Val[Int], y: Val[Int]) => x > 0 && y > x) match {
      case None => println("Found nothing")
      case Some((c1,c2)) => println(s"Found $c1, $c2")
    }
    // val results = for(
    //   (x,y) <- findAll[Int,Int]((x: Val[Int], y: Val[Int]) => x > 0 && y > x && x * 2 + y * 3 <= 40);
    //   if(isPrime(y));
    //   z <- findAll((z: Val[Int]) => z * x === 3 * y * y))
    // yield (x, y, z)

    // results.size should equal (8)
  }
}
