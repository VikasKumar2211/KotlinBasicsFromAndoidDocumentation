import javax.swing.border.Border

fun main() {
    val Border = "%"
    printBorder3(Border)
    println("Happy Birthday, Jhansi!")
    printBorder3(Border)
}

fun printBorder3(Border: String) {
    repeat(23) {
        print(Border)
    }
    println()
}