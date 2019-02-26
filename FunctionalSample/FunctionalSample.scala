object FunctionalSample{

    def main(args: Array[String]){

        def add = (a: Int,b: Int) => a + b
        def mul = (a: Int,b: Int) => a * b
        def sub = (a: Int,b: Int) => a - b
        def div = (a: Int,b: Int) => a / b

        def opt(f:(Int,Int)=>Int,a: Int,b: Int) = {
            val r = f(a,b)
            println(r)
        }
        opt(add,1,2)
        opt(mul,3,5)
        opt(div,5,2)
        opt(sub,100,43)
    }
    
}
