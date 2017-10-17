/**
 * Created by SAINTEK 101 on 10/10/2017.
 */
fun main(args: Array<String>) {
    for(b in 1..5) {
        for(c in 4 downTo b){
            print(" ")
        }
        for (c in 1..b){
        print("*")
        }
    println()
}

    for(b in 1..5) {
        for(c in 1..b)
            print("*")
        println()
    }
}