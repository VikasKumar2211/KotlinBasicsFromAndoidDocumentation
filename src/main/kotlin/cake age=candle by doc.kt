fun main() {
    val age = 4
    val layers = 54
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}
fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}
fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) { //Nested repeat means repeat mei repeat just like nested class but we don't have to write nested here
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}