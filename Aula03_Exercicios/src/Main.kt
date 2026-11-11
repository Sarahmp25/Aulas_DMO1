fun main() {
    saudacao("Sarah")

    println(dobroDaSoma(2, 3))
    println(dobroDaSomaCurto(7, 2))

    println("Média 1: ${media(5.0, 3.5)}")
    println("Média 2: ${media(9.5, 2.4, 6.7)}")

    val nome = "Sarah"
    println("O nome '$nome' tem ${nome.tamanho()} letras")

    val numeros = mutableListOf(40, 50, 60)
    numeros.add(45)
    numeros.remove(40)

    println("\nLista")
    for (n in numeros) {
        println(n)
    }

    val unicos = mutableSetOf(1, 8, 1, 9, 1, 10, 1)
    unicos.add(8)

    println("\nConjunto")
    for (n in unicos) {
        println(n)
    }

    val dias = mutableMapOf(1 to "segunda", 2 to "terça", 3 to "quarta")

    println("\nMapa")
    for ((chave, valor) in dias) {
        println("$chave -> $valor")
    }
}

fun saudacao(nome: String) {
    println("$nome está aprendendo Kotlin :)")
}

fun dobroDaSoma(a: Int, b: Int): Int {
    return (a + b) * 2
}

fun dobroDaSomaCurto(a: Int, b: Int) = (a + b) * 2

fun media(vararg notas: Double): Double {
    return notas.sum() / notas.size
}

fun String.tamanho(): Int {
    return this.length
}
