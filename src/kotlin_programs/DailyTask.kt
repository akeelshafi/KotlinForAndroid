package kotlin_programs

class DailyTask {

    fun wakeUp(){
        println("Waking up in the morning")
    }
    fun bath(){
        println("Taking bath...")
    }
    fun ready(){
        println("Getting ready...")
    }
    fun study(){
        println("studying in college")
    }
    fun backToHome(){
        println("Back to Home")
    }

}
fun main(){
  val  akeel = DailyTask()
    akeel.wakeUp()
    akeel.bath()
    akeel.ready()
    akeel.backToHome()

    println("===========================================================================")

    val furkan = DailyTask()
    furkan.wakeUp()
    furkan.ready()
    furkan.study()
    furkan.backToHome()

}