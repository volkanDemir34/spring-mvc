package com.mvc.configuration;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.WebSphereDataSourceAdapter;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.jndi.JndiObjectTargetSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Import(value = { SecurityConfig.class })
@Configuration
@ComponentScan({"com.mvc.service","com.mvc.dao","com.mvc.component"})
@EnableTransactionManagement
@EnableJpaRepositories({"com.mvc.dao"}) // jpa aktif
@EnableAsync // yenit thread yaratma
@PropertySource(value = { "classpath:application.properties" }) // property
public class SpringRootConfig {
	
	@Autowired
	Environment environment; // propertielere ulaşma
	
    @Autowired
    private ApplicationContext context;

	
	/*@Bean
	DataSource dataSource() { // Datasource yaratma
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl(environment.getProperty("url"));
		ds.setUsername(environment.getProperty("user"));
		ds.setPassword(environment.getProperty("password"));
		ds.setDriverClassName(environment.getProperty("driver"));
		return ds;
	}*/
	
	 @Bean
	    public DataSource dataSource() throws IllegalArgumentException, NamingException{
	        JndiObjectFactoryBean jndiObjectFactoryBean =new JndiObjectFactoryBean();
	        jndiObjectFactoryBean.setJndiName("jdbc/VolkanDB");
	        jndiObjectFactoryBean.setResourceRef(true);
	        jndiObjectFactoryBean.setProxyInterface(DataSource.class);
	        jndiObjectFactoryBean.afterPropertiesSet();
	        return (DataSource) jndiObjectFactoryBean.getObject();
	    }

	@Bean
	@Primary
	LocalContainerEntityManagerFactoryBean  entityManagerFactory() throws NamingException { // 
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter()); // Jpa vendor implementation
		emf.setPackagesToScan("com.mvc.model"); // entity tarama
		emf.setJpaProperties(hibernateProps()); // dialect, show_sql,ddl,session_context ,????
		return emf;
	}
	
	@Bean
	PlatformTransactionManager transactionManager(EntityManagerFactory  emf) throws NamingException {  //Transaction manager
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}
	

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
	@Bean
	SessionFactory sessionFactory() throws NamingException {
		return entityManagerFactory().getNativeEntityManagerFactory().unwrap(SessionFactory.class);
	}
	
	@Bean
	Session session() throws NamingException {
		return entityManagerFactory().getNativeEntityManagerFactory().createEntityManager().unwrap(Session.class);
	}
	
	
	Properties hibernateProps() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.default_schema", "mvc");
		properties.setProperty("hibernate.current_session_context_class",  "com.mvc.component.HibernateSessionInEntityManager");
		properties.setProperty("hibernate.cache.use_second_level_cache", "true");
		properties.setProperty("hibernate.cache.use_query_cache", "true");
		properties.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");
		properties.setProperty("javax.persistence.sharedCache.mode", "ENABLE_SELECTIVE");
		return properties;
	}
	
	
	

}
