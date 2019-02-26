object ListSample {

    def main(args : Array[String]){
        var list: List[String] = List()
        println("Make random string list")
        for(i <- 1 to 100){
            val rnd = scala.util.Random.nextInt(1000) 
            list = ("Item "+ rnd)::list
        }
        println(list)
        //sort
        list = list.sortWith((s,t)=>s.compareTo(t)>0)
        println("Sort list")
        println(list)
        println("Reverse list")
        list = list.reverse
        println(list)
        //remove
        println("Add a item")
        list = "New Item 1"::"New Item 2"::list
        println(list)
        println("Remove a item")
        list = list.drop(1)
        println(list)
        println("Filter list")
        list = list.filter((a)=>a.length == 7)
        println(list)
        println("Max:" + list.max + ",Min:" + list.min)
        println("mkString:\n:" + list.mkString("\n   =====  \n"))

    }

}
