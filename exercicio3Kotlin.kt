

import kotlin.text.toDouble

fun main(){

    println("Qual o valor?")

    val valor = readLine()!!.toDouble()
    
    println("")
    println("Digite o tipo de pagamento:")
    println("1. Pix")
    println("2. Credito")
    println("3. Boleto")

    val opcao = readLine()!!.toInt()

    var tipoPagamento : String

    when(opcao){
        1 -> tipoPagamento = "Pix"
        2 -> tipoPagamento = "Credito"
        3 -> tipoPagamento = "Boleto"
        else -> tipoPagamento = "Opcao invalida";
    }

    println("")
    println("Opcao selecionada: " + tipoPagamento)
    println("Valor: R$" + "%.2f".format(valor))

}