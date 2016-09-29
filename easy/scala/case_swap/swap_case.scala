object SwapCase {
  def main(args: Array[String]) = {
    parse_file(args(0))
  }

  def parse_file(infile: String) {
    val text = scala.io.Source.fromFile(infile).getLines

    for (line <- text) {
      for(char <- line) {
        switch_case(char)
      }
      println
    }
  }

  def switch_case(char: Char) {
    var n : Int = char.toInt
    if (n > 'Z'.toInt) {
      print(Character.toUpperCase(char))
    } else {
      print(Character.toLowerCase(char))
    }
  }
}
