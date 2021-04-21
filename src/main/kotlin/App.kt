fun main() {
    println("===============================");
    /*loop@*/ zezinho@ for (i in 0..199) {
/*    for (i in 0..5 step 2) {
      for (i in 5 downTo 1) {*/
        for (i in 5 downTo 0 step 3) {

            println("$i")
            for (j in 199 downTo 0) {
                println("$j")
                break@zezinho/*@loop*/;
                /**
                 * Sobre @loop -> https://cursos.alura.com.br/forum/topico-para-que-server-o-loop-112537
                 */
            }

            val titular: String = "Lucas $i";
            val numeroConta: Int = 1000 + i;
            var saldo: Double = 0.0 + i;

            println("Titular: $titular              |");
            println("Numero Conta: $numeroConta            |");
            println("Saldo: $saldo                    |");

//    testaCondicoes(saldo);

            var nomes: List<String> = arrayListOf("Lucas", "João", "Marcos", "Matheus", "José");


            println("===============================");
        }

    }

    fun testaCondicoes(saldo: Double) {
        when {
            saldo > 0.0 -> println("Conta é positiva.");
            saldo == 0.0 -> println("Conta é neutra");
            else -> println("Conta negativa")
        }
    }
}