package com.boot.SpringDbProject;

import com.boot.SpringDbProject.entity.Customer;
import com.boot.SpringDbProject.exception.RecordExistsException;
import com.boot.SpringDbProject.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class SpringDbProjectApplication {

	public static void main(String[] args) throws ParseException, RecordExistsException {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDbProjectApplication.class, args);
		CustomerService customerService=context.getBean(CustomerService.class);
		//System.out.println(customerService.addCustomer(new Customer("hi","helo","M","Electrician", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1970"),984)));
		System.out.println(customerService.getCustomersCount());
		//System.out.println(customerService.getCustomerbyId(934));
		//System.out.println(customerService.getCustomerByCustomer_Id(93));
//		for (Customer customer: customerService.getCustomerByFirstname("hi")){
//		System.out.println(customer);}
		//System.out.println(customerService.getCustomerByFirstname("Aaron"));
		}
	}


