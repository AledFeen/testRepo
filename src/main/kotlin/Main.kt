fun main(args: Array<String>) {
    println("Введите числа через пробел:")
    val input = readLine()

    if (input != null) {
        val numbers = input.trim().split(" ").mapNotNull { it.toIntOrNull() }

        if (numbers.isNotEmpty()) {
            val sum = numbers.sum()
            println("Сумма чисел: $sum")
        } else {
            println("Не введено ни одного числа.")
        }
    } else {
        println("Некорректный ввод.")
    }
}