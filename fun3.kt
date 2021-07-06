fun shouldChangeWater (day: String, temprature:Int = 22,dirty: Int = 20): Boolean{
    return when{
        isTooHot(temprature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun feedTheFish1(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun main(args: Array<String>){
    feedTheFish1()
}