package Lines

/**
 * Created by emrekarakis on 04/12/15.
 */
object FindLongLines {
  def main(args: Array[String]) {
    try{
      val width = args(0).toInt
    }catch{case ex: Exception=>println("aaaa")}
    for (arg <- args.drop(1))
      LongLines.processFile(arg,width)
  }
}
