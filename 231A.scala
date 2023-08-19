object MainApp {
  def main(args: Array[String]): Unit = {
      val n: Int = scala.io.StdIn.readLine().toInt
      val taskCount = 3
      var result: Int = 0
      for(i <- 0 until n){
          var taskRes: Int = 0
          for(str <- scala.io.StdIn.readLine().split("\\s+"))
          {
              taskRes += str.toInt
          }
          result += taskRes/2;
      }
      println(result)
  }
}
