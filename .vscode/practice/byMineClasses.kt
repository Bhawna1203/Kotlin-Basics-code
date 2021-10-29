//WE USE OPEN BEFORE THE CLASS IF YOU WANT TO INHERIT THE PROPERTIES OF PARTICULAR CLASS
open class BaseCofeeMachine(val price:Double,val colour:String //in this line we have attributes
{
    //function in class is called behaviour
    fun makeCofee(){
        println("here is your coffee")
    }
}
//NOW YOU CAN INERIT PROPERTIES OF CLASS BaseCofeeMachine()
class PremiumCoffeeMachine(val price:Double,val colour:String) : BaseCofeeMachine(){


}
fun main(){
    val coffeeMachine = BaseCofeeMachine(10000,brown) //here we create instance of class
    coffeeMachine.makeCofee()
    println("NOW FOR INSTANCE OF PREMIUM COFFEE MACHINE!!")
    val PremiumCoffee = PremiumCoffeeMachine(10000,black)
    PremiumCoffee.makeCofee()
}