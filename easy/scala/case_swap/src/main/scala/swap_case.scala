/** My attempt at solving the 'swap case' challenge on codeeval
 * https://www.codeeval.com/open_challenges/96/
 * 
 * Your program should accept as its first argument a path to a filename. 
 * Input example is the following
 *
 * Hello world!
 * JavaScript language 1.8
 * A letter
 * OUTPUT SAMPLE:
 *
 * Print results in the following way.
 *
 * hELLO WORLD!
 * jAVAsCRIPT LANGUAGE 1.8
 * a LETTER
 *
 * @author git-hub/tmck-code
 */

object SwapCase {
  def main(args: Array[String]): Unit = {
    val source = scala.io.Source.fromFile(args(0))
    for (c <- source) print(switchCase(c))
    source.close
  }

  def switchCase(char: Char): Char = {
    if (char.toInt > 'Z'.toInt) {
      Character.toUpperCase(char)
    } else {
      Character.toLowerCase(char)
    }
  }
}
