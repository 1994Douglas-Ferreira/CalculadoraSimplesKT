class Calculadora {

    fun somar(num1 :Int, num2:Int):Float = num1.plus(num2).toFloat()

    fun subtrair(num1 :Int, num2:Int):Float = num1.minus(num2).toFloat()

    fun multiplicar(num1 :Int, num2:Int):Float =  num1.times(num2).toFloat()

    fun dividir(num1 :Int, num2:Int):Float = num1.div(num2).toFloat()


}
fun main(args : Array<String>){
    println("Digite o primeiro numero:")
    val num1 = readLine()!!.toInt()
    println("Digite o segundo numero:")
    val num2 = readLine()!!.toInt()
    println("Digite o operador em numero 1(+) 2(-) 3(*) 4(/):30")
    val operador = readLine()!!.toInt()

    when(operador){
        1 -> {println(Calculadora().somar(num1, num2))}
        2 -> {println(Calculadora().subtrair(num1, num2))}
        3 -> {println(Calculadora().multiplicar(num1, num2))}
        4 -> {println(Calculadora().dividir(num1, num2))}
        else -> {
            print("Error!")
        }
    }
}