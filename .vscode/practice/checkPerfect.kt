fun checkperfect(num:Int)
{
    var sum:Int = 0
    for(i in 1..num)
        if(num%i == 0)
        sum+=i;

    if(sum == num)
       println("ENTERED NUMBER $num IS PERFECT ")    

    else
       println("ENTERED NUMBER $num IS NOT PERFECT")   

}
fun main()
{
    print("ENTER THE NUMBER THAT YOU WANT TO CHECK PERFECT OR NOT: ")

    val number = Integer.valueOf(readLine())
    println("The entered number is: $number")
    checkperfect(number)
}