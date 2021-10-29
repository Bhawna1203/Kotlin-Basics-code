/*fun main()
{
  var animal="dog"
  when(animal)
  {
      "horse" -> println("ANIMAL IS HORSE")
      "cat"   -> println("ANIMAL IS CAT")
      "dog"   -> println("ANIMAL IS DOG")
      else    -> println("ENTERED ELEMENT S NOT DOG")
  }
}
*/
/*
//FOR TABLE PROGRAM
fun table(num:Int){

    var count:Int = 1;
    while(count<=10){
        println("$num * $count  = "+num*count)
        count++
    }


}
fun main(){
    println("ENTER THE NUMBER WHOSE TABLE YOU WANT TO KNOW:")
    var n = Integer.valueOf(readLine())
    table(n)
}
*/
fun main(){
    printmessage(3)
    printmessage()
}
fun printmessage(count:Int = 2){
    for(i in 1..count){
        println("Hello $i")
    }
}

fun add(num:Int , num2:Int) = num+num2

fun evenOrOdd(num1 : Int){
    val result = if(num1%2 == 0) "even" else "odd"
    println(result)
}