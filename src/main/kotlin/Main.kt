import org.antlr.v4.runtime.ANTLRFileStream
import org.antlr.v4.runtime.CommonTokenStream

const val root = "C:\\Users\\alles\\OneDrive\\Documents\\KotlinProjects\\Lemon\\src\\main\\antlr\\test.lemon"

fun main() {
    val input = ANTLRFileStream(root)

    val lexer = LemonLexer(input)
    val parser = LemonParser(CommonTokenStream(lexer))

    val visitor = MyLemonVisitor()
    val result = visitor.visit(parser.declaration())
    println("result = $result")
}