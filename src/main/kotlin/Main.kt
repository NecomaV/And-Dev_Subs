import java.util.*

fun main(args: Array<String>) {
    swim()
    swim("slow")
    swim(speed="turtle-like")
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}