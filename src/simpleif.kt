/**
 * Created by SAINTEK 101 on 10/6/2017.
 */
fun main(args: Array<String>) {
    print("Masukkan nilai:")
    var nilai= readLine()!!.toDouble()

    if (nilai>=90){
        println("Kamu dapat nilai A")
    }
        else if(nilai <=50){
        println("Kamu dapat nilai D")
    }
    else {
        println("Kamu dapat nilai dibawah A")
    }
    println("Kamu memasukkan nilai $nilai")
}
