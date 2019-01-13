object Login {
  def main(args: Array[String]): Unit = {
    println("Please enter your username")
    var  username = scala.io.StdIn.readLine()
    println("Please enter your password");
    var password = scala.io.StdIn.readLine()
        if( username == "Joe" && password == "Password"  ){
            println("Awesome Your login details were accepted");
        } else {
            println("Sorry you are not authorized")
        }
    }
}