import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    println("\nCálculos")
    println("------------------------------")

    val jogadorX = Random.nextInt(1, 11).toDouble()
    val jogadorY = Random.nextInt(1, 11).toDouble()
    val inimigoX = Random.nextInt(1, 11).toDouble()
    val inimigoY = Random.nextInt(1, 11).toDouble()

    val distancia = sqrt((inimigoX - jogadorX).pow(2) + (inimigoY - jogadorY).pow(2))

    if (distancia <= 5.0) {
        println("\n[MODO DE ATAQUE]")
        println("O inimigo está perto!")
    } else {
        println("\nInimigo longe, fique atenta(o)")
    }

    println("\n------------------------------")

    print("\nDigite uma palavra: ")
    val palavra = readln().lowercase()

    if (palavra.isNotEmpty()) {
        if (palavra == palavra.reversed()) {
            println("\n'$palavra' é um palíndromo")
        } else {
            println("\n'$palavra' não é um palíndromo")
        }
    } else {
        println("\nNenhuma palavra digitada")
    }

    println("\n------------------------------")

    println("\nCoordenadas do tabuleiro (de 1 a 8)")

    print("X: ")
    val x = readln().toIntOrNull()

    print("Y: ")
    val y = readln().toIntOrNull()

    if (x != null && y != null && x in 1..8 && y in 1..8) {
        val cor = if ((x + y) % 2 == 0) "preta" else "branca"
        println("\nCasa $cor")
    } else {
        println("\nCoordenadas inválidas")
    }
}
