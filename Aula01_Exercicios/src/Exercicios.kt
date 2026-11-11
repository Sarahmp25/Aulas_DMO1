fun main() {
    print("\nDigite uma palavra: ")
    val palavra = readln()

    println("Maiúsculas: ${palavra.uppercase()}")
    println("Minúsculas: ${palavra.lowercase()}")

    println("\n------------------------------")

    print("\nPrimeiro número: ")
    val a = readln().toIntOrNull()

    print("Segundo número: ")
    val b = readln().toIntOrNull()

    if (a != null && b != null) {
        println("$a + $b = ${a + b}")
    } else {
        println("Preciso de dois números inteiros válidos")
    }

    println("\n------------------------------")

    print("\nDigite um número inteiro: ")
    val numero = readln().toIntOrNull()

    if (numero != null) {
        val tipo = if (numero % 2 == 0) "par" else "ímpar"
        println("O número $numero é $tipo")
    } else {
        println("Número inválido")
    }

    println("\n------------------------------")

    print("\nNota 1: ")
    val nota1 = readln().toFloatOrNull()

    print("Nota 2: ")
    val nota2 = readln().toFloatOrNull()

    print("Nota 3: ")
    val nota3 = readln().toFloatOrNull()

    if (nota1 != null && nota2 != null && nota3 != null) {
        val media = (nota1 + nota2 + nota3) / 3

        val situacao = when {
            media >= 6 -> "aprovada(o)"
            media >= 4 -> "em recuperação"
            else -> "reprovada(o)"
        }
        println("Média %.2f: situação %s".format(media, situacao))
    } else {
        println("Alguma das notas é inválida")
    }

    println("\n------------------------------")

    print("\nTemperatura em graus Celsius: ")
    val celsius = readln().toDoubleOrNull()

    if (celsius != null) {
        print("Converter para Fahrenheit (1) ou Kelvin (2)? ")

        when (readln().toIntOrNull()) {
            1 -> println("Fahrenheit: %.2f".format(celsius * 9 / 5 + 32))
            2 -> println("Kelvin: %.2f".format(celsius + 273.15))
            else -> println("Escolha inválida")
        }
    } else {
        println("Temperatura inválida")
    }
}
