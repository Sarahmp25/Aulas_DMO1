fun main() {
    val adulta = Pessoa("111.111.111-11", "Sarah", "sarah@gmail.com")
    println("Nome: ${adulta.nome}")
    println("CPF: ${adulta.cpf}")
    println("Email: ${adulta.email}")
    adulta.andar()

    println()

    val crianca = Crianca("333.333.333-33", "Sarah", "sem email")
    crianca.dentesDeLeite = 12
    crianca.usaChupeta = true

    println("Nome: ${crianca.nome}")
    println("CPF: ${crianca.cpf}")
    println("Email: ${crianca.email}")
    println("Dentes de leite: ${crianca.dentesDeLeite}")
    println("Usa chupeta: ${crianca.usaChupeta}")
    println("Onde habita: ${crianca.habitat}")

    crianca.andar()
    crianca.respiracao()
    crianca.mover()
    crianca.som()

    println()

    val adolescente = Adolescente()
    adolescente.idioma = "Português"

    println(adolescente.idioma)
    adolescente.praticas()
}
