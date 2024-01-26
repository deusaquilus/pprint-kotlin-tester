import io.exoquery.pprint.PPrinterReflect

fun main() {
    doPPrint()

    data class Bar(val name: String)

    val pprintReflect = PPrinterReflect()
    println(pprintReflect(Bar("hello, reflect")))
}
