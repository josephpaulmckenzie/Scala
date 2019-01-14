import java.util.Base64
import java.nio.charset.StandardCharsets

object Login {
  def main(args: Array[String]): Unit = {
    println("Please enter your username")
    var username = scala.io.StdIn.readLine()
    println("Please enter your password");
    var password = scala.io.StdIn.readLine()
    var encryptedUsername = Base64.getEncoder().encodeToString(username.getBytes());
    var encryptedPassword = Base64.getEncoder().encodeToString(password.getBytes());
 
    if (encryptedUsername == "TWFydmlu" && encryptedPassword == "U3Vja3M=") {
      authorized()
    } else {
      notAuthorized()
    }
  }
  

  def authorized() {
    println("The Login Details you supplied were accepted")
  }

  def notAuthorized() {
    println("The Login Details you supplied were not accepted")
  }

}
