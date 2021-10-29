fun main(){
    var s1 = Smartphone()
    println(s1.makeCall())
    println(s1.display())
    println(s1.playMovie())
    println(s1.getLocation())

}

open class BasicPhone{
    val name:String = " "
    val type:String = " "
    val volume:Int = 0

    fun makeCall(){
        println("i am basic phone class")

    }
    fun display(){
        println("phone is $name")

    }
    fun poweroff(){
        println("my pc power is always down:(")

    }
    fun getDeviceInfo(){
        println("what about your plan for today")

    }
    fun getScreenInfo(){
        println("phone volume is $volume")

    }
}
class SmartPhone :BasicPhone(){
    val name:String = " "
    val type:String = " "
    val volume:Int = 0

    
    fun playMovie(){
        println("now i am class smartphone")
    }
    fun takePicture(){
        println("are you okk with me")
    }
    fun getLocation(){
        println("what about your location ")
    }
}

