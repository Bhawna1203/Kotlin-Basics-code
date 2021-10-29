fun swapTemp()
{
    println("ENTER THE FIRST NUMBER FOR SWAPPING:")
    var num1 = Integer.valueOf(readLine())
    println("ENTER THE SECOND NUMBER FOR SWAPPING:")
    var num2 = Integer.valueOf(readLine())

    var temp:Int = 3;

    println("BEFORE SWAPPING NUMBERS ARE  $num1  AND  $num2")
    temp = num1
    num1 = num2
    num2 = temp
    println("NUMERS AFTER SWAPPING ARE  $num1 AND  $num2")
}
fun swapAddition()
{
    println("ENTER THE FIRST NUMBER FOR SWAPPING:")
    var num1 = Integer.valueOf(readLine())
    println("ENTER THE SECOND NUMBER FOR SWAPPING:")
    var num2 = Integer.valueOf(readLine())

    

    println("BEFORE SWAPPING NUMBERS ARE  $num1  AND  $num2")
    num1= num1+num2
    num2 = num1-num2
    num1 = num1-num2
    println("NUMERS AFTER SWAPPING ARE  $num1 AND  $num2")
}

fun main(){
    do
    {
        println("***************************************************")
        println("------------------------ MENU ---------------------")
        println("***************************************************")
        println("*              1.USING TEMP                       *")
        println("*              2.USING ADDITION                   *")
        println("*              3.USING XOR                        *")
        println("---------------------------------------------------")
        println("\n\n\n")
        println("ENTER THE CHOICE WHICH METHOD YOU WANT TO PREFER FOR SWAPPING: ")
        var a = Integer.valueOf(readLine())

        if(a==1)
        {
           
            swapTemp()

        }
        else if(a == 2)
        {
            swapAddition()
        }

        println("DO YOU WANT TO CONTINUE(1/0) : ")
        var ch= Integer.valueOf(readLine())
       
    }while(ch == 1  );

}