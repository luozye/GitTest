package com.itheima.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo implements Filter
{
    public void init(FilterConfig filterConfig) throws ServletException
    {
        System.out.println("FilterDemo的init执行了");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        System.out.println("FilterDemo的doFilter执行了");

        //放行  链
        
    }

    public void destroy()
    {

    }
}

