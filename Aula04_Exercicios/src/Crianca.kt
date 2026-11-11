class Crianca(cpf: String, nome: String, email: String) : Pessoa(cpf, nome, email), SerVivo {
    var dentesDeLeite: Int = 0
    var usaChupeta: Boolean = false

    override var habitat: String = "Em qualquer lugar"

    override fun andar() {
        println("Engatinhando...")
    }

    override fun respiracao() {
        println("Respira oxigênio")
    }

    override fun mover() {
        println("Aprendendo a andar...")
    }

    override fun som() {
        println("Chora, brinca, sorri, fala...")
    }
}
