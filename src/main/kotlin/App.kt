fun main() {
    println("===============================")

    val conta = Conta(titular = "Lucas", numero = 1000)

    println(conta::titular)

    conta.deposita(valor = 50.0)
    conta.saca(valor = 500.0)
}

class Conta(val titular: String, private val numero: Int = 0) {

    private var saldo: Double = 0.0

    /*fun getSaldo(): Double {
        return this.saldo;
    }

    fun setSaldo(saldo: Double) {
        this.deposita(saldo);
    }

    fun getTitular(): String {
        return this.titular;
    }

    fun setTitular(titular: String) {
        this.titular = titular;
    }*/

    fun deposita(valor: Double) {
        this.saldo += valor
        print("Depósito de $valor realizado.")
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            println("Saque de: $valor realizado")
        } else {
            println("Saldo de ${this.saldo} insuficiente para saque de $valor.")
        }
    }

    fun transferencia(destino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saca(valor = valor)
            destino.deposita(valor = valor)
            println("Transferência de: $valor para ${destino.numero} realizada")
            return true
        }

        println("Saldo de ${this.saldo} insuficiente para tranferência de $valor para ${destino.numero}.")
        return false
    }

}


fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva.")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta negativa")
    }
}

fun testaLacos() {
    /*loop@*/ zezinho@ for (i in 0..199) {
/*    for (i in 0..5 step 2) {
      for (i in 5 downTo 1) {*/
        for (x: Int in 5 downTo 0 step 3) {

            println("$x")
            for (j in 199 downTo 0) {
                println("$j")
                break@zezinho/*@loop*/
                /**
                 * Sobre @loop -> https://cursos.alura.com.br/forum/topico-para-que-server-o-loop-112537
                 */
            }

            val titular = "Lucas $i"
            val numeroConta: Int = 1000 + i
            var saldo: Double = 0.0 + i
            saldo += 0

            println("Titular: $titular              |")
            println("Numero Conta: $numeroConta            |")
            println("Saldo: $saldo                    |")

//    testaCondicoes(saldo);

            println("===============================")
        }
    }
}