package com.mvc.configuration;

import javax.servlet.Filter;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.mvc.filter.SpringFilter;

public class SpringWebMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SpringRootConfig.class ,SecurityConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringMvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	/*
	 * @Override protected javax.servlet.Filter[] getServletFilters() {
	 * DelegatingFilterProxy delegateFilterProxy = new DelegatingFilterProxy();
	 * delegateFilterProxy.setTargetBeanName("springSecurityFilterChain");
	 * CharacterEncodingFilter characterEncodingFilter = new
	 * CharacterEncodingFilter(); characterEncodingFilter.setEncoding("UTF-8");
	 * characterEncodingFilter.setForceEncoding(true); return new Filter[]
	 * {delegateFilterProxy ,characterEncodingFilter}; }
	 */

	@Override
	protected javax.servlet.Filter[] getServletFilters() {

		return new Filter[] { new SpringFilter() };
	}

}