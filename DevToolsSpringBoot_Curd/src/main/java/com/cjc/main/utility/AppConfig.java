package com.cjc.main.utility;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.main.model.RegisterPage;

@EnableWebMvc
	@ComponentScan(basePackages="com.cjc.main")
	@Configuration
	public class AppConfig {
		@Bean
		public InternalResourceViewResolver viewResolver()
		{
			InternalResourceViewResolver irvr=new InternalResourceViewResolver();
			irvr.setSuffix(".jsp");
			return irvr;
		}
		
		
		@Bean
		public DriverManagerDataSource driverManager()
		{
			DriverManagerDataSource dmds=new DriverManagerDataSource();
			
			dmds.setDriverClassName("com.mysql.jdbc.Driver");
			dmds.setUrl("jdbc:mysql://localhost:3306/spring_devtool");;
			dmds.setUsername("root");
			dmds.setPassword("root");
			return dmds;
			
		}
		
		@Bean
		public LocalSessionFactoryBean localsession()
		{
			LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
			sf.setDataSource(driverManager());
			
			Properties p=new Properties();
			p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			p.setProperty("hibernate.hbm2ddl.auto", "update");
			sf.setAnnotatedClasses(RegisterPage.class);
			sf.setHibernateProperties(p);

			return sf;
			
			
		}
		

	}

