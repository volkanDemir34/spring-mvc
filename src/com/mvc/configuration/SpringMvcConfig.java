package com.mvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.mvc.controller"})
//@ImportResource({"classpath:META-INF/spring/common-mvc-config.xml" })
public class SpringMvcConfig implements WebMvcConfigurer{
	 /*  @Override
	   public void addViewControllers(ViewControllerRegistry registry) {
	      registry.addViewController("/").setViewName("index");
	   }
	 */
	   @Bean
	   public ViewResolver viewResolver() {
	      InternalResourceViewResolver bean = new InternalResourceViewResolver();
	 
	      bean.setViewClass(JstlView.class);
	      bean.setPrefix("/WEB-INF/view/");
	      bean.setSuffix(".jsp");
	 
	      return bean;
	   }
	   
	   
	/*@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	    configurer.favorPathExtension(true).
	    favorParameter(false).
	    parameterName("mediaType").
	    ignoreAcceptHeader(false).
	    defaultContentType(MediaType.APPLICATION_JSON).
	    mediaType("xml", MediaType.APPLICATION_XML). 
	    mediaType("json", MediaType.APPLICATION_JSON); 
	}*/
	   
	   @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**");
	    }
	   
}
