import kotlin.random.Random

fun main(){
	val dieOne = Random.nextInt(1,7)
	val dieTwo = Random.nextInt(1,7)
	println("Rolling dice...")
	println("Die 1: $dieOne")
	println("Die 2: $dieTwo")
	println("Total value: ${dieOne + dieTwo}")
}
