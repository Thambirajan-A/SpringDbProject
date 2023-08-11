package com.boot.SpringDbProject.service;

import com.boot.SpringDbProject.entity.Customer;
import com.boot.SpringDbProject.exception.RecordExistsException;
import com.boot.SpringDbProject.repo.CustomerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public long getCustomersCount(){
        return  customerRepository.count();
    }
    public void addCustomer(Customer customer){
        this.customerRepository.insert(customer);}
    public long deleteById(int customerid){
        return this.customerRepository.deleteCustomerBycustomerid(customerid);}
//    public long deleteByFirstName(String first){
//        return this.customerRepository.deleteCust(first);}
////        Customer deletedcustomer =customerRepository.findBycustomerid(customerid);
//////        ObjectId _id=deletedcustomer.get_id();
//////        customerRepository.deleteById(_id);
////        customerRepository.delete(deletedcustomer);
//    }

//        public Customer addCustomer(Customer customer) throws RecordExistsException {
//            if (customerRepository.existsById((long)(customer.getCustomer_id()))){
//                throw new RecordExistsException("Customer exists");
//            }
//            return this.customerRepository.save(customer);
//        }

//    public Customer updateCustomer(Customer customer){
//        return this.customerRepository.save(customer);
//    }

//        public Customer getCustomerbyId(long customer_id){
//        Optional<Customer> optcus = customerRepository.findById(customer_id);
//        return optcus.get();
//        }
//        public List<Customer> getCustomerByCustomer_Id(long customer_id){
//        return this.customerRepository.findByCustomer_Id(customer_id);
//        }
//    public Customer getCustomerByFirstname(String first){
//        Optional<Customer> opt = customerRepository.findCustomerByFirst(first);
//        return opt.get(); }
//    public List<Customer> getCustomersByGender(String gender) {
//        return this.customerRepository.findCustomerBygender(gender);
//    }
    public Customer getCustomerByCustomerId(int customerid){
        return this.customerRepository.findBycustomerid(customerid);
    }
    public List<Customer> getCustomerByfirst(String first){
        return this.customerRepository.findCustomerByfirst(first);}
//        return opt.get(); }
    }


