package es.acm.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

@Component
public class AfterLoginFilter extends GenericFilterBean {
 
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			if(auth.getPrincipal() != null && auth.getPrincipal().getClass().equals(User.class)) {
				User user = (User)auth.getPrincipal();
				System.out.println(user.getUsername());
			}
			else
				System.out.println(auth.getPrincipal());
		}
		chain.doFilter(request, response);
    }
}

