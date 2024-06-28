import kotlin.random.Random

fun main(){
  println("What is your name?")
	val name = readLine()
	println("Hello, $name!")
  
	val dieplayer = Random.nextInt(1,7)
	val diecpu = Random.nextInt(1,7)
	println("Rolling dice...")
	println("Die 1: $dieplayer")
	println("Die 2: $diecpu")
	println("Total value: ${dieplayer + diecpu}")

	if(dieOne > dieTwo){
		println("$name won!")
	}else{
		println("$name lost")
	}
}
