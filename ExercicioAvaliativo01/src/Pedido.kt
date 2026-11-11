class Pedido(val codigoPedido: Int) {

    var subtotal: Double = 0.0
    var frete: Double = 0.0
    var desconto: Double = 0.0
    var valorTotal: Double = 0.0

    var cliente: Cliente = Cliente("", "", "")
    val listaItens = mutableListOf<ItemPedido>()

    fun addItemPedido(item: ItemPedido) {
        listaItens.add(item)
    }

    fun calcularSubtotal() {
        subtotal = listaItens.sumOf { it.precoProduto }
    }

    fun aplicarDesconto() {
        desconto = when {
            subtotal >= 500.0 -> 0.2
            subtotal >= 250.0 -> 0.1
            subtotal >= 100.0 -> 0.05
            else -> 0.0
        }
    }

    fun calcularFrete() {
        val pesoTotal = listaItens.filter { !it.ehDigital }.sumOf { it.pesoProduto }
        frete = pesoTotal * 5
    }

    fun calcularValorTotal() {
        valorTotal = subtotal - (subtotal * desconto) + frete
    }

    override fun toString(): String {
        return " ID Pedido: $codigoPedido\n" +
                " Subtotal: R$${"%.2f".format(subtotal)}\n" +
                " Frete: R$${"%.2f".format(frete)}\n" +
                " Desconto: ${desconto * 100}%\n" +
                " Valor Total: R$${"%.2f".format(valorTotal)}\n"
    }
}
