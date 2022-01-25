interface Demo
{
    fun start()
}

class Bike : Demo
{
    override fun start()
    {
        println("Bike Start")
    }
}

fun main ()
{
    val ob=Bike()
    ob.start()
}


