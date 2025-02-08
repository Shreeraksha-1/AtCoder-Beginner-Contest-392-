object Bib extends App {
  // Read input
  val N = scala.io.StdIn.readInt()
  val P = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  val Q = scala.io.StdIn.readLine().split(" ").map(_.toInt)

  // Create a mapping from bib number Q_i to the person they are staring at P_i
  val bibToPerson = Q.zip(P).toMap

  // Create a mapping from person number to bib number
  val personToBib = Q.zipWithIndex.map { case (q, idx) => (idx + 1, q) }.toMap

  // For each bib number i, find the bib number of the person they are staring at
  val result = (1 to N).map { i =>
    val personStaringAt = bibToPerson(i)
    personToBib(personStaringAt)
  }

  // Print the result
  println(result.mkString(" "))
}