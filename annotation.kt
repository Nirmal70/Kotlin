class Phone
{
    @Deprecated("Instead of this function use smartcamera",ReplaceWith("smartcamera"))
    fun camera()
    {
        println("I am Camera")
    }
    fun smartcamera()
    {
        println("I am SmartCamera")
    }
}

fun main()
{
    val ob=Phone()
    ob.camera()
    ob.smartcamera()

}