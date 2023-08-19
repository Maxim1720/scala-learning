object MainApp {
  def main(args: Array[String]): Unit = {
    val n:Int = scala.io.StdIn.readLine().toInt
    for(i<-1 to n){
        var word:String = scala.io.StdIn.readLine()
        val wl = word.length
        if(wl>10){
            word = word(0) + (wl-2).toString + word(wl-1)
        }
        println(word)
    }
  }
}