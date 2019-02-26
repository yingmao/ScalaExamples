object SwitchCaseSample {
    
    case class Person(name: String,age: Int)

    def main(args: Array[String]){
        println("Input name:")
        val name = scala.io.StdIn.readLine()
        println("Input age:")
        val age = scala.io.StdIn.readLine().toInt
        val person = new Person(name,age)
        person match{
            case Person("Jimmy",28) => println("Hello,Jimmy,I know you!")
            case Person("Bob",29) => println("Hello,Bob,I know you!")
            case Person("Alice",15) => println("Hello,Alice,you are young!")
            case Person(name,11) => println("Hi," + name + ",you are very young!!!")
            case Person(name,age)=> println("Hello,Your name:" + name + ",your age:" + age)
        }
    }

}
