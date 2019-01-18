	
import java.util.Base64
import java.nio.charset.StandardCharsets
import scala.util.control.Breaks._
import scala.collection.mutable.ArrayBuffer
import scala.compat.Platform.EOL
// We can rename our imports with something like below. That is pretty cool imo.
// import System.out.{println=>printItMan}
// It is easier to type and what to remember to type for user input if we rename 
// the command scala.io.StdIn.readLine (Which gets user input)
// to something a lot easier like getuserinput
import scala.io.StdIn.{readLine=>getuserinput}
// getuserinput

// import Home.Home
object Game {
  def main(args: Array[String]) {

  println("You must be Authorized to play this game.")
  println("Please enter your username")
  var username = getuserinput("Username: ")
  println("Please enter your password")
  val password = getuserinput("Password: ")
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
      

      def getChoice: String = {
        val line = getuserinput("Would you like to Play? : ").toLowerCase
        line match {
          case "yes" => startGame() ; line
          case "no" => println("Fine be that way... Have a good day."); line
          case _ => println("Please enter a valid input."); getChoice
        }
      }
        val playornot = getChoice
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
    
    def getChoice: String = {
        val line = getuserinput("Do you go back to 'sleep' or 'wake up' and take the little buggers out? : ").toLowerCase
        line match {
          case "wake up" => wakeup() ; line
          case "sleep" => sleep(); line
          case _ => println("Please enter a valid input."); getChoice
        }
      }
      val wakeUporNot = getChoice

  }

  def wakeup() {
    var inventoryList = ArrayBuffer[String]()
    println("You roll out of bed ready to greet the day....")
    addToInventory(inventoryList,"1 iphone X")

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

    addToInventory(inventoryList,"4 drinks of Coffee")
    val r = new scala.util.Random
    val dropOrNot = 1 + r.nextInt((3 - 2) + 1)
    Thread.sleep(2000)
    if (dropOrNot == 1) {
      println("The pups are getting antsy and .......")
      Thread.sleep(2000)
      println("You drop your coffee cup whilst reaching for the leashes")
      removeFromInventory(inventoryList,"4 drinks of Coffee")
      Thread.sleep(2000)
  
      def getChoice: String = {
        val line = getuserinput("Would you like to 'make' another cup of coffee or just 'leave' now> : ").toLowerCase
        line match {
          case "make" => println("You make another cup of coffee");
          addToInventory(inventoryList,"4 drinks of Coffee");
          println("With another cup of coffee ready.....");
          leave(inventoryList) ; line
          case "leave" => leave(inventoryList); line
          case "inventory" => showInventory(inventoryList); getChoice
          case _ => println("Please enter a valid input."); getChoice
        }
      }
        val makeMorecoffee = getChoice
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
      addToInventory(inventoryList,"Coder")
      addToInventory(inventoryList,"Teecee")
      addToInventory(inventoryList,"2 Leashes")
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
    // Gets Random Number duh :/
    val r = new scala.util.Random
    // Gets a a random number just fluxating between 0 and 1
    // we can make that range anything we want
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
      addToInventory(inventoryList,"$20 Bill")
      println("You pick up Teecee's ..... and proceed down the road")
      addToInventory(inventoryList,"1 bag of teecee's love")
      trashCan(inventoryList)
    } else {
      println("Nothing out of the ordinary happens")
      addToInventory(inventoryList,"1 bag of teecee's love")
      trashCan(inventoryList)
    }
  }

  def trashCan(inventoryList: ArrayBuffer[String]) {
    var clubList = ArrayBuffer[String]("Theory",
                                       "Mother Hubbards",
                                       "Howl at the Moon",
                                       "Bub City")
    var checkedClubList = ArrayBuffer[String]()
    
    def getChoice: String = {
        val line = getuserinput("You pass a trash can. Would you like to throw Teecee's droppings away? (Yes/No) : ").toLowerCase
        line match {
          case "yes" => removeFromInventory(inventoryList,"1 bag of teecee's love")
          println("After throwing away the poo you decide to check one of the possible places your favorite manbun holder could be.")
          listOfClubs(inventoryList,clubList,checkedClubList) ; line
          case "no" => println("Ok that's a little weird but ok.....")
          println("You decide that throwing the poo away can wait and head off for one of the places your favorite manbun holder could be.")
          listOfClubs(inventoryList, clubList,checkedClubList); line
          case "inventory" => showInventory(inventoryList); getChoice
          case _ => println("Please enter a valid input."); getChoice
        }
      }
        val throwPoopAway = getChoice
  }

  def listOfClubs(inventoryList: ArrayBuffer[String],
                  clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
    println("Where would you like to check?")
    for (i <- 0 until clubList.length) {
      println(s"${clubList(i)}")
    }

  def getChoice: String = {
      val line = getuserinput.toLowerCase
      line match {
        case "theory" => goToTheory(inventoryList, clubList,checkedClubList); line
        case "mother hubbards" => leaveForMotherHubbards(inventoryList, clubList,checkedClubList);line
        case "howl at the moon" => leaveForHowlAtTheMoon(inventoryList, clubList,checkedClubList); line
        case "bub city" => leaveForBubCity(inventoryList, clubList,checkedClubList); line
        case "inventory" => showInventory(inventoryList); getChoice
        case _ => println("Please enter a valid input."); getChoice
      }
    }
      val chooseClub = getChoice


  }

  def goToTheory(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
    var checkedclubs = clubList.length
    println("You and the pups decide to check out Theory")
    Thread.sleep(2000)
    println(
      "Arriving at Theory you find the doors locked but after some pleading and knocking on the door a security guard anaswers and says....")
    Thread.sleep(2000)
    println("""
                                              ______
                                            <((((((\\\
                                            /      . }\
                                            ;--..--._|}
                          (\                 '--/\--'  )
                          \\                | '-'  :'|
                            \\               . -==- .-|
                            \\               \.__.'   \--._
                            [\\          __.--|       //  _/'--.
                            \ \\       .'-._ ('-----'/ __/      \
                              \ \\     /   __>|      | '--.       |
                              \ \\   |   \   |     /    /       /
                                \ '\ /     \  |     |  _/       /
                                \  \       \ |     | /        /
                                 \  \      \        /
            """)
    val r = new scala.util.Random
    val niceOrMean = 1 + r.nextInt((20 - 2) + 1)
    if (niceOrMean == 4) {
      println(
        "The security guard was having a bad day and knocks you over the head")
      Thread.sleep(2000)
      println("The pups run home and get back in bed with Amanda")
      removeFromInventory(inventoryList,"Coder")
      removeFromInventory(inventoryList,"Teecee")
      removeFromInventory(inventoryList,"2 Leashes")
      println("Game Over")
      println("Sorry you lost :( ")
      System.exit(0)
    } else {
      println("How can I help you sir?")
      Thread.sleep(1000)
      println("Yes I have seemed to lost my favorite manbun holder. Has it been turned in by chance?")
      println("I don't know but let me go in look in the back and see.")
      clubList -= "Theory"
      checkedClubList += "Theory"
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
        val giveMoney = getuserinput
        if (giveMoney == "yes") {
            removeFromInventory(inventoryList,"$20 Bill")
            addToInventory(inventoryList,"Good Karma")
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
        drinkCoffee(inventoryList)
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
      clubList -= "Mother Hubbards"
      checkedClubList += "Mother Hubbards"
      foundItYet(inventoryList, clubList,checkedClubList)

      }

      def leaveForHowlAtTheMoon(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {

        println("You decide to check out Howl at the Moon")
        Thread.sleep(2000)
        println("Whilst walking down the sidewalk towards Howl at the moon Coder decides to be a d*** and try to run towards some unknown smell.")
        val r = new scala.util.Random
        val dropLeash = 1 + r.nextInt((6 - 2) + 1)
        
          if (inventoryList.contains("2 Leashes")) {
            if (dropLeash == 1 ) {
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
              addToInventory(inventoryList,"1 bag of Coder's love")
          }
          arriveAtHowlAtTheMoon(inventoryList, clubList,checkedClubList)
        } else {
          println("Luckly you have a good grip on the 2 Leashes that you have and nothing")
          println("The next the thing you know Coder decides to drop a big ol pile of his love")
          addToInventory(inventoryList,"1 bag of Coder's love")
          arriveAtHowlAtTheMoon(inventoryList, clubList,checkedClubList)
        }
      }

    def arriveAtHowlAtTheMoon(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
      val checkedclubs = checkedClubList.length
    println("Arriving at Howl at the Moon you find......")
    if (checkedclubs <= 1 ) {
        println("The doors locked up tight and no one will answer you knock on the door :( ")
        println("Guess you will have to check back later")
        listOfClubs(inventoryList, clubList,checkedClubList)
    } else {
        
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
        clubList -= "Howl at the Moon"
        checkedClubList +=  "Howl at the Moon"
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

    def getChoice: String = {
      val line = getuserinput.toLowerCase
      line match {
        case "yes" =>
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
        } ; line
        case "no" => println("Uh oh! You know what happens when you don't answer the phone man."); line
        case "inventory" => showInventory(inventoryList); getChoice
        case _ => println("Please enter a valid input."); getChoice
      }
    }
      val chooseClub = getChoice

     arriveAtBubCity(inventoryList, clubList,checkedClubList)
   }

  def arriveAtBubCity(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) { 
    println("Arriving at Bub City. You see the cops a few doors down harrasing a bum.")
    Thread.sleep(3000)
    println("""
                         ____            ____            ____
                        /....\          /....\          /....\
                .-.    |::::::|    .-. |::::::|    .-. |::::::|
                | |    |::::::|    | | |::::::|    | | |::::::|
                | |    (`:'':')    | | (`:'':')    | | (`:'':')
                | |   _--|__|--__  | |.--|__|--__  | |_--|__|--__
                | |  |   ________|_|_|_  ________|_|_|_  ________|_____
                | | /    |            |  |            |  |            |
                | |/  /  |            |  |            |  |            |
                |_| |/|  |            |  |            |  |            |
               (===)| |  |  C  P  D   |  |  C  P  D   |  |  C  P  D   |
               `==='  |`-|            |`-|            |`-|            |
                | |   |`-|            |`-|            |`-|            |
                |_|   |  |            |  |            |  |            |
                      |  |            |  |            |  |            |
                      |  |            |  |            |  |            |
                      |`-|            |`-|            |`-|            |
                      |__|            |__|            |__|            |
                      /_ |            |_ |            |_ |            |
                     |___`-__________-'__`-__________-'__`-__________-'
    """)
    Thread.sleep(2000)
    val r = new scala.util.Random
        val beatdown = 1 + r.nextInt((12 - 2) + 1)
    def getChoice: String = {
        val line = getuserinput("Will you help the poor guy out and say something to the cops?").toLowerCase
        line match {
          case "yes" => println("You decide to be cool and say something to the cops.")

                        if (inventoryList.contains("Good Karma") == true){
                            println("Walking up to the cops you notice it is the same guy you gave that money to you found earlier.")
                            println("What are the chances of that ?!?! ")
                            println("You say to the cops ....Hey that is not very cool of you guys what has he done wrong?")
                            if (beatdown == 1) {
                                println("The cops tell you to mind you own business and knock you over your head")
                                Thread.sleep(3000)
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
                                println("You get knocked out drop the leashes and the pups run back home to Amanda ")
                                for (i <- 0 until inventoryList.length) {
                                    var list = inventoryList(i)
                                    if (list.contains("Leashes")){
                                        val indexOfLeashes = inventoryList.indexOf(list)
                                        removeFromInventory(inventoryList,inventoryList(i))
                                        removeFromInventory(inventoryList,"Coder")
                                        removeFromInventory(inventoryList,"Teecee")
                                        // println("Current Inventory " + EOL + inventoryList.mkString(EOL))
                                    }
                                  }
                                System.exit(0)
                            } else {
                                println("The cops not wanting a problem tell you to be on your way and tell the guy to move the f***  on.")
                                print("The bum tells you thank you very much and you are back on your misson you set out for,")
                                println("with that out of the way you knock on the door and .....")
                                println("You are greeted by a very nice fellow.")
                                println("""
                                                   ,---.
                                                ,.'-.   \
                                                ( ( ,'\"\"\"\"\"-.
                                                `,X          `.
                                                /` `           `._
                                              (            ,   ,_\
                                              |          ,---.,'o `.
                                              |         / o   \     )
                                                \ ,.    (      .____,
                                                \| \    \____,'     \
                                              '`'\  \        _,____,'
                                              \  ,--      ,-'     \
                                                ( C     ,'         \
                                                  `--'  .'           |
                                                    |   |         .O |
                                                  __|    \        ,-'_
                                                / `L     `._  _,'  ' `.
                                                /    `--.._  `',.   _\  `
                                                `-.       /\  | `. ( ,\  \
                                              _/  `-._  /  \ |--'  (     \
                                              '  `-.   `'    \/\`.   `.    )
                                                    \  -hrr-    \ `.  |    |
                                """)
                                println("How can I help you sir?")
                                println("Yes I have lost my favorite manbun holder has anyone turned it in?")
                                println("I am not quite sure sir let me go take a look in the back.")
                                clubList -= "Bub City"
                                checkedClubList += "Bub City"
                                foundItYet(inventoryList, clubList,checkedClubList)
                            }

                        } else {
                            println("You walk up to the cops and ask them what he has done wrong.")
                            println("They tell you that he is wanted for questioning in a case of a missing manbun holder.")
                            println("You tell the cops oh my gosh I'm missing one myself and am currently on a misson to find it.")
                            println("The cops just laugh and say have a good day sir")
                            println("With that out of the way you knock on the door and .....")
                            println("You are greeted by a very nice fellow.")
                             println("""
                                                   ,---.
                                                ,.'-.   \
                                                ( ( ,'\"\"\"\"\"-.
                                                `,X          `.
                                                /` `           `._
                                              (            ,   ,_\
                                              |          ,---.,'o `.
                                              |         / o   \     )
                                                \ ,.    (      .____,
                                                \| \    \____,'     \
                                              '`'\  \        _,____,'
                                              \  ,--      ,-'     \
                                                ( C     ,'         \
                                                  `--'  .'           |
                                                    |   |         .O |
                                                  __|    \        ,-'_
                                                / `L     `._  _,'  ' `.
                                                /    `--.._  `',.   _\  `
                                                `-.       /\  | `. ( ,\  \
                                              _/  `-._  /  \ |--'  (     \
                                              '  `-.   `'    \/\`.   `.    )
                                                    \  -hrr-    \ `.  |    |
                                """)
                            println("How can I help you sir?")
                            println("Yes I have lost my favorite manbun holder has anyone turned it in?")
                            println("I am not quite sure sir let me go take a look in the back.")
                            clubList -= "Bub City"
                            checkedClubList += "Bub City"
                            foundItYet(inventoryList, clubList,checkedClubList)
                        }; line
          case "no" =>  println("Not wanting to put off finding your favortite manbun holder any longer you decide to just let it be.")
                        println("With a couple of loud knocks on the door........")
                        println(checkedClubList.length)
                        if (checkedClubList.length <= 1 ) {
                          println("No one answers and you decide to check out the other places it could be")
                          listOfClubs(inventoryList, clubList,checkedClubList)
                        } else {
                            println("You are greeted by a very nice fellow.")
                             println("""
                                                   ,---.
                                                ,.'-.   \
                                                ( ( ,'\"\"\"\"\"-.
                                                `,X          `.
                                                /` `           `._
                                              (            ,   ,_\
                                              |          ,---.,'o `.
                                              |         / o   \     )
                                                \ ,.    (      .____,
                                                \| \    \____,'     \
                                              '`'\  \        _,____,'
                                              \  ,--      ,-'     \
                                                ( C     ,'         \
                                                  `--'  .'           |
                                                    |   |         .O |
                                                  __|    \        ,-'_
                                                / `L     `._  _,'  ' `.
                                                /    `--.._  `',.   _\  `
                                                `-.       /\  | `. ( ,\  \
                                              _/  `-._  /  \ |--'  (     \
                                              '  `-.   `'    \/\`.   `.    )
                                                    \  -hrr-    \ `.  |    |
                                """)
                            println("How can I help you sir?")
                            println("Yes I have lost my favorite manbun holder has anyone turned it in?")
                            println("I am not quite sure sir, I do not believe so but let me go take a look in the back.")
                            clubList -= "Bub City"
                            checkedClubList += "Bub City"
                            foundItYet(inventoryList, clubList,checkedClubList)

                        } ; line
          case "inventory" => showInventory(inventoryList); getChoice
          case _ => println("Please enter a valid input."); getChoice
        }
    }
        val helpBum = getChoice

        Thread.sleep(3000)
    
    
    // Here we want to say if you have not already decided to help the poor bum out then no one answers 
    // you can either choose to still ignore him or if you have more clubs to visit do that first.
    // if no clubs left to visit no one answers and you are given one more time to help the guy or 
    // just wait x amount of time
    // If you choose to help and you happened to give money to the bum from earlier you notice it is the 
    // same guy.... wonder what will happen now that you helped this dude out twice.

      // clubList -= "Bub City"
      // checkedClubList += "Bub City"
      // foundItYet(inventoryList, clubList,checkedClubList)
}

  def foundItYet(inventoryList: ArrayBuffer[String], clubList: ArrayBuffer[String],checkedClubList: ArrayBuffer[String]) {
      if (checkedClubList.length == 4 ){
          foundIt(inventoryList)
        } else {
          println("Sorry sir we have not found it, but feel free to come back tonight and we can check again. Where else have you checked?")
          println(s"Yes I have checked ${checkedClubList.mkString(" & ")} so far")
          println("Thank you for looking and have a nice day.")
          listOfClubs(inventoryList, clubList,checkedClubList)
        }
  }

  def drinkCoffee(inventoryList: ArrayBuffer[String]){
    println("You take another drink of your coffee")
      for (i <- 0 until inventoryList.length) {
        var list = inventoryList(i)
        if (list.contains("Coffee")){
            val indexOfCoffee = inventoryList.indexOf(list)
            val amountOfCoffeeLeft = list.split("\\D+").mkString.toInt - 1
            inventoryList.update(indexOfCoffee, s"${amountOfCoffeeLeft} drinks of Coffee")
            // println("Current Inventory " + EOL + inventoryList.mkString(EOL))
        }
      }
  }
  
  def addToInventory(inventoryList: ArrayBuffer[String],inventoryItem: String) {
    inventoryList += inventoryItem
    println(s"*** You added ${inventoryItem} to your inventory ***")
    // println("Current Inventory " + EOL + inventoryList.mkString(EOL))
  }


  def removeFromInventory(inventoryList: ArrayBuffer[String],inventoryItem: String) {
      inventoryList -= inventoryItem
      println(s"*** ${inventoryItem} was removed from your inventory ***")
      // println("Current Inventory " + EOL + inventoryList.mkString(EOL))
  }

  def showInventory(inventoryList: ArrayBuffer[String]){
       println("Current Inventory " + EOL + inventoryList.mkString(EOL))

  }


   def foundIt(inventoryList: ArrayBuffer[String]){
     Thread.sleep(5000)
     println("Why yes actually someone did turn it in. Here you are.")
     Thread.sleep(3000)
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
     System.exit(0)
   }

}
