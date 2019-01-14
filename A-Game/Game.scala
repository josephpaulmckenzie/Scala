import java.util.Base64
import java.nio.charset.StandardCharsets
import scala.util.control.Breaks._
import scala.collection.mutable.ArrayBuffer

// import Home.Home
object Game {
  def main(args: Array[String]) {
    //   println(new Home home)
    
 
    println("You must be Authorized to play this game.")
    println("Please enter your username")
    var username = scala.io.StdIn.readLine()
    println("Please enter your password")
    var password = scala.io.StdIn.readLine()
    var encryptedUsername =
      Base64.getEncoder().encodeToString(username.getBytes())
    var encryptedPassword =
      Base64.getEncoder().encodeToString(password.getBytes())
    if (encryptedUsername == "TWFydmlu" && encryptedPassword == "U3Vja3M=") {
      authorized()
    } else {
      noGettingIn()
    }
  }

  def authorized() {
    println("You have been authorized to play this game.")
    Thread.sleep(1000)
    println(
      "The Game you are about to play will take you on an adventure.......")
    Thread.sleep(3000)
    println(
      "One involving 2 Newfoundland pups and a somewhat grumpy british man")
    Thread.sleep(2000)
    println("Just kidding Jon.... ")
    Thread.sleep(3000)
    println("However this game is about 2 Newfies and well Jon.")
    Thread.sleep(3000)
    var status = false
    while (status == false) {

      println("Would you like to play?")
      var playornot = scala.io.StdIn.readLine()

      if (playornot == "yes") {
        var status = true

        startGame()
        break
      } else if (playornot == "no") {
        var status = true
        println("Fine be that way... Have a good day.")
        System.exit(0)
      }
    }
  }

  def noGettingIn() {
    println("Sorry you are not playing today buddy.")
  }

  def startGame() {
    println(
      "One Day early asf in the morning Jon is woken to two lovely dogs licking his face......")
    Thread.sleep(3000)
    println(""" 
                 

                              ,.  , 
                          .-. \ \| \ 
             ,---._    _,-.> `.\ \ ( 
            (__,'  `   `>-         -\ 
                     ,-'             `-. 
         ,-'       ,  ,    .       .    `. 
       ,'\       ,' ,-'    `-.      ;    :`. 
      (__;     ,',,'      ,   `     : `. :  \ 
             ,' |  _,'   /_    `    :  ; :   \ 
            /  ,',' |   /  \        '     ;   \ 
           /   | |(o|  /  (o)          |  |    ; 
          /     ___-^-^-----.          |  |    | 
         (   ,---. `-.           :.    |       : 
          ;,'      )  `          :..   |        | 
          :\      /              :.    |        ; 
          :.`-.__,              ,:`    |        | 
          ;`.    .             ':'      \      , 
         /   `-.__\           '      ,   \     \. 
        (   ,'    \`--,-----.       /     \     \`. 
         `-'       \,' ,'   /    / |       \     | `. 
      -hrr-        /  '   ,'    /-.|        `.   ;   `. 
                  (      /`----'   |          `--'     ` 
                   `.__,' 
                 """)

    println("He knows what they want...")
    Thread.sleep(4000)
    println(
      "Do you go back to 'sleep' or 'wake up' and take the little buggers out?")
    var wakeUp = scala.io.StdIn.readLine()

    if (wakeUp == "wake up") {
        wakeup()
    } else {
      sleep()
    }

  }

  def wakeup(){
      var inventoryList = ArrayBuffer[String]()
      println("You roll out of bed ready to greet the day....")
      inventoryList += "1 iphone X"
      Thread.sleep(2000)
      println("After giving Teecee and Coder hugs and kisses (and a few licks too) ... you make yourself a cup of coffee and go to grab the leashes")
      
      println("""
                    ╭╯╭╯╭╯
                    █▓▓▓▓▓█═╮
                    █▓▓▓▓▓█▏︱
                    █▓▓▓▓▓█═╯
                    ◥█████◤

                """)
    
    inventoryList += "1 Cup of Coffee"

      println("*** You added 1 cup of coffee to your inventory ***")
      println("Current Inventory " + inventoryList.mkString(","))
      val r = new scala.util.Random
      val dropOrNot = 1 + r.nextInt(( 3 - 2) + 1)
      Thread.sleep(2000)
      if (dropOrNot == 1) {
          println("The pups are getting antsy and .......")
          Thread.sleep(2000)
          println("You drop your coffee cup whilst reaching for the leashes")
          inventoryList -= "1 Cup of Coffee"
          inventoryList.toArray
          println("*** 1 cup of coffee was removed from your inventory ***")
          println("Current Inventory" + inventoryList.mkString(","))
          Thread.sleep(2000)
          println("Would you like to 'make' another cup of coffee or just 'leave' now?")
          val coffee = scala.io.StdIn.readLine()
          if (coffee == "make") {
              println("You make another cup of coffee")
              println("*** You added 1 cup of coffee to your inventory ***")
              println("Current Inventory " + inventoryList.mkString(","))
          } else if (coffee == "leave") {
              leave(inventoryList)
          }
      } else {
          leave(inventoryList)
      }
      println("")


  }

  def sleep(){
      println("You decide to go back to sleep .... They can wait......")
      Thread.sleep(2000)
      println(""" 
                       __
                    __/o \_
                    \____  \
                        /   \
                __   //\   \
                __/o \-//--\   \_/
                \____  ___  \  |
                    ||   \ |\ |
                    _||   _||_||
                """)

  }

  def leave(inventoryList: ArrayBuffer[String]){
      inventoryList.toArray
          println("You grab the leashes and lock the door behind you....")
          inventoryList += "2 Leashes"
          println("Current Inventory" + inventoryList.mkString(","))

  }

}
