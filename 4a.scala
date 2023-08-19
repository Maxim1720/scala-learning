object MainApp {
  def main(args: Array[String]): Unit = {
    val a: Int = scala.io.StdIn.readLine().toInt
    val yes = "YES"
    val no = "NO"
    
    var answer = ""
    
    /*calculating answer*/
    if(a%2==0 && a>2){
        answer = yes
    }
    else{
        answer = no
    }
    
    println(answer);
  }
}