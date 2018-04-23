package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import org.springframework.stereotype.Service;

@Service("prodService")
@PropertySource("classpath:names.properties")
public class ProdServiceImpl {

	private String empName;

	@Autowired
	private Environment env;

	@Autowired
	private ProductImpl prodImpl;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Bean
	public ProductImpl getProduct() {
		System.out.println("--- get Product Method");
		setEmpName(env.getProperty("empName"));
		// System.out.println("Name: "+env.getProperty("empName"));
		return prodImpl;
	}

	/*
	 * @Bean public PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer()
	 * {
	 * 
	 * PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
	 * ppc.setLocation(new ClassPathResource("names.properties"));
	 * 
	 * ppc.setIgnoreUnresolvablePlaceholders(true); System.out.println(ppc);
	 * System.out.println("Name: "+env.getProperty("empName"));
	 * 
	 * 
	 * return ppc; }
	 */

}
