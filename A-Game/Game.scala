import java.util.Base64
import java.nio.charset.StandardCharsets
import scala.util.control.Breaks._

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
      var status = false
      while(status == false){
      
        println("Would you like to play?")
        var playornot = scala.io.StdIn.readLine()
        
        if (playornot == "yes"){
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

  def noGettingIn(){
      println("Sorry you are not playing today buddy.")
  }

  def startGame(){
      println("One Day early asf in the morning Jon is woken to two lovely dogs licking his face......")
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
      println("Do you go back to 'sleep' or 'wake up' and take the little buggers out?")
      var wakeUp = scala.io.StdIn.readLine()

      if (wakeUp == "wake up") {

      } else {
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
        

  }

}
