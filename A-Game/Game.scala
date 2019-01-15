import java.util.Base64
import java.nio.charset.StandardCharsets
import scala.util.control.Breaks._
import scala.collection.mutable.ArrayBuffer
import scala.compat.Platform.EOL
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
        System.exit(0)

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
      -woof-        /  '   ,'    /-.|        `.   ;   `. 
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

  def wakeup() {
    var inventoryList = ArrayBuffer[String]()
    println("You roll out of bed ready to greet the day....")
    inventoryList += "1 iphone X"
    Thread.sleep(2000)
    println(
      "After giving Teecee and Coder hugs and kisses (and a few licks too ;) ) ... you make yourself a cup of coffee and go to grab the leashes")

    println("""
                    ╭╯╭╯╭╯
                    █▓▓▓▓▓█═╮
                    █▓▓▓▓▓█▏︱
                    █▓▓▓▓▓█═╯
                    ◥█████◤

                """)

    inventoryList += "1 Cup of Coffee"

    println("*** You added 1 cup of coffee to your inventory ***")
    println("Current Inventory " + EOL + inventoryList.mkString(EOL))
    val r = new scala.util.Random
    val dropOrNot = 1 + r.nextInt((3 - 2) + 1)
    Thread.sleep(2000)
    if (dropOrNot == 1) {
      println("The pups are getting antsy and .......")
      Thread.sleep(2000)
      println("You drop your coffee cup whilst reaching for the leashes")
      inventoryList -= "1 Cup of Coffee"
      inventoryList.toArray
      println("*** 1 cup of coffee was removed from your inventory ***")
      println("Current Inventory " + EOL + inventoryList.mkString(EOL))
      Thread.sleep(2000)
      println(
        "Would you like to 'make' another cup of coffee or just 'leave' now?")
      val coffee = scala.io.StdIn.readLine()
      if (coffee == "make") {
        println("You make another cup of coffee")
        println("*** You added 1 cup of coffee to your inventory ***")
        inventoryList += "1 Cup of Coffee"
        println("Current Inventory " + EOL + inventoryList.mkString(EOL))
        println("With another cup of coffee ready.....")
        leave(inventoryList)
      } else if (coffee == "leave") {
        leave(inventoryList)
      }
    } else {
      leave(inventoryList)
    }
  }

  def sleep() {
    println("You decide to go back to sleep .... They can wait......")
    Thread.sleep(3000)
    println("and oh how they waited .....")

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

  def leave(inventoryList: ArrayBuffer[String]) {
    println(
      "You grab the leashes wrangle up the pups and lock the door behind you....")
    inventoryList += "Coder"
    inventoryList += "Teecee"
    inventoryList += "2 Leashes"
    println("Current Inventory " + EOL + inventoryList.mkString(EOL))
    println("With the pups and your cup of coffee you head for the elevator")
    Thread.sleep(3000)
    println("Arriving at the elevator.....")
    println("""
                             ______________
                            |.------------.|
                            || ____  ____ ||
                            8||    ||    |||
                            ||:====::====:||
                            |||____||____|||
                            ||            ||
                            ||            ||
                            ||            ||
                            ||            ||
                            ||          _ ||
                            ||         (_)||
                            ||            ||
                            ||            ||
                            ||            ||
                            ||            ||
                            8|            ||
                            ||            ||
                            ||____________||
                            '--------------'
    """)
    Thread.sleep(1000)
    println("The doors open and who should be standing there?????")
    Thread.sleep(4000)
    val r = new scala.util.Random
    val elevatorDoor = r.nextInt((1) + 1)
    if (elevatorDoor == 0) {
      println("No one is in the elevator")
      Thread.sleep(2000)
      println(
        "The pups bound on into the elevator slightly dragging a sleepy brit behind them")
      outSideOfHome(inventoryList)
    } else {
      println(
        "That mean ol neighbor who says that the greatest newfies ever bark too much")
      Thread.sleep(2000)
      println("As if !!!!")
      println("Jon just smiles nods and gets on the elevator ")
      outSideOfHome(inventoryList)
    }

  }

  def outSideOfHome(inventoryList: ArrayBuffer[String]) {
    println("Arriving outside........")
    Thread.sleep(4000)
    println(
      "You go to put your hair up with your favorite manbun holder .......")
    Thread.sleep(3000)
    println("Oh no!!!!! It's Gone")
    println(""" 
                            
                    ────────────────██████████
                    ────────────────██████████
                    ────────────────██████████
                    ─────────────▄▄▄██████████▄▄▄
                    ───────────────▄▀░░░░░░░░▀▄
                    ──────────────▐░░▄▀▀░░▀▀▄░░▌
                    ──────────────▐░░██▀░░▀██░░▌
                    ──────────────▐░░░░░▀▀░░░░░▌
                    ──────────────▐░░░░░░░░░░░░▌
                    ──────────────▐░░░▄▀▀▀▀▄░░░▌
                    ───────────────▀▄░░░▀▀░░░▄▀
                    ───────────────▐▒▀▄▄▄▄▄▄▀▒▌
                    ────────▄▄▄▄▄▄▀▀▒▓▓▓▓▓▓▓▓▒▀▀▄▄▄▄▄▄
                    ──────▄▀▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▀▄
                    ─────▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓
                    ────▓▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▓
                    ───▓▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▓
                    ──▓▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▓

        """)

    Thread.sleep(3000)
    println("The adventure starts.")
    println(
      "Your goal should you decide to stick to it is to find the magic manbun holder all whilst taking Teecee and Coder for a nice walk.")
    println("You Teecee and Coder begin your journey")
    println(
      """
                                 _________
                                |MMMMMMMMM|                _
                    ________    |MMMMMMMMM|              _|l|_
                    |!!!!!!!_|___|MMMMMMMMM|             |lllll|
                    |!!!!!!|=========|MMMMM|             |lllll|_______
                    |!!!!!!|=========|MMMMM|            _|lllll|HHHHHHH|
                    |!!!!!!|=========|MMMMM|   ________|lllllllll|HHHHH|
                    |!!!!!!|=========|MMMMM|  |unununun|lllllllll|HHHHH|______
                    |!!!!!!|=========|MMMMM|  |nunununu|lllllllll|HH|:::::::::|
                    |!!!!!!|=========|MMM__|..|un__unun|lllllllll|HH|:::::::::|
                    |!!!!!!|=======_=|M_( ')' );' .)unu|lllllllll|HH|:::::::::|
                    |!!!_!!|======( )|(. ` ,) (_ ', )un|lllllllll|HH|:::::::::| ~~~
                    |!!(.)!|===__(`.')_(_ ')_,)(. _)unu|lllllllll|HH|:__::::::|~~  ~~
                    |!(.`')|==( .)' .)MMM|M|| |un|nunun|lllllllll|``|( ,)_::::| ~~~~ ~
                    -(: _)|=(`. ')_)|---|- '  ``|`````|lll____ll|  (_; `'):::|~~~  ~~~
                        |  |==(_'_)|=|    ______        ''/\   \'   |(_'_)::::|\~~~~__|)__
                        |   ''''|''o/`.-``~~~~~ ``-.     /--\___\    ``|`````` /____\____/
                    jrei        |  h ( `; ~~~ ~~  ~ )    |M_|#_#|      ' --   __________|~
                        --   *      '-.._~~__~..-'   --           -* -     /  ~~~~ ~~~~~~
                    *   -   -      --           ----         ---         _.-'~~~~~     ~ ~~
                    __--_________............-------------'''''''''''''''` ~~~~~    ~~~ ~~~~
                    ~~    ~~~~~~~~     ~~~~~~~   ~~~~~~~~~   ~~~~~~~~~~      ~~~~~~~     ~~~
                    ~~~~~~~~~  ~~~~  ~~~~~ ~~~~~~~~~ ~ ~      ~~~~~~ ~~~~~~     ~~~~    ~~~~
                    ~~~~~~~~     ~~~~~~~~~~~~~~~        ~~~~~~~~~~~~ ~~~~~~  ~~~ ~~~~~~  ~~~
         """)
    theJourneyBegins(inventoryList)
  }

  def theJourneyBegins(inventoryList: ArrayBuffer[String]) {
    println(
      "With a heavy *SIGH* you take a drink of your coffee and start down the sidewalk.")
      val coffee = inventoryList.indexOf("1 Cup of Coffee")
      inventoryList.update(coffee, "3/4 Cup of Coffee")
    Thread.sleep(2000)
    println(
      "After walking about a block down the road Teecee decides to take a poo.")
    println(
      "Whilst waiting for the lovely lady to do her business you go to take out your phone when....")
    val r = new scala.util.Random
    val dropOrNot = 1 + r.nextInt((3 - 2) + 1)
    if (dropOrNot == 1) {
      println("You drop your phone.... OH NO!! ")
      println("Bending down to pick up your phone you notice a $20 bill.")
      inventoryList += "$20 Bill"
      println("You added a $20 bill to you inventory")
      println("You pick up Teecee's ..... and proceed down the road")
      inventoryList += "1 bag of teecee's love"
      println("You added 1 bag of teecee's love")
      println("Current Inventory " + EOL + inventoryList.mkString(EOL))
      trashCan(inventoryList)

    } else {
      println("Nothing out of the ordinary happens")
      println(
        "You pick up teecee's leavings all whilst wrestling with a playful Coder.")
      inventoryList += "1 bag of teecee's love"
      println("You added 1 bag of teecee's love")
      println("Current Inventory " + EOL + inventoryList.mkString(EOL))
      trashCan(inventoryList)
    }

  }

  def trashCan(inventoryList: ArrayBuffer[String]) {
    var clubList = ArrayBuffer[String]("Theory",
                                       "Mother Hubbards",
                                       "Howl at the Moon",
                                       "Bub City")
    println(
      "You pass a trash can. Would you like to throw Teecee's droppings away?")
    val throwAway = scala.io.StdIn.readLine()
    if (throwAway == "yes") {
      inventoryList -= "1 bag of teecee love"
      println("You throw away Teecee's droppings")
      println("Current Inventory " + EOL + inventoryList.mkString(EOL))
      println(
        "After throwing away the poo you decide to check one of the possible places your favorite manbun holder could be.")
      listOfClubs(inventoryList, clubList)
    } else {
      println("Ok that's a little weird but ok.....")
      println(
        "You decide that throwing the poo away can wait and head off for one of the places your favorite manbun holder could be.")
      listOfClubs(inventoryList, clubList)
    }
  }

  def listOfClubs(inventoryList: ArrayBuffer[String],
                  clubList: ArrayBuffer[String]) {
    println("Where would you like to check?")
    // println("Places to Check " + EOL + clubList.mkString(EOL))
    for (i <- 0 until clubList.length) {
      println(s"${clubList(i)}")
    }

    val club = scala.io.StdIn.readLine()
    if (club == "Theory") {
      clubList -= "Theory"
      goToTheory(inventoryList, clubList)
    } else if (club == "Mother Hubbards") {
      clubList -= "Mother Hubbards"
      goToMotherHubbards(inventoryList, clubList)

    }
  }

  def goToTheory(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String]) {
    var checkedclubs = clubList.length
    println("You and the pups decide to check out Theory")
    Thread.sleep(2000)
    println(
      "Arriving at Theory you find the doors locked but after some pleading and knocking on the door a security guard anaswers and says....")
    Thread.sleep(2000)
    println("""
                                      ________________
                                      \      __      /         __
                                       \_____()_____/         /  )
                                       '============`        /  /
                                        #---\  /---#        /  /
                                       (# @\| |/@  #)      /  /
                                        \   (_)   /       /  /
                                        |\ '---` /|      /  /
                                _______/ \\_____// \____/ o_|
                            /       \  /     \  /   / o_|
                            / |           o|        / o_| \
                            /  |  _____     |       / /   \ \
                            /   |  |===|    o|      / /\    \ \
                            |    |   \@/      |     / /  \    \ \
                            |    |___________o|__/----)   \    \/
                            |    '              ||  --)    \     |
                            |___________________||  --)     \    /
                                    |           o|   ''''   |   \__/
                                    |            |          |
            """)
    val r = new scala.util.Random
    val niceOrMean = 1 + r.nextInt((20 - 2) + 1)
    if (niceOrMean == 4) {
      println(
        "The security guard was having a bad day and knocks you over the head")
      Thread.sleep(2000)
      println("The pups run home and get back in bed with Amanda")
      inventoryList -= "Coder"
      inventoryList -= "Teecee"
      inventoryList -= "2 Leashes"
      println("Current Inventory " + EOL + inventoryList.mkString(EOL))
      println("Game Over")
      println("Sorry you lost :( ")
      System.exit(0)
    } else {
      println("How can I help you sir?")
      Thread.sleep(1000)
      println(
        "Yes I have seemed to lost my favorite manbun holder. Has it been turned in by chance?")
      if (checkedclubs == 0) {
        println("Yes actually we did find it")
      } else {
        println("Sorry not that I know of let me check...")
        Thread.sleep(5000)
        println(
          "Sorry sir we have not found it, but feel free to come back tonight and we can check again.")
        listOfClubs(inventoryList, clubList)
      }
    }
  }

  def goToMotherHubbards(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String]) {
      var checkedclubs = clubList.length
    println("You and the pups decide to check out Mother Hubbards")
    Thread.sleep(2000)
    println("On your way to Mother Hubbards you pass yet another person asking for change.")
    Thread.sleep(2000)
    val money = inventoryList contains "$20 Bill"
    if (money == true) {
        println("Do you give them any?")
        val giveMoney = scala.io.StdIn.readLine()
        if (giveMoney == "yes") {
            inventoryList -= "$20 Bill"
            println("You removed a $20 bill from your inventory")
        } else {
            println("You just keep walking and ignore them")
        }
        
    } else {
        println("Sorry I don't have any cash on me.")
        Thread.sleep(2000)
        println("Oh that's ok..... but I do have a card swiper on my phone.")
        Thread.sleep(2000)
        println("You *SIGH* deeply and you and the pups keep walking")
        println("You take another drink of your coffee")
    }
  }

}
