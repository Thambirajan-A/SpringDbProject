package com.boot.SpringDbProject.service;

import com.boot.SpringDbProject.entity.Customer;
import com.boot.SpringDbProject.repo.CustomerRepository;
import com.boot.SpringDbProject.repo.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionsRepository transactionsRepository;

//        public Customer addCustomer(Customer customer) throws RecordExistsException {
//            if (customerRepository.existsById((long)(customer.getCustomer_id()))){
//                throw new RecordExistsException("Customer exists");
//            }
//            return this.customerRepository.save(customer);
//        }
    public Customer addCustomer(Customer customer){
        return this.customerRepository.insert(customer);
}
    public Customer updateCustomer(Customer customer){
        return this.customerRepository.save(customer);  
    }
    public long getCustomersCount(){
            return  customerRepository.count();
        }
//        public Customer getCustomerbyId(long customer_id){
//        Optional<Customer> optcus = customerRepository.findById(customer_id);
//        return optcus.get();
//        }
//        public List<Customer> getCustomerByCustomer_Id(long customer_id){
//        return this.customerRepository.findByCustomer_Id(customer_id);
//        }
//    public List<Customer> getCustomerByFirstname(String first){
//        return this.customerRepository.findCustomerByFirst(first);}
    }


