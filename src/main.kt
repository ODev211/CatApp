fun main() {
    val binnie = Cat("Binnie", 10, 21) // Set to 21 to trigger max weight error catch
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 10)
    val daisy = Cat("Daisy", 2, 7)

    flathead.eat(1)
    flathead.eat(1)

    daisy.walk()
    daisy.walk()
    daisy.walk()
    daisy.walk()

    println(daisy)

    binnie.walk()
    clyde.walk()

    println(binnie)
    println(clyde)

    try {
        binnie.eat(2)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    clyde.eat(3)

    println(binnie)
    println(clyde)
}