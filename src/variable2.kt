/**
 * Created by SAINTEK 101 on 9/30/2017.
 */
fun main(args: Array<String>) {
    print("masukkan nama : ")
    var name = readLine()
    print("masukkan umur : ")
    var age: Int = readLine()!!.toInt()
    print("masukan department : ")
    var department: String?
    department = readLine()
    println()
    println("name : " + name)
    println("age : " + age)
    println("department : " + department)
    val pi: Double = 3.14
    println("pi : " + pi)
}