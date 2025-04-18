import kotlinx.coroutines.*
suspend fun main() = coroutineScope{
    try
    {
        println("Выберите количество участников")
        val k = readln()!!.toInt()
        var list = mutableListOf<String>()
        println("Нажмите 1, если хотите загрузить участников")
        val n = readln()!!.toInt()
        if (n==1)
        {if (k > 0)
        {
            launch{
                    Input(k, list)
            }
        }
            else
                println("k не может быть меньше 0")
        }
        else {
            println("Неверный выбор")
        }
    }
    catch (e:Exception)
    {
        println("Неверный ввод")
    }
}
suspend fun Input(index:Int, list: MutableList<String>){
    for (i in 1..index) {
        println("Введите участника:")
        val user = readln()!!.toString()
        println("Введите пароль:")
        val pasword = readln()!!.toInt()
        println("Введите количество репрозиториев:")
        val repr = readln()!!.toInt()
        val all = "${repr} - репрозиторий ${user} - пользователь ${pasword} - пароль"
        list.add(all)
    }
    println("Нажмите 2, если хотите вывести участников")
    val t = readln()!!.toInt()
    if (t == 2) {
        val n = readln()!!.toString()
        println("Загружаются участники")
        delay(3000L)
        val sort = list.sorted()
        for (item in sort) {
            println(item)
        }
    }
    else {
        println("Неверный выбор")
    }
}