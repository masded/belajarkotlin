/**
 * Created by SAINTEK 101 on 10/17/2017.
 */
fun main(args: Array<String>) {
    var arraylist= ArrayList<String>()
    arraylist.add("dedy")
    arraylist.add("dwi")
    arraylist.add("arfiyanto")
    arraylist.add("jepara")

    println("first name:"+ arraylist.get(0))

    println("all element by object")
    for (item in arraylist){
        println(item)
    }

    arraylist.set(0, " unisnu jepara")

    println(" all element by index")
    for( index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    if( arraylist.contains("masded")){
        println( "name is found")
    }else{
        println( "name is not found")
    }
}