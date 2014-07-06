package org.resthub.identity.webapp.util;


import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Houssem on 06/07/2014.
 */
public class NonAjaxRequestMatcher implements RequestMatcher {
    @Override
    public boolean matches(HttpServletRequest request) {
        return !"XmlHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"));
    }
}