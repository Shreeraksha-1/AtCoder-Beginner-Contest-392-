object WhoisMissing extends App {
  // Read input
  val input = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  val N = input(0)
  val M = input(1)
  val A = scala.io.StdIn.readLine().split(" ").map(_.toInt).toSet

  // Find missing integers
  val missing = (1 to N).filterNot(A.contains).toList

  // Output the result
  println(missing.length)
  if (missing.nonEmpty) {
    println(missing.mkString(" "))
  }
}