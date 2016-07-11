package auth0.grails3.mvc.sample

import com.auth0.web.Auth0CallbackHandler
import org.springframework.beans.factory.annotation.Autowired

class CallbackController {

    static defaultAction = "callback"

    @Autowired
    Auth0CallbackHandler callback

    def callback() {
        callback.handle(request, response)
    }
}
