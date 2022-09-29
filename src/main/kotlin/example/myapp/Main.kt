package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()


}
fun makeFish(){
    val shark = Shark()
    val plecotomus = Plecotomus()

    println("shark is ${shark.color}")
    shark.eat()
    println("plecotomus is ${plecotomus.color}")
    plecotomus.eat()



}

fun main() {
    makeFish()

}

