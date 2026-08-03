class Main {
    fun main() {

        var num1 = 12;
        val num2: Int = num1;
        num1 = 55;

        println ("Hello World");
        println (num1);
        println (num2);

        //============================================

        //leitura de dados
        println("Digite a  sua idade: ");
        var idade = readln().toIntOrNull();

        if (idade != null) {
            println("No ano que vem sua idade será: $idade +1}")
        }else{
            println("Idade digitada de forma incorreta");
        }

        //---------------------------------------------------------
        //------------------- EXERCICIO 1 -------------------------

        println ("Digite uma palavra: ");
        val palavra = readlnOrNull()?: ""

        val maiuscula = palavra.uppercase()
        val minuscula = palavra.lowercase()

        // Exibindo o resultado formatado
        println("Maiúsculas: $maiuscula | Minúsculas: $minuscula")


        //---------------------------------------------------------
        //------------------- EXERCICIO 2 -------------------------

        println("Digite dois números para executar a soma: ");

        println("Digite o primeiro número:")
        val input1 = readlnOrNull()
        val num1 = input1?.toIntOrNull() ?: 0

        println("Digite o segundo número:")
        val input2 = readlnOrNull()
        val num2 = input2?.toIntOrNull() ?: 0

        val soma = num1 + num2
        println("A soma é: $soma")

        //---------------------------------------------------------
        //------------------- EXERCICIO 3 -------------------------

        println("Digite um número para verificar se é par ou ímpar: ");
        val numero = readlnOrNull()?.toIntOrNull()

        if (numero == null) {
            println("O número digitado é inválido.")
        }else if (numero % 2 == 0){
            println("o número escolhido é par");
        }else{
            println("o número escolhido é ímpar");
        }

        //---------------------------------------------------------
        //------------------- EXERCICIO 4 -------------------------


        //---------------------------------------------------------
        //------------------- EXERCICIO 5 -------------------------

    }
}
