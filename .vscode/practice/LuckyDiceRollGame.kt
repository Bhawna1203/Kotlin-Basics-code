 
fun main(){
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

  /*  if (rollResult == luckyNumber) {
        println("You win!")
    } else if (rollResult == 1) {
        println("So sorry! You rolled a 1. Try again!")
    } else if (rollResult == 2) {
        println("Sadly, you rolled a 2. Try again!")
    } else if (rollResult == 3) {
        println("Unfortunately, you rolled a 3. Try again!")
    } else if (rollResult == 5) {
        println("Don't cry! You rolled a 5. Try again!")
    } else {
        println("Apologies! You rolled a 6. Try again!")
    }
    */
    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }

}

/* 

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1 ..numSides).random()
    }
}
*/

/*
//PRACTICE CODE FOR BEGINEERS
fun main(){
    val myFirstDice = Dice(8)
    val num = myFirstDice.roll()
    val luckyNumber = 4
    when(num){
        luckyNumber -> println("You win!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
        7 -> println("Apologies! you rolled a 7. Try again!")
        8 -> println("Apologies! you rolled a 8. Try again!")
      
    }
}
class Dice(val numSides: Int) {
    fun roll():Int{
        return (1 ..numSides).random()
    }
}



*/