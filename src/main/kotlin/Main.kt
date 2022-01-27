/**
Creator: Zohidjon Akbarov
 */
fun main() {
    val outerClass = OuterClass()
    val nestedClass = OuterClass.NestedClass()
    val innerClass = outerClass.InnerClass()
}

class OuterClass(){
  private val outerString = "This is the outer string"
    fun printMe(){
        println(outerString)
    }
    fun callPrintMe(){
        printMe()
    }
    // nested class outer classni ichida bo'lgani bilan
    // outer classni fun va variable larga ruxsati yo'q
    class NestedClass(){
        val nestedString = "Bu nested class string"
        fun printNestedFun(){
           println(nestedString)
        }
    }
    // inner class outer classdagi propertiesga ruxsati bor hamma fun va variable larni chaqira oladi
    inner class InnerClass(){
        val innerString = "This is the inner class string"
        fun callOuterClassFun(){
           println(outerString)
        }
    }

}
