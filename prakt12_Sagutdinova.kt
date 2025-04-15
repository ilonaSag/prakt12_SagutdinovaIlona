import kotlinx.coroutines.*
import kotlin.random.Random

suspend fun main () = coroutineScope{
    try
    {println("Введите n:")
    val n = readLine()!!.toInt()
    if (n>0)
    {
        launch{
            for (i in 1..n){
                println(Dano(i))
            }
        }
    }
    else
        println("n должно быть больше 0")
    }
    catch (e:Exception)
    {
        println("Неверный ввод")
    }
}
suspend fun Dano(index:Int):String{
    val time = Random.nextLong(200, 1500)
    val value = Random(index).nextInt()
    delay(time)
    return "$index: $value (задержка $time)"
}