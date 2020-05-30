

class MyClass {
var a = 6

    companion object{
        //a = 4
    }
    val school = listOf("mackerel", "trout", 3)
    fun print(){

    }



}

fun main(args: Array<String>) {
    var obj = MyClass()
    println(obj)

    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    // loops

    

}