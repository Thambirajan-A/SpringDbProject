package com.boot.SpringDbProject.repo;

import com.boot.SpringDbProject.entity.Customer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, ObjectId> {
    //public List<Customer> findByCustomer_Id(long customer_id);
//    public Optional<Customer> findCustomerByFirst(String first);
//    public List<Customer> findCustomerBygender(String gender);

    public Customer findBycustomerid(int customerid);
    public List<Customer> findCustomerByfirst(String first);

    public Long deleteCustomerBycustomerid(int customerid);
    public Long deleteCustomerByfirst(String first);


}
