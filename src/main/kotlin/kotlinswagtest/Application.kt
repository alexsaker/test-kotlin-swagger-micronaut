package kotlinswagtest

import io.micronaut.runtime.Micronaut
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(info = Info(title = "Hello World", version = "0.0", description = "My API", license = License(name = "Apache 2.0", url = "http://foo.bar"), contact = Contact(url = "http://google.com", name = "ALex", email = "saker.alexandre@gmail.com")))
object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("kotlinswagtest")
                .mainClass(Application.javaClass)
                .start()
    }
}