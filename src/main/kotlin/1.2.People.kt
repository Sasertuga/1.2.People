fun main() {
    val likes = 1
    val correctness = if (likes % 10 !== 1 || likes % 100 == 11) "Людям" else "Человеку"

    println("Понравилось $likes $correctness")

}