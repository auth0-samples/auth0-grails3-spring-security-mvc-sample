package auth0.grails3.mvc.sample

import com.auth0.spring.security.mvc.Auth0Config
import groovy.util.logging.Log4j
import org.springframework.beans.factory.annotation.Autowired

@Log4j
class LogoutController {

    static defaultAction = "logout"

    @Autowired
    Auth0Config auth0Config

    def logout() {
        log.info("Performing logout")
        if (request.getSession(false)) {
            request.session.invalidate()
        }
        redirect(uri: auth0Config.onLogoutRedirectTo)
    }

}
