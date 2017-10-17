/**
 * Created by SAINTEK 101 on 10/2/2017.
 */
import java.util.*

fun main(args: Array<String>) {
    //input
    print("masukkan DOB mu : ")
    var DOB:Int= readLine()!!.toInt()

    //proses
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var age:Int?
    age=year-DOB

    //OUTPUT
    println("umurmu adalah $age tahun")

}