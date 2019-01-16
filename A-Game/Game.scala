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
    var username = scala.io.StdIn.readLine("Username: ")
    println("Please enter your password")
    val password = scala.io.StdIn.readLine("Password: ")
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

    inventoryList += "4 drinks of Coffee"

    println("*** You added 4 drinks of Coffee to your inventory ***")
    println("Current Inventory " + EOL + inventoryList.mkString(EOL))
    val r = new scala.util.Random
    val dropOrNot = 1 + r.nextInt((3 - 2) + 1)
    Thread.sleep(2000)
    if (dropOrNot == 1) {
      println("The pups are getting antsy and .......")
      Thread.sleep(2000)
      println("You drop your coffee cup whilst reaching for the leashes")
      inventoryList -= "4 drinks of Coffee"
      inventoryList.toArray
      println("*** 4 drinks of Coffee was removed from your inventory ***")
      println("Current Inventory " + EOL + inventoryList.mkString(EOL))
      Thread.sleep(2000)
      println(
        "Would you like to 'make' another cup of coffee or just 'leave' now?")
      val coffee = scala.io.StdIn.readLine()
      if (coffee == "make") {
        println("You make another cup of coffee")
        println("*** You added 4 drinks of Coffee to your inventory ***")
        inventoryList += "4 drinks of Coffee"
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
      // val coffee = inventoryList.indexOf("4 drinks of Coffee")
      // inventoryList.update(coffee, "3 drinks of Coffee")
      drinkCoffee(inventoryList)
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
    var checkedClubList = ArrayBuffer[String]()
    println(
      "You pass a trash can. Would you like to throw Teecee's droppings away?")
    val throwAway = scala.io.StdIn.readLine()
    if (throwAway == "yes") {
      inventoryList -= "1 bag of teecee love"
      println("You throw away Teecee's droppings")
      println("Current Inventory " + EOL + inventoryList.mkString(EOL))
      println(
        "After throwing away the poo you decide to check one of the possible places your favorite manbun holder could be.")
      listOfClubs(inventoryList, clubList,checkedClubList)
    } else {
      println("Ok that's a little weird but ok.....")
      println(
        "You decide that throwing the poo away can wait and head off for one of the places your favorite manbun holder could be.")
      listOfClubs(inventoryList, clubList,checkedClubList)
    }
  }

  def listOfClubs(inventoryList: ArrayBuffer[String],
                  clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
    println("Where would you like to check?")
    // println("Places to Check " + EOL + clubList.mkString(EOL))
    for (i <- 0 until clubList.length) {
      println(s"${clubList(i)}")
    }

    val club = scala.io.StdIn.readLine()
    if (club == "Theory") {
      clubList -= "Theory"
      checkedClubList += "Theory"
      goToTheory(inventoryList, clubList,checkedClubList)
    } else if (club == "Mother Hubbards") {
      clubList -= "Mother Hubbards"
      checkedClubList +=  "Mother Hubbards"
      leaveForMotherHubbards(inventoryList, clubList,checkedClubList)
    } else if (club == "Howl at the Moon"){
      checkedClubList +=  "Howl at the Moon"
      leaveForHowlAtTheMoon(inventoryList, clubList,checkedClubList)
    } else if (club == "Bub City") {
      clubList -= "Bub City"
      checkedClubList += "Bub City"
      leaveForBubCity(inventoryList, clubList,checkedClubList)
    }
  }

  def goToTheory(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
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
      // if (checkedclubs == 0) {
      //   println("Yes actually we did find it")
      // } else {
      //   println("Sorry not that I know of let me check...")
      //   Thread.sleep(5000)
      //   println(
      //     "Sorry sir we have not found it, but feel free to come back tonight and we can check again. Where else have you checked?")
      //     println(s"Yes I have checked ${checkedClubList.mkString(" & ")} so far")
      //   listOfClubs(inventoryList, clubList,checkedClubList)
      // }
      foundItYet(inventoryList, clubList,checkedClubList)
    }
  }

  def leaveForMotherHubbards(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
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
            println("Current Inventory " + EOL + inventoryList.mkString(EOL))
            arriveAtMotherHubbards(inventoryList,clubList,checkedClubList)
        } else {
            println("You just keep walking and ignore them")
            arriveAtMotherHubbards(inventoryList,clubList,checkedClubList)
        }
        
    } else {
        println("Sorry I don't have any cash on me.")
        Thread.sleep(2000)
        println("Oh that's ok..... but I do have a card swiper on my phone.")
        Thread.sleep(2000)
        println("You *SIGH* deeply and you and the pups keep walking")
        println("You take another drink of your coffee")
        // val coffee = inventoryList.indexOf("3 drinks of Coffee")
        // inventoryList.update(coffee, "2 drinks of Coffee")
        drinkCoffee(inventoryList)
        println("Current Inventory " + EOL + inventoryList.mkString(EOL))
        arriveAtMotherHubbards(inventoryList,clubList,checkedClubList)
    }
  }

    def arriveAtMotherHubbards(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
      var checkedclubs = clubList.length
      println("Arriving at Mother Hubbards you find a worker milling about cleaning up some stuff outside.")
      Thread.sleep(2000)
      println("""
                                /''''''
                                |  (')')     
                                C     _)  \_///
                                  \   _|   \ _/
                                  \__/___/ /
                                  <___Y> \_/        
                                /  \ :\__\        
                                /   | :| 
                                |___| :|
                                | |  :|
                                \ \  :|
                                  \ \=LI
                                  /// ||
                                  |   ||
                                  |   ||
                                  |   ||
                                  |   ||
                                  |   ||
                                  |   ||
                                  [___]]
                                  (____))
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
      """)
      Thread.sleep(2000)
      println("Excuse me sir but has anyone turned in a manbun holder? It is my most favorite one and I seem to have lost it.")
      if (checkedclubs == 0){
        println("Yes we actually did find it, it looks like a very special manbun holder. I'm glad we were able to find it for you.")
      } else {
          println("I'm quite sorry sir but I don't believe we have but let me check and see.")
          Thread.sleep(4000)
          println("I'm sorry sir but we have not had anyone turn in any manbun holder. Have you checked any place else?")
           println(s"Yes I have checked ${checkedClubList.mkString(" & ")} so far")
        }
            listOfClubs(inventoryList, clubList,checkedClubList)

      }

      def leaveForHowlAtTheMoon(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {

        println("You decide to check out Howl at the Moon")
        Thread.sleep(2000)
        println("Whilst walking down the sidewalk towards Howl at the moon Coder decides to be a d*** and try to run towards some unknown smell.")
        val r = new scala.util.Random
        val dropLeash = 1 + r.nextInt((6 - 2) + 1)
        
          if (inventoryList.contains("2 Leashes")) {
            if (1 == 1 ) {
          println("""
                                      .--~~,__
                          :-....,-------`~~'._.'
                          `-,,,  ,_      ;'~U'
                            _,-' ,'`-__; '--.
                          (_/'~~      ''''(;
          """)
          println("Oh No !!! One of you leashes break. Thank goodness that teecee does her little bark and coder stops and listens to her.")
             val leashes = inventoryList.indexOf("2 Leashes")
                 inventoryList.update(leashes, "1 Leash")
                 Thread.sleep(2000)
          println("After getting ahold of Coder and mananging to make do with the 1 Leash you have and jury rigging you belt with it you have both pups tied back together.")
          Thread.sleep(2000)
          }
          if (!inventoryList.contains("1 bag of Coder's love")) {
              println("The next the thing you know Coder decides to drop a big ol pile of his love")
              inventoryList += "1 bag of Coder's love"
              println("Current Inventory " + EOL + inventoryList.mkString(EOL))
          }
          arriveAtHowlAtTheMoon(inventoryList, clubList,checkedClubList)
        } else {
          println("Luckly you have a good grip on the 2 Leashes that you have and nothing")
          println("The next the thing you know Coder decides to drop a big ol pile of his love")
          inventoryList += "1 bag of Coder's love"
          println("Current Inventory " + EOL + inventoryList.mkString(EOL))
          arriveAtHowlAtTheMoon(inventoryList, clubList,checkedClubList)
        }
      }

    def arriveAtHowlAtTheMoon(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
      var checkedclubs = checkedClubList.length
      println("CHECKED CLUBS" + checkedclubs)
    println("Arriving at Howl at the Moon you find......")
    if (checkedclubs <= 1 ) {
        println("The doors locked up tight and no one will answer you knock on the door :( ")
        println("Guess you will have to check back later")
        listOfClubs(inventoryList, clubList,checkedClubList)
    } else {
        clubList -= "Howl at the Moon"
        println("At first it appears no one is there but lucky for someone comes to the door after your second attempt at knocking.")
        println("""
                            ////^\\\\
                            | ^   ^ |
                           @ (o) (o) @
                            |   <   |
                            |  ___  |
                             \_____/
                          ____|  |____
                          /    \__/    \
                        /              \
                        /\_/|        |\_/\
                      / /  |        |  \ \
                      ( <   |        |   > )
                      \ \  |        |  / /
                        \ \ |________| / /
                        \ \|
        """)
        Thread.sleep(3000)
        println("How can I help you today?, By the way can I say what beautiful dogs you have.")
        Thread.sleep(2000)
        println("Yes I have lost my favorite manbun holder has anyone turned it in?")
        Thread.sleep(3000)
        println("Let me go and check for you.")
        Thread.sleep(5000)
        // if (checkedclubs == 4 ){
        //   println("Why yes actually someone did turn it in. Here you are.")
        // } else {
        //   println("I'm quite sorry sir but I do not see it anywhere prehaps you would like to check back tonight?")
        //   println("*SIGH* Well thanks anyways. Have a good day prehaps I will check later if I do not find it.")
        //   listOfClubs(inventoryList, clubList,checkedClubList)
        // }
        foundItYet(inventoryList, clubList,checkedClubList)
    }
   }
   def leaveForBubCity(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
     println("You and the pups decide to go check out Bub City")
     Thread.sleep(3000)
     println("On your way to Bub City the phone rings")
     Thread.sleep(5000)
               println("""   _
                            | |
                            |_|
                            /_\    \ | /
                          .----------.----.
                          |          U    |
                          |               |
                          | ====o======== |
                          | ============= |
                          |               |
                          |_______________|
                          | ________GF337 |
                          ||   Amanda    ||
                          ||   Calling   ||
                          ||_____________||
                          |__.---------.__|
                          |---------------|
                          ||Yes|[(|)][ No]|
                          | ___  ___  ___ |
                          |[<-'][CLR][.->]|
                          | ___  ___  ___ |
                          |[1__][2__][3__]|
                          | ___  ___  ___ |
                          |[4__][5__][6__]|
                          | ___  ___  ___ |
                          |[7__][8__][9__]|
                          | ___  ___  ___ |
                          |[*__][0__][#__]|
                          |---------------|
                          |__|""|_______'-|
                          '---------------'
     
     """)
     println("It's the wife calling , will you answer the phone?")
     Thread.sleep(4000)
     val answerPhone = scala.io.StdIn.readLine()
     if (answerPhone == "yes"){
       println("Hey wifey what's up?")
       Thread.sleep(2000)
       println("What are you doing?")
       Thread.sleep(2000)
       println("Oh not much just taking the pups for a walk.......")
       Thread.sleep(6000)
       println("and looking for my lost manbun holder...... You do remember that it is magical right hun?")
       Thread.sleep(3000)
       println("***** DEEP SIGH *****")
       println("Yes Jonathan....... I know.")
       println("Where have you checked so far?")
       Thread.sleep(3000)
       var currentChecked = checkedClubList -= "Bub City"
       if (currentChecked.length == 0) {
            var checkedSoFar = "nowhere"
            println(s"So far I have checked ${checkedSoFar} and I am on the way to Bub City")
       } else {
            var checkedSoFar = checkedClubList.mkString("&")
            println(s"So far I have checked ${checkedSoFar} and I am on the way to Bub City")
       }
     }
     arriveAtBubCity(inventoryList, clubList,checkedClubList)
   }

  def arriveAtBubCity(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) { 
    println("Arriving at Bub City.")
    












}

  def foundItYet(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
      if (checkedClubList.length == 4 ){
          println("Why yes actually someone did turn it in. Here you are.")
        } else {
          
          println("I'm quite sorry sir but I do not see it anywhere prehaps you would like to check back tonight?")
          println("Sorry sir we have not found it, but feel free to come back tonight and we can check again. Where else have you checked?")
          println(s"Yes I have checked ${checkedClubList.mkString(" & ")} so far")
          println("Thank you for looking.")
          listOfClubs(inventoryList, clubList,checkedClubList)
        }
  }

  def drinkCoffee(inventoryList: ArrayBuffer[String]){
    for (i <- 0 until inventoryList.length) {
      var list = inventoryList(i)
      if (list.contains("Coffee")){
          val coffee = inventoryList.indexOf(list)
          val amountOfCoffeeLeft = list.split("\\D+").mkString.toInt - 1
          inventoryList.update(coffee, s"${amountOfCoffeeLeft} drinks of Coffee")
          println("Current Inventory " + EOL + inventoryList.mkString(EOL))
      }
    }
  }



   def yeaIfoundIt(inventoryList: ArrayBuffer[String]){
     println("After finally finding your favorite manbun holder you decide to do a happy dance.")
    Thread.sleep(2000)
    println("""
                  _O/                   ,
                    \                  /           \O_
                    /\_             `\_\        ,/\/
                    \  `       ,        \         /
                    `       O/ /       /O\        \
                            /\|/\.                `
    """)
    Thread.sleep(2000)
    println("Once you have danced enough you say thank you and head back on home.")
    backHome(inventoryList)
   }

   def backHome(inventoryList: ArrayBuffer[String]){
     println("BACK HOME")
   }

}
