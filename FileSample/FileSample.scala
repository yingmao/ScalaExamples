import scala.io.Source
import java.io.File
import java.io.PrintWriter

object FileSample {
    
    def main(args: Array[String]): Unit = {
        val fileName = "example.txt";
        val writer = new PrintWriter(new File(fileName))
        println("Writing file...")
        for( a <- 1 to 10){
            writer.write("Line " + a + "\n")
        }
        writer.close()
        println("Write file ok!")
        println("Reading file...")
        Source.fromFile(fileName).foreach{
            print
        }
        println("Reading file ok!")
    }

}
