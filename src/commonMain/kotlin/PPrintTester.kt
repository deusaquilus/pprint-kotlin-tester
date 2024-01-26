import io.exoquery.pprint.PPrinter
import kotlinx.serialization.Serializable

@Serializable
data class Foo(val name: String)

fun doPPrint() {

    val pPrinter = PPrinter(Foo.serializer())
    println(pPrinter(Foo("hello, serialization")))

}
