val catalogo = listOf(
    ItemPedido(1, "Livro de Kotlin", 79.90, "Físico", 0.45),
    ItemPedido(2, "E-book de Android", 29.90, "Digital", 0.0),
    ItemPedido(3, "Notebook", 3500.00, "Físico", 1.80),
    ItemPedido(4, "Curso online de Banco de Dados", 149.90, "Digital", 0.0),
    ItemPedido(5, "Teclado mecânico", 289.90, "Físico", 0.90),
    ItemPedido(6, "Headset", 199.90, "Físico", 0.35),
    ItemPedido(7, "Licença de IDE", 399.00, "Digital", 0.0)
)

fun main() {
    println("\n --- Loja Tech da Sah: Sistema de Pedidos ---")
    println(" --------------------------------------------\n")

    println(" Informe seus dados para iniciar a compra...")
    println(" ----------------------")

    print(" CPF: ")
    val cpf = readln()

    print(" Nome: ")
    val nome = readln()

    print(" Email: ")
    val email = readln()

    val cliente = Cliente(cpf, nome, email)
    val pedido = Pedido(123)
    pedido.cliente = cliente

    var temProdutoDigital = false

    println("\n --------------------------------------------\n")
    println(" Escolha os produtos para o carrinho...")

    var opcao: Int?

    do {
        println("\n Produtos disponíveis:")
        for (produto in catalogo) {
            println(" ${produto.codigoProduto} - ${produto.nomeProduto}")
        }
        println(" 0 - Finalizar compra\n")

        print(" Digite o código do produto: ")
        opcao = readln().toIntOrNull()

        if (opcao == null) {
            println("\n Entrada inválida...")
        } else if (opcao == 0) {
            println("\n Finalizando a compra...")

            pedido.calcularSubtotal()

            print("\n Possui cupom de desconto? (1. sim) (2. não): ")
            if (readln().toIntOrNull() == 1) {
                println(" Aplicando desconto de acordo com o subtotal...\n")
                pedido.aplicarDesconto()
            }

            pedido.calcularFrete()
            pedido.calcularValorTotal()
        } else {
            val escolhido = catalogo.find { it.codigoProduto == opcao }

            if (escolhido != null) {
                println("\n Adicionando ${escolhido.nomeProduto} ao carrinho...")
                pedido.addItemPedido(escolhido)
                if (escolhido.ehDigital) {
                    temProdutoDigital = true
                }
            } else {
                println("\n Código inválido...")
            }
        }
    } while (opcao != 0)

    println("\n --------------------------------------------\n")

    println(" Informações do cliente:")
    println(" -----------------------")
    println(cliente)

    println("\n Lista de itens:")
    println(" ---------------")
    for (item in pedido.listaItens) {
        println(item)
    }

    println("\n Detalhes do pedido:")
    println(" ------------------")
    println(pedido)

    if (temProdutoDigital) {
        println(" Os produtos digitais serão enviados para '${cliente.email}' 10 minutos após o pagamento :)")
    }
}
