package multiplicationTable

/**
 * Created by emrekarakis on 24/11/15.
 */

/////FUNCTIONAL STYLE CODING
object FunctionalStyle {
  def main(args: Array[String]) {
  println(multiTable())



  }
  def makeRowSeq(row:Int)=
    for(col<-1 to 10)yield {

      val prod =(row*col).toString
      val padding=" "*(4-prod.length)
      padding +prod
    }

  def makeRow(row:Int)=makeRowSeq(row).mkString  //concatanetes partial strings

  def multiTable()={
     val tableSeq= // a sequence of row strings
     for(row<-1 to 10 )
       yield makeRow(row)
    tableSeq.mkString("\n")
  }
}
