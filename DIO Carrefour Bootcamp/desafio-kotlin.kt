import java.util.*

fun main(args: Array<String>) {
   val input = Scanner(System.`in`)
   val salario = input.nextDouble()
   val beneficio = input.nextDouble()

    val reajuste = when {
        salario > 2500 -> 15
        salario > 1100 -> 10
        salario > 0 -> 5
        else -> 5
    }

    val novoSalario = salario * (1 - reajuste/100.0) + beneficio

    System.out.printf("%.2f",  novoSalario); 
}