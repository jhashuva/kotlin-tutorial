//By default, filter is eager, and each time you use the filter, a list is created.
fun main(){
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    //eager creates new list
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")
}