class ItemPedido(
    val codigoProduto: Int,
    val nomeProduto: String,
    val precoProduto: Double,
    val tipoProduto: String,
    val pesoProduto: Double
) {

    val ehDigital: Boolean
        get() = tipoProduto == "Digital"

    override fun toString(): String {
        return " ID: $codigoProduto - $nomeProduto\n Preço: R$${"%.2f".format(precoProduto)} | Tipo: $tipoProduto | Peso: $pesoProduto kg\n"
    }
}
