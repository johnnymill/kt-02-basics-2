fun main() {
    val likes: ULong = 121uL

    println("Понравилось $likes ${if (likes % 10u == 1uL && likes % 100u != 11uL) "человеку" else "людям"}")
}