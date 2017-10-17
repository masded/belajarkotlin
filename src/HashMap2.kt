/**
 * Created by SAINTEK 101 on 10/17/2017.
 */
fun main(args: Array<String>) {
    var map = HashMap<String, String>()
    map.put("nama_depan", "dedy")
    map.put("nama_tengah", "dwi")
    map.put("nama_belakang", "arfiyanto")
    println(map.get("nama_depan"))

    map.put("nama_tengah", "unisnu jepara")
    for (k in map.keys) {
        println(k + " " + map.get(k))
    }
}