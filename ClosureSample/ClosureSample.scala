object ClosureSample{

    def main(args: Array[String]): Unit = {
        
        def getEventCallbackFunc(event:String) = (data:String) => println("Event:<" + event + ">,Data:<" + data + ">")

        def clickEvent = getEventCallbackFunc("click")
        def moveEvent = getEventCallbackFunc("move")

        clickEvent("x=23,y=45")
        moveEvent("from (1,4) to (4,5)")


    }

}
