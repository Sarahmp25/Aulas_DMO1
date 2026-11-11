class Cliente(val cpf: String, val nome: String, val email: String) {

    override fun toString(): String {
        return " CPF: $cpf\n Nome: $nome\n Email: $email\n"
    }
}
