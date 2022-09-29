package example.myapp


interface FishAction{
    fun eat()
}
interface FishColor{
    val color: String
}
object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction{
    override fun eat() {
        println(food)
    }
}

class Shark : FishColor,FishAction{

    override val color = "grey"
    override fun eat(){
        println("hunt and eat fish")
    }

}

class Plecotomus (fishColor : FishColor = GoldColor):FishAction by PrintingFishAction("eat aglae"), FishColor by fishColor{

}
