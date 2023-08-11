package com.boot.SpringDbProject;

import com.boot.SpringDbProject.entity.Customer;
import com.boot.SpringDbProject.exception.RecordExistsException;
import com.boot.SpringDbProject.service.CustomerService;
import com.boot.SpringDbProject.service.TransactionService;
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
		TransactionService transactionService=context.getBean(TransactionService.class);

		//Customer actions
		//Count
		System.out.println(customerService.getCustomersCount());
		//Addition of Customer
		//customerService.addCustomer(new Customer("hi","helo","M","Electrician", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1970"),985));
		//Deletion of Customer
		System.out.println(customerService.deleteById(985));
		//System.out.println(customerService.getCustomerbyId(934));
		//System.out.println(customerService.getCustomerByCustomer_Id(93));
//		for (Customer customer: customerService.getCustomerByFirstname("hi")){
//		System.out.println(customer);}
		//System.out.println(customerService.getCustomerByFirstname("hi"));
		//System.out.println(customerService.getCustomerByFirstname("Aaron"));
//		for (Customer customer: customerService.getCustomersByGender("M")){
//		System.out.println(customer);}
		System.out.println(customerService.getCustomerByCustomerId(1).getFirst());
//		for (Customer customer: customerService.getCustomerByfirst("Adam")){
//		System.out.println(customer.getLast());}

		//Transaction actions
		System.out.println(transactionService.getTransactionsCount());
	}
	}


