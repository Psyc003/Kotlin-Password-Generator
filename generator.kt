import kotlin.random.Random

fun getRandPassword(n: Int): String
{
    val characterSet = "123456789abcdefghijklmnopqrstuvwxyz"

    val random = Random(System.nanoTime())
    val password = StringBuilder()

    for (i in 0 until n)
    {
        val rIndex = random .nextInt(characterSet.length)
        password.append(characterSet[rIndex])
    }

    return password.toString()
}

fun main() {
    val n = 8
    println(getRandPassword(n))
}


