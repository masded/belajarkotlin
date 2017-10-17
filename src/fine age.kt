/**
 * Created by SAINTEK 101 on 10/6/2017.
 */
fun main(args: Array<String>) {
    print("enter your DOB:")
    var DOB:Int= readLine()!!.toInt()

    var year=2017
    var Age:Int?
    Age=year-DOB

    println("Your age is $Age years")
}