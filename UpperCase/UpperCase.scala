object UpperCase{

    def main(args: Array[String]){
        println("Input string (split by space):")
        val str = scala.io.StdIn.readLine()
        var strs = str.split(" ")
        strs = strs.map(_.toUpperCase)
        strs.map(println(_))
    }

}
