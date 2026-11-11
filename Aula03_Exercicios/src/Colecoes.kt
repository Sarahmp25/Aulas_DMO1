fun main() {
    println("\nExercício 1 - List")
    println("---------------------")

    val numeros = mutableListOf<Int>()

    println("\nDigite 5 números inteiros...")

    for (i in 1..5) {
        print("Número $i: ")
        val valor = readln().toIntOrNull()

        if (valor != null) {
            numeros.add(valor)
        }
    }

    val pares = filtrarPares(numeros)

    if (pares.isNotEmpty()) {
        println("\nPares encontrados:")
        pares.forEach { println(it) }
    } else {
        println("\nNenhum número par foi digitado")
    }

    println("\n---------------------")

    println("\nExercício 2 - Set")
    println("---------------------")

    print("Digite uma frase: ")
    val frase = readlnOrNull()

    if (!frase.isNullOrBlank()) {
        val palavrasUnicas = frase.split(" ").toSet()
        println("\nA frase tem ${palavrasUnicas.size} palavra(s) única(s)")
    } else {
        println("\nNenhuma frase digitada")
    }
}

fun filtrarPares(numeros: List<Int>): List<Int> {
    return numeros.filter { it % 2 == 0 }
}
