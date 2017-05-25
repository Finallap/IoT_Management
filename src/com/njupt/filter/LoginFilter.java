package com.njupt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(filterName="LoginFilter",urlPatterns="/*",
initParams={@WebInitParam(name="ignoreRegex",value="Login;Register;Logout;bootstrap;build;dist;font-awesome;ionicons;plugins;SensingDeviceSimulator")})
public class LoginFilter implements Filter {
	
	private String ignoreRegex;
	private String[] ignoreRegexArray;

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest http_request = (HttpServletRequest)request;
		HttpServletResponse http_response = (HttpServletResponse)response;
		
		HttpSession session = http_request.getSession();
		
		if(http_request.getRequestURI().indexOf("Login")!=-1&&session.getAttribute("username")!=null)
		{
			http_response.sendRedirect(http_request.getContextPath()+"/index");
			System.out.println("已经登录，跳转到首页");
			return;
		}
		
		for(int i = 0;i<ignoreRegexArray.length;i++){
			if(ignoreRegexArray[i]==null||"".equals(ignoreRegexArray[i]))continue;
			if(http_request.getRequestURI().indexOf(ignoreRegexArray[i])!=-1)
			{
				chain.doFilter(request, response);
//				System.out.println("放行");
				return;
			}
		}

		if(session.getAttribute("username")==null){
			http_response.sendRedirect(http_request.getContextPath()+"/Login");
			System.out.println(http_request.getRequestURI()+"不放行");
			return;
		}	
		else
			chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		ignoreRegex = fConfig.getInitParameter("ignoreRegex");
		if (ignoreRegex!=null) {
			ignoreRegexArray = ignoreRegex.split(";");
		}
		return;
	}

}
