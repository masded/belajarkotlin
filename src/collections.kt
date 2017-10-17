/**
 * Created by SAINTEK 101 on 10/17/2017.
 */
fun main(args: Array<String>) {
    var map= hashMapOf("nama_depan" to "dedy", "nama_tengah" to "dwi")
    map.put("nama_belakang", "arfiyanto")
    println(map.get("nama_belakang"))
    println(map["nama_belakang"])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])
    var list = mutableListOf(11,22,33,22)
    list[0]=22
    for (item in list){
        println(item)
    }
}