object FlatList {


    def flatten[Any](list: List[Any]): List[Any] = list match {
        case Nil => Nil
        case head :: tail => (head match {
            case l: List[Any] => flatten(l)
            case i => List(i)
        }) ::: flatten(tail)
    }

}

object Main {
    def main(args : Array[String]){
        println(FlatList.flatten(List(List(1, 1), 2, List(3, List(5, 8, 45, 5, 233,122), 12 ,45))))
    }
}
