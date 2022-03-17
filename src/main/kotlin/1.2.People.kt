fun main() {
    val likes = 62
    val correctness = if (likes % 2 == 0) {
        "Людям"
    } else "Человеку"

    print("Понравилось $likes $correctness")
}