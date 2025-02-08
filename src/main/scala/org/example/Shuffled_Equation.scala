package org.example

object Shuffled_Equation extends App {
  // Read input
  val input = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  val A = (input(0), input(1), input(2))

  // Generate all permutations
  val permutations = List(
    (A._1, A._2, A._3),
    (A._1, A._3, A._2),
    (A._2, A._1, A._3),
    (A._2, A._3, A._1),
    (A._3, A._1, A._2),
    (A._3, A._2, A._1)
  )

  // Check if any permutation satisfies B1 * B2 == B3
  val result = permutations.exists { case (b1, b2, b3) =>
    b1 * b2 == b3
  }

  // Print the result
  if (result) println("Yes") else println("No")
}
