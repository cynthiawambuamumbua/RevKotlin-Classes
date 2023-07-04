fun main(){

    val design1 = FabricDesign(30, "happy")
    println(design1.pattern)

    val design2 = FabricDesign(5, "sad")
    println(design2.pattern)

}
class FabricDesign(val temperature: Int, val mood: String) {
    val pattern: String = generatePattern()

    private fun generatePattern(): String {
        return when {
            temperature > 25 && mood == "happy" -> "sunflowers"
            temperature < 10 && mood == "happy" -> "snowflakes"
            temperature > 25 && mood == "sad" -> "fireworks"
            temperature < 10 && mood == "sad" -> "pine trees"
            else -> "plain"
        }
    }
}
class MigrationForecast {
    var weather: String = ""
    var riverLevels: String = ""
    var predatorLocations: MutableList<String> = mutableListOf()
    var animals: MutableList<Animal> = mutableListOf()

    fun addAnimal(animal: Animal) {
        animals.add(animal)
    }

    fun getMigrationForecast() {
        for (animal in animals) {
            if (animal.shouldMigrate(weather, riverLevels, predatorLocations)) {
                println("${animal.species} is predicted to migrate.")
            } else {
                println("${animal.species} is predicted to stay.")
            }
        }
    }
}


