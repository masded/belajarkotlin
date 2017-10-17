/**
 * Created by SAINTEK 101 on 10/17/2017.
 */
fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"dedy")
    map.put(2,"dwi")
    map.put(33,"arfiyanto")
    println(map.get(33))

    map.put(33, "unisnu jepara")
    for (k in map.keys){
        println(map.get(k))
    }
}