fun main() {
    println("\nEstruturas condicionais")
    println("------------------------------")

    print("\nDigite um número inteiro: ")
    val numero = readln().toIntOrNull()

    if (numero != null) {
        val tipo = if (numero % 2 == 0) "par" else "ímpar"
        println("\nO número $numero é $tipo")
    } else {
        println("\nValor inválido")
    }

    println("\n------------------------------")

    print("\nPrimeiro número: ")
    val a = readln().toIntOrNull()

    print("Segundo número: ")
    val b = readln().toIntOrNull()

    print("Terceiro número: ")
    val c = readln().toIntOrNull()

    if (a != null && b != null && c != null) {
        println("\nO menor dos três é ${minOf(a, b, c)}")
    } else {
        println("\nPelo menos um dos valores é inválido")
    }

    println("\n------------------------------")

    print("\nPrimeiro número: ")
    val x = readln().toDoubleOrNull()

    print("Segundo número: ")
    val y = readln().toDoubleOrNull()

    if (x != null && y != null) {
        println("\n1. adição (+)")
        println("2. subtração (-)")
        println("3. multiplicação (*)")
        println("4. divisão (/)")

        print("\nOperação desejada: ")

        when (readln().toIntOrNull()) {
            1 -> println("Resultado: ${x + y}")
            2 -> println("Resultado: ${x - y}")
            3 -> println("Resultado: ${x * y}")
            4 -> if (y != 0.0) println("Resultado: ${x / y}") else println("Não dá para dividir por zero")
            else -> println("Operação inválida")
        }
    } else {
        println("\nPelo menos um dos valores é inválido")
    }
}
