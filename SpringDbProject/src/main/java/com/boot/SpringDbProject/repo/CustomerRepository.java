package com.boot.SpringDbProject.repo;

import com.boot.SpringDbProject.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Long> {
    //public List<Customer> findByCustomer_Id(long customer_id);
//    public List<Customer> findCustomerByFirst(String first);

}
