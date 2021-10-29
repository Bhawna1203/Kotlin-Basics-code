fun main(){
    var car1 = AutoMobile("maruti",4,5,"petrol")
    var cat2 = AutoMobile("car2","petrol")
    
}


class AutoMobile(val name:String,val tyres:Int,val maxseating: Int, val engineType : String) //PRIMARY CONSTRUCTOR
{
    init{
        println("$name is created")
        println("$tyres is created")
    }
    init{
        println("2nd initializer block")
    }
    constructor(nameparam:String, engineParam:String):
              this(nameparam,4,5,engineParam)
    fun drive(){}
    fun applyBrakes(){}
}
