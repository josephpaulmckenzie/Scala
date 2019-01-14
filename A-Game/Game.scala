import java.util.Base64
import java.nio.charset.StandardCharsets

object Game {
  def main(args: Array[String]){
    println("You must be Authorized to play this game.")
    println("Please enter your username")
    var username = scala.io.StdIn.readLine()
    println("Please enter your password")
    var password = scala.io.StdIn.readLine()
    var encryptedUsername = Base64.getEncoder().encodeToString(username.getBytes())
    var encryptedPassword = Base64.getEncoder().encodeToString(password.getBytes())
    if (encryptedUsername == "TWFydmlu" && encryptedPassword == "U3Vja3M=") {
        authorized()
    } else { 
        noGettingIn()
    }
  }

  def authorized() {
      println("You have been authorized to play this game.")
      Thread.sleep(1000)
      println("The Game you are about to play will take you on an adventure.......")
      Thread.sleep(3000)
      println("One involving 2 Newfoundland pups and a somewhat grumpy british man")
      Thread.sleep(2000)
      println("Just kidding Jon.... ")
      Thread.sleep(3000)
      println("However this game is about 2 Newfies and well Jon.")
      Thread.sleep(3000)
      println("Would you like to play?")
      var playornot = scala.io.StdIn.readLine()

      if (playornot == "Yes"){
          startGame()
      } else if (playornot == "No"){
          beThatWay()
      } else {
          println("Invalid Response")
      }
  }

  def noGettingIn(){
      println("Sorry you are not playing today buddy.")
  }


}
