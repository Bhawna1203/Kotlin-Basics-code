/*
// BASICALLY THIS ONE FOR LATE INIT USE AND DEFAULT CONSTRUCTOR
fun main(){
    val ob = Calculator()
    println(ob.add(2,3))
}



class Calculator{

    lateinit var message:String
 
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}
*/

fun main() {
    val ob = person("bhawna",18)
    println(ob.age)
    ob.age = -112
    println(ob.age)

}

class person(nameperson:String, ageperson:Int){
    var name:String = nameperson
    get(){
        println("name getter is called")
        return field.toUpperCase()
    }

    var age:Int = ageperson
    set(value){
        if(value > 0){
            field = value
        }
        else{
            println("AGE CAN'T BE NEGATIVE")
        }
    }
}