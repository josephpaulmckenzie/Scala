object Demo {
   def main(arg: Array[String]) {
      printStrings("Hello");
   }
   
   def printStrings( args:String ) = {
      var i : Int = 0;
      println("args"+args)
      // for( arg <- args ){
      //    println("Arg value[" + i + "] = " + arg );
      //    i = i + 1;
      // }
   }
}