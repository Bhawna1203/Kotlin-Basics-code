fun main(){

    //here i am caling class  car instance variables and functions

    val mustang = car("mustang","diesel",100)
    val mustang2 = car("beetle","diesel",2000)
    println(mustang.name)
    println(mustang.type)
    mustang.driveCar()


    //here i am calling model class instance variables
    var m1 = model()
    m1.model_name = "maruti"
    m1.model_color = "black"
    m1.model_price = 100211
    m1.print_data_of_model()


}
//here we follow consructor approach 
class car(val name:String, val type:String, var kmRan:Int)
{
    fun driveCar(){
        println("$name Car is driving")
    }
    fun applyBrakes(){
        println("appied brakes")
    }
}
//here we follow simple class method
class model{
    var model_name = ""
    var model_color = " "
    var model_price = 0
    init{
        println("$model_name is created")
    }

    fun print_data_of_model(){
        println("This $model_name model of car is $model_color has price of $model_price")
    }
}