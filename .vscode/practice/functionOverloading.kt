import kotlin.math.pow
fun main(){
    var fn: (a: Double, b: Double) -> Double = ::addition
    println(fn(a:1.0, b:2.0))
    var fn=::power
    println(fn(a:2.34, b:4.0))

}

fun addition(a:Double,b:Double):Double
{
    return a+b
}
fun power(a:Double,b:Double):Double
{
    return a.pow(b)
}
