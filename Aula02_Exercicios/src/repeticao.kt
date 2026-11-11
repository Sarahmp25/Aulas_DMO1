import kotlin.random.Random

fun main() {
    println("\nEstruturas de repetição")
    println("------------------------------")

    print("\nQuantos números você quer somar? ")
    val quantidade = readln().toIntOrNull()

    if (quantidade != null) {
        var soma = 0.0

        for (i in 1..quantidade) {
            print("Número $i: ")
            val valor = readln().toDoubleOrNull()

            if (valor != null) {
                soma += valor
            } else {
                println("Valor inválido, ignorando")
            }
        }

        println("\nSoma total: $soma")
    } else {
        println("\nQuantidade inválida")
    }

    println("\n------------------------------")

    print("\nAltura do triângulo: ")
    val altura = readln().toIntOrNull()

    if (altura != null) {
        for (linha in 1..altura) {
            println("#".repeat(linha))
        }
    } else {
        println("\nValor inválido")
    }

    println("\n------------------------------")

    println("\nAdivinhe o número entre 1 e 100 (10 tentativas)")
    val sorteado = Random.nextInt(1, 101)
    var acertou = false

    for (tentativa in 1..10) {
        print("Tentativa $tentativa: ")
        val palpite = readln().toIntOrNull()

        if (palpite == null) {
            println("Palpite inválido, tentativa perdida")
            continue
        }

        if (palpite > sorteado) {
            println("Menor que $palpite")
        } else if (palpite < sorteado) {
            println("Maior que $palpite")
        } else {
            acertou = true
            break
        }
    }

    if (acertou) {
        println("\nAcertou! Parabéns!")
    } else {
        println("\nAcabaram as tentativas. O número era $sorteado")
    }
}
