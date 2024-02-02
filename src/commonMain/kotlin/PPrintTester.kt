import io.exoquery.kmp.pprint.PPrinter
import kotlinx.serialization.Serializable

@Serializable
data class Foo(val name: String)

fun doPPrint() {

    val pprinter = PPrinter(Foo.serializer())
    println(pprinter(Foo("hello, serialization")))

}
