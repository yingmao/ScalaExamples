class Person{
    var name:   String = ""
    var age:    Int = 0
    var height: Float = 0
    var weight: Float = 0
    override def toString = "Name:" + name + ", age:" + age + ", height:" + height + ", weight:" + weight
}

object ObjectSortSample{
    def main(args:Array[String]){
        var list:List[Person] = List()
        var i = 0
        for(i <- 1 to 100){
            var p = new Person()
            p.name = BigInt(40, scala.util.Random).toString(36)
            p.age = scala.util.Random.nextInt(100)
            p.height = 1 + scala.util.Random.nextFloat() * 2
            p.weight = 80 + scala.util.Random.nextFloat() * 200
            list = p::list
        }
        list = list.sortWith((s,t)=>s.age < t.age)
        for(p <- list){
            println(p)
        }
    }
}


