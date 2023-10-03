fun main (){

    val age = 22
    val name = "Karan"
    printCandles(age)
    printWholeCake(age)
    println(" ")
    println(" Happy Birthday $name")
}

fun printCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    print(" ")
    print("\n")
    print(" ")
    repeat(age){
        print("|")
    }
    print(" ")
    println("")
}
fun printWholeCake(age: Int){
    repeat(age + 2){
        print("=")

    }
    println("")
    repeat(age + 2){
        print("@")

    }
    println("")
    repeat(age + 2){
        print("&")

    }
    println("")
    repeat(age + 2){
        print("@")

    }
    println(" ")

}
