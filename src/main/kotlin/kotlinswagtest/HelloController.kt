package kotlinswagtest

import io.micronaut.http.MediaType
import javax.validation.constraints.NotBlank
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Controller
import io.micronaut.validation.Validated
import io.reactivex.Single


@Controller("/")
@Validated
class HelloController {

    /**
     * @param name The person's name
     * @return The greeting
     */
    @Get(uri = "/hello/{name}", produces = [MediaType.TEXT_PLAIN])
    fun hello(@NotBlank name: String): Single<String> {
        return Single.just("Hello $name!")
    }
}