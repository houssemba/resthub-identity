package org.resthub.identity.webapp.controller;

import org.resthub.identity.core.controller.impl.UserControllerImpl;
import org.resthub.identity.core.service.defaults.DefaultUserService;
import org.resthub.identity.model.User;
import org.resthub.identity.webapp.service.impl.MySuperUserService;
import org.springframework.context.annotation.Primary;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.AccessDeniedException;

/**
 * Front controller for User Management<br/>
 * Only ADMINS can access to the globality of this API<br/>
 * Specific permissions are given when useful
 */
@Controller
@RequestMapping("/api/user")
public class MyUserController extends UserControllerImpl<User, Long, MySuperUserService> {
    /**
     * Override this methods in order to secure it *
     */
    @Secured(value = "ROLE_OVERRIDEN")
    @Override
    public User create(@RequestBody User resource) {
        return super.create(resource);
    }

    @Override
    @Inject
    @Named("userService")
    public void setService(MySuperUserService userService) {
        super.setService(userService);
    }

}
