class Cat (val name: String, var age: Int, var weight: Int) {

    fun walk() {
        weight--
    }

    fun eat(amount: Int) {
        if (weight + amount >= 20) {
            throw IllegalArgumentException("Weight cannot exceed 20.")
        }
        weight += amount

    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
