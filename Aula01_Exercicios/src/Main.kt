fun main() {
    var primeiro = 12
    val copia = primeiro
    primeiro = 55

    println("Olá, mundo!")
    println(primeiro)
    println(copia)

    print("\nQual é a sua idade? ")
    val idade = readln().toIntOrNull()

    if (idade != null) {
        println("Ano que vem você vai ter ${idade + 1} anos")
    } else {
        println("Isso não parece uma idade válida")
    }
}
